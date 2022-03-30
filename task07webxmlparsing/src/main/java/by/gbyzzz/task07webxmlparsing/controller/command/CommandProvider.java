package by.gbyzzz.task07webxmlparsing.controller.command;

import by.gbyzzz.task07webxmlparsing.controller.command.impl.DOMImpl;
import by.gbyzzz.task07webxmlparsing.controller.command.impl.SAXImpl;
import by.gbyzzz.task07webxmlparsing.controller.command.impl.StAXImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class CommandProvider {
    private static final Logger LOGGER = LogManager.getLogger();
    private final Map<CommandName, Command> repository = new HashMap<>();
        public CommandProvider() {
            repository.put(CommandName.DOM, new DOMImpl());
            repository.put(CommandName.SAX, new SAXImpl());
            repository.put(CommandName.STAX, new StAXImpl());
        }
    public Command getCommand(String request) {

        CommandName commandName = CommandName.valueOf(request.toUpperCase(Locale.ROOT));
        Command command = null;
        LOGGER.trace("getting command from repository");
            command = repository.get(commandName);

        return command;
    }
}
