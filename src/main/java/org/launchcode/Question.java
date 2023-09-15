package org.launchcode;

public abstract class Question {

    private String askQuestion;
    private static String answerOne;
    private static String answerTwo;

    // method for determining which answers are correct

    // for Checkbox, more than one answer

    // for MultipleChoice, one answer

    // for TrueFalse, one answer

    // Constructor(s)

    public Question(String askQuestion, String answerOne, String answerTwo) {
        this.askQuestion = askQuestion;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;

        System.out.println(askQuestion);
        System.out.println(answerOne);
        System.out.println(answerTwo);


    }



    // Getters and setters

    public String getAskQuestion() {
        return askQuestion;
    }

    public void setAskQuestion(String askQuestion) {
        this.askQuestion = askQuestion;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }

}


