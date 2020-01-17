# Comment Header Maker
A simple program that produces a code comment header given a title and width.

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
printHeader("eve", 20);
```
/\*----- even ------\*/

```
printHeader("antidisestablishmentarianism", 0);
```
The title "antidisestablishmentarianism" is too long. Use a shorter title or a wider header.

## To Do:
- [ ] Add parameter to change style e.g. // rather than /* */
