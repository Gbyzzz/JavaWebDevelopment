package by.gbyzzz.task03classes.controller;

import by.gbyzzz.task03classes.controller.command.Command;
import by.gbyzzz.task03classes.controller.impl.find.FindFlowerByFreshnessImpl;
import by.gbyzzz.task03classes.controller.impl.find.FindFlowerByPriceImpl;
import by.gbyzzz.task03classes.controller.impl.find.FindFlowerByStemLengthImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private static final Logger LOGGER = LogManager.getLogger();
    private final Map<CommandName, Command> repository = new HashMap<>();
        CommandProvider() {
            repository.put(CommandName.FIND_FLOWER_FRESHNESS, new FindFlowerByFreshnessImpl());
            repository.put(CommandName.FIND_FLOWER_PRICE, new FindFlowerByPriceImpl());
            repository.put(CommandName.FIND_FLOWER_STEM_LENGTH, new FindFlowerByStemLengthImpl());

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
