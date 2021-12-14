package by.gbyzzz.task02javaarrays.controller;

public enum CommandName {

    MENU_ARR(new int[]{1, 0}),
    MENU_MATRIX(new int[]{2, 0}),
    BUBBLE_SORT(new int[]{1, 1}),
    SHAKE_SORT(new int[]{1, 2}),
    SELECT_SORT(new int[]{1, 3}),
    INSERT_SORT(new int[]{1, 4}),
    SHELL_SORT(new int[]{1, 5}),
    MERGE_SORT(new int[]{1, 6}),
    MATRIX_SUM(new int[]{2, 1}),
    MATRIX_SUB(new int[]{2, 2}),
    MATRIX_MULT(new int[]{2, 3}),
    MATRIX_MULT_NUM (new int[]{2, 4}),
    MATRIX_DIV(new int[]{2, 5}),
    MATRIX_TRANSP(new int[]{2, 6});





    public final int[] value;

    CommandName(final int[] value) {
        this.value = value;
    }



    static CommandName getValue(int[] value) {
        for(CommandName e: CommandName.values()) {
            int[] temp = e.value;
            if(temp[0] == value[0] && temp[1] == value[1]) {
                return e;
            }
        }
        return null;
    }
}
