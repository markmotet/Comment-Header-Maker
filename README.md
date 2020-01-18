# Comment Header Maker
A simple program that produces a code comment header given a title and width. It throws a "titleTooLongException" if the title length does not fit within the width.

## Samples
```
printHeader("dependencies", 40);
```
/\*----------- dependencies ------------\*/

```
printHeader("variables & constants", 40);
```
/\*------- variables & constants -------\*/

```
printHeader("functions", 40);
```
/\*------------- functions -------------\*/

```
printHeader("classes", 40);
```
/\*-------------- classes --------------\*/

```
printHeader("odd", 20);
```
/\*------ odd ------\*/

```
printHeader("even", 20);
```
/\*----- even ------\*/

```
printHeader("antidisestablishmentarianism", 20);
```
The title "antidisestablishmentarianism" is too long. Use a shorter title or a wider header.

## To Do:
- [ ] Add parameter to change style e.g. // rather than /* */
