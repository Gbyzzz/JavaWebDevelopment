package by.gbyzzz.task02javaarrays.controller;

public enum CommandName {
    BUBBLE_SORT(1),
    SHAKE_SORT(2),
    SELECT_SORT(3),
    INSERT_SORT(4),
    SHELL_SORT(5),
    MERGE_SORT(6);

    public final int value;

    CommandName(final int value) {
        this.value = value;
    }
    static CommandName getValue(int value) {
        for(CommandName e: CommandName.values()) {
            if(e.value == value) {
                return e;
            }
        }
        return null;
    }
}
