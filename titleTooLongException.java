public class titleTooLongException extends Exception {
    String theLongTitle;
    public titleTooLongException(String title) {
        theLongTitle = title;
    }
    public String getMessage() {
            return "The title " + "\"" + theLongTitle + "\" is too long. Use a shorter title or a wider header.";
    }
}