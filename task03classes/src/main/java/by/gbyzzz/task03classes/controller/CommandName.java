package by.gbyzzz.task03classes.controller;

public enum CommandName {

    MENU_ARR(new int[]{1, 0}),
    MENU_MATRIX(new int[]{2, 0}),
    BUBBLE_SORT(new int[]{1, 1}),
    SHAKE_SORT(new int[]{1, 2}),
    SELECT_SORT(new int[]{1, 3}),
    INSERT_SORT(new int[]{1, 4}),
    INSERT_ADDRESS_SORT(new int[]{1, 5}),
    MERGE_SORT(new int[]{1, 6}),
    SHELL_SORT(new int[]{1, 7}),
    EXTERNAL_SORT(new int[]{1, 8}),
    MATRIX_ADDITION(new int[]{2, 1}),
    MATRIX_SUBTRACTION(new int[]{2, 2}),
    MATRIX_MULTIPLICATION(new int[]{2, 3}),
    MATRIX_EXPONENTIATION(new int[]{2, 4}),
    MATRIX_MULTIPLICATION_NUM(new int[]{2, 5}),
    MATRIX_TRANSPOSE(new int[]{2, 6});

    private final int[] value;

    CommandName(final int[] value1) {
        this.value = value1;
    }

    static CommandName getValue(final int[] value1) {
        for (CommandName e: CommandName.values()) {
            int[] temp = e.value;
            if (temp[0] == value1[0] && temp[1] == value1[1]) {
                return e;
            }
        }
        return null;
    }
}
