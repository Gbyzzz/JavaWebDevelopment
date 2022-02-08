package by.gbyzzz.task05multithreading.controller;

enum MenuSelection {
    SELECT_ONE(1),
    SELECT_TWO(2),
    SELECT_THREE(3),
    SELECT_FOUR(4),
    SELECT_FIVE(5),
    SELECT_SIX(6),
    SELECT_SEVEN(7),
    SELECT_EIGHT(8),
    SELECT_NINE(9);

    private final int value;

    static int getValue (MenuSelection selection) {
       return selection.value;
    }
    MenuSelection(int value) {
        this.value = value;
    }
}
