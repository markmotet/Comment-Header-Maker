public class commentHeaderMaker {

    public static void printHeader(String title, int headerWidth) {

        try {
            int correctedWidth = headerWidth;
            correctedWidth -= 6;
            if (title.length() > correctedWidth) {
                throw new titleTooLongException(title);
            }

            // First line
            System.out.print("/*");
            for (int i = 0; i <  correctedWidth / 2 - title.length()/2; i++) {
                System.out.print("-");
            }

            // Padding
            System.out.print(" " + title + " ");

            // Second line
            if (title.length() % 2 == 0) {
                System.out.print("-");
            }
            for (int i = 0; i < correctedWidth / 2 - title.length()/2; i++) {
                System.out.print("-");
            }
            System.out.println("*/");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        printHeader("dependencies", 40);
        printHeader("variables & constants", 40);
        printHeader("functions", 40);
        printHeader("classes", 40);
        printHeader("odd", 20);
        printHeader("even", 20);
        printHeader("antidisestablishmentarianism", 20);
    }
}