package by.gbyzzz.task01javalinear.controller.taskthreeimpl;

import by.gbyzzz.task01javalinear.entity.Data;
import by.gbyzzz.task01javalinear.service.GuessService;
import by.gbyzzz.task01javalinear.view.IOData;

public class Guess {
    Data in = new Data();
    Data rand = new Data();
    Data rightGuess = new Data();
    Data wrongGuess = new Data();
    Data notGuessed = new Data();
    IOData io = new IOData();
    GuessService gs = new GuessService();

    public void input(int i){
        switch (i){
            case 1: io.output("Enter your first guess:");
                in.add(io.input(1,15));
                io.output("Enter your second guess:");
                in.add(io.input(1,15));
                io.output("Enter your third guess:");
                in.add(io.input(1,15));
                io.output("Enter your forth guess:");
                in.add(io.input(1,15));
                io.output("Enter your fifth guess:");
                in.add(io.input(1,15));
                break;
            case 2:
                break;
            case 3: //in.add(XMLIn);
                break;
            default: break;
        }

    }

    public void calculations() {
        for(int i = 0; i<5; i++){
        rand.add(gs.random(15));
        }

        for(int i = 0; i<5; i++){
            if(gs.rightGuess( in.getInt(i), rand) == 1)
                rightGuess.add(in.getInt(i));
            else
                wrongGuess.add(in.getInt(i));
        }

        for(int i = 0; i<5; i++){
            if(gs.notGuessed( rand.getInt(i),in) == 1)
                notGuessed.add(rand.getInt(i));
        }
    }

    public void consoleOutput() {
        io.output("Guessed numbers: ");
        for (int i = 0; i < rand.size(); i++) {
            io.output(rand.getInt(i));
        }

        io.output("Right guesses: ");
        for (int i = 0; i < rightGuess.size(); i++) {
            io.output( rightGuess.getInt(i));
        }

        io.output("Wrong guesses: ");
        for (int i = 0; i < wrongGuess.size(); i++) {
            io.output( wrongGuess.getInt(i));
        }

        io.output("Not guessed: ");
        for (int i = 0; i < notGuessed.size(); i++) {
            io.output(notGuessed.getInt(i));
        }

        rand.clear();
        rightGuess.clear();
        wrongGuess.clear();
        notGuessed.clear();
        in.clear();
    }
}
