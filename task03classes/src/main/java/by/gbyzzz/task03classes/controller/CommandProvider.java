package by.gbyzzz.task03classes.controller;

import by.gbyzzz.task03classes.controller.command.Command;
import by.gbyzzz.task03classes.controller.impl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private static final Logger LOGGER = LogManager.getLogger();
    private final Map<CommandName, Command> repository = new HashMap<>();
    CommandProvider() {
        repository.put(CommandName.MAKE_BOUQUET_BY_FLOWER_TYPE, new MakeBouquetByFlowerTypeImpl());
        repository.put(CommandName.MAKE_BOUQUET_BY_COLOR, new MakeBouquetByColorImpl());
        repository.put(CommandName.MAKE_BOUQUET_BY_STEM_LENGTH, new MakeBouquetByStemLengthImpl());
        repository.put(CommandName.FIND_FLOWER_BY_STEM_LENGTH, new FindFlowerByStemLengthImpl());
        repository.put(CommandName.SORT_BY_FRESHNESS, new SortBouquetByCutDateImpl());
    }
    Command getCommand(final int[] select) {

        CommandName commandName = null;
        Command command = null;
        LOGGER.trace("getting command name");
        commandName = CommandName.getValue(select);
        LOGGER.trace("getting command from repository");
        command = repository.get(commandName);

        return command;
    }
}
