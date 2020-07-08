package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class Checkbox extends Question  {
    private ArrayList choices;

    public Checkbox(String question, ArrayList<String> choices, String answer) {
        super(question, answer);

        this.choices = choices;
    }
}
