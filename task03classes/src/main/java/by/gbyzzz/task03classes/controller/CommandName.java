package by.gbyzzz.task03classes.controller;

public enum CommandName {

    MAKE_BOUQUET_BY_FLOWER_TYPE(new int[]{1, 0}),
    MAKE_BOUQUET_BY_COLOR(new int[]{2, 0}),
    MAKE_BOUQUET_BY_STEM_LENGTH(new int[]{3, 0}),
    FIND_FLOWER_BY_STEM_LENGTH(new int[]{0, 2}),
    SORT_BY_FRESHNESS(new int[]{0, 1});

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