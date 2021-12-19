package by.gbyzzz.task02javaarrays.view;

import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;

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

    private String correctInputMsg = "Please input № of task";
    public void mainMenu() {
        io.output(current.getString("mainMenuStr"));
        io.output(current.getString("correctInputMsg"));
    }
    public void arrayMenu() {
        io.output(current.getString("arrayMenuStr"));
        io.output(current.getString("correctInputMsg"));
    }
    public void matrixMenu() {
        io.output(current.getString("matrixMenuStr"));
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
