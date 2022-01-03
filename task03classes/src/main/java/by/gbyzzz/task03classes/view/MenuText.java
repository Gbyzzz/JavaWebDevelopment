package by.gbyzzz.task03classes.view;

import by.gbyzzz.task03classes.view.factory.ViewFactory;

import java.text.MessageFormat;

/**
 * This class contains menu outputs.
 * @author Anton Pinchuk
 *
 */

public final class MenuText {
    private ViewFactory viewFactory = ViewFactory.getInstance();
    private IOData io =  viewFactory.getIoData();
    private MessageManager current = MessageManager.setLocale();

    public void bouquetMakeMenu() {
        io.output(current.getString("bouquetMakeMenuStr"));
        io.output(current.getString("correctInputMsg"));
    }
    public void bouquetMenu() {
        io.output(current.getString("bouquetMenuStr"));
        io.output(current.getString("correctInputMsg"));
    }

    public void backMenu() {
        io.output(current.getString("backMenuStr"));
    }
    public void inputNum() {
        io.output("inputNumStr");
    }
    public void invalidInput(final int min, final int max) {

        String message = current.getString("invalidInputStr");
        String[] args = {String.valueOf(min), String.valueOf(max)};
        MessageFormat messageForm = new MessageFormat(message);
        String result = messageForm.format(args);
        io.output(result);

    }
}
