# HelloToast Enhancements - Nour Mousa Al Haloul

Mobile App Development 1 (MOB1), Assignment 1. Instructor: Ibrahim O. Kaware.

Starter project: https://github.com/iokaware/Mobile-App-Development-1/tree/main/HelloToast

Changes:
1. activity_main.xml: the Toast and Count buttons are on the left side of the count TextView (text_display_count). A new Zero button (button_zero) sits between them. The three buttons are a vertical chain between the top and bottom edges of the TextView.
2. Zero button: gray when the app starts; clicking it sets the count back to 0 and its color back to gray.
3. Count button: green when the new count is odd, blue when it is even. After a count the Zero button turns orange.
4. Landscape: res/layout-land/activity_main.xml. The count is kept when the screen rotates.

Colors are in res/values/colors.xml (gray, orange, green, blue).
