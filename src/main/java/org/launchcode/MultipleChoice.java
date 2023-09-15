package org.launchcode;

public class MultipleChoice extends TrueFalse {

    private String answerThree;

    public MultipleChoice(String askQuestion, String answerOne, String answerTwo, String answerThree) {

        super(askQuestion, answerOne, answerTwo);

        this.answerThree = answerThree;

        System.out.println(answerThree);

    }

// one correct answer only

    // Getter and setter?

    public String getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(String answerThree) {
        this.answerThree = answerThree;
    }
}
