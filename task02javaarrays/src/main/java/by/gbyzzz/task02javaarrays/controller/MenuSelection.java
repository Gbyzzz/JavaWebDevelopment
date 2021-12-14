package by.gbyzzz.task02javaarrays.controller;

enum MenuSelection {
    SELECT_ONE (1),
    SELECT_TWO (2),
    SELECT_THREE (3),
    SELECT_FOUR (4),
    SELECT_FIVE (5),
    SELECT_SIX (6),
    SELECT_SEVEN (7),
    SELECT_EIGHT (8);

    public final int value;

    MenuSelection(int value) {
        this.value = value;
    }
}
