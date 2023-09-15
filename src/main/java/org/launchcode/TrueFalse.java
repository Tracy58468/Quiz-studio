package org.launchcode;

public class TrueFalse extends Question {

    // answerOne is always "True"
    // answerTwo is always "False"

    public TrueFalse(String askQuestion, String answerOne, String answerTwo) {
        super(askQuestion, answerOne, answerTwo);
        answerOne = "True";
        answerTwo = "False";
    }
}
