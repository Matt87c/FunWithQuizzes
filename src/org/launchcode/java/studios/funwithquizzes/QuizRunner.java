package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<Question>();

        questions.add(new TrueFalse("Is the sky blue?", "True"));

        ArrayList<String> choices = new ArrayList<String>();

        choices.add("red");
        choices.add("green");
        choices.add("blue");

        questions.add(new Checkbox("Please select A.)", choices, "A"));

        questions.add(new MultipleChoice("Which of the following are colors?", choices, "ABC"));

        for (Question question: questions) {
            // Ask the question
            System.out.println(question);

            // Get an answer from the user
            String choice = scanner.nextLine();

            // Determine whether or not the user got the question correct
            if (choice == question.getAnswer()) {
                System.out.println("20 points to Kramerdor!");
            } else {
                System.out.println("Yer dumb");
            }
        }

        System.out.println("Yippee!");

        scanner.close();
    }
}
