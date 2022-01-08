package by.gbyzzz.task03innerclasses.controller;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Please enter new note:");
        Scanner in = new Scanner(System.in);
        String newNote = in.nextLine();
        Notepad.Note notepad = new Notepad().new Note();
        notepad.addNote(newNote);
        notepad.output();
    }
}