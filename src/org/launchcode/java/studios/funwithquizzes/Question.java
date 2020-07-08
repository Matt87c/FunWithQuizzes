package org.launchcode.java.studios.funwithquizzes;

import java.util.Arrays;

abstract class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return question;
    }
}
