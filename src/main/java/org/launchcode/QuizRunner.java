package org.launchcode;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class QuizRunner {

    public static void main(String[] args) {

        System.out.println("quizrunner");

        // Create at least one question of each type

        Scanner askQuestion = new Scanner(System.in);

//        System.out.println("Please select the correct answer.");

        TrueFalse trueFalseOne = new TrueFalse("Is Java a fun language to learn? ", "True", "False");

        String userAnswer1 = askQuestion.nextLine();

        System.out.println("Your answer was: " + userAnswer1);

        MultipleChoice multipleChoiceOne = new MultipleChoice("Are we having fun, yet? ", "Yes", "No", "Maybe so.");

        String userAnswer2 = askQuestion.nextLine();

        System.out.println("Your answer was: " + userAnswer2);

        Checkbox checkboxOne = new Checkbox("Is this studio over, yet? ", "Yes", "No", "We can only hope.");

        String userAnswer3 = askQuestion.nextLine();

        System.out.println("Your answer was: " + userAnswer3);

        // Present question and ask user to select correct answer(s)
//        System.out.println("Question 1");

        // Tell user whether they got answers right, or not

    }
}