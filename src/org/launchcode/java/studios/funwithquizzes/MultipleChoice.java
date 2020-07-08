package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList choices;

    public MultipleChoice(String question, ArrayList<String> choice, String answer) {
        super(question, answer);

        this.choices = choices;
    }
}
