package by.gbyzzz.task03innerclasses.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public class Notepad {
    private static Scanner scanner = new Scanner(System.in);

    public Notepad() {
    }

    public class Note {

        private static HashMap<Date, HashMap<Integer, String>> notepad = new HashMap<>();

        private String noteText;


        public void output() {
            for (Map.Entry<Date, HashMap<Integer, String>> dateNotes : notepad.entrySet()) {
                System.out.println("Date: " + dateNotes.getKey() + ":");
                for (Entry<Integer, String> innerEl : dateNotes.getValue().entrySet()) {
                    System.out.println(innerEl.getKey() + ") Note: " + innerEl.getValue().toString());
                }
            }
        }

        public void addNote(String noteText) {
            try {
                if(notepad.containsKey(getDate())) {
                    HashMap<Integer, String> note = new HashMap<>();
                    Integer id = notepad.get(getDate()).size();
                    note.put(id + 1, noteText);
                }else {
                    HashMap<Integer, String> note = new HashMap<>();
                    note.put(1, noteText);
                    notepad.put(getDate(), note);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        public static Date getDate()
                throws ParseException {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.parse(formatter.format(new Date()));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Note note = (Note) o;
            return Objects.equals(noteText, note.noteText);
        }

        @Override
        public int hashCode() {
            return Objects.hash(noteText);
        }
    }


}