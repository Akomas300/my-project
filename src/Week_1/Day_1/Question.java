package Week_1.Day_1;

public class Question { // Variables
    private String questionText;
    private String[] choices;
    private int correctAnswer;

    // Constructor
    public Question(String questionText, String[] choices, int correctAnswer) {
        setQuestionText(questionText);
        setChoices(choices);
        setCorrectAnswer(correctAnswer);
    }

    // Public Methods || Getters
    public String getQuestionText() {
        return questionText;
    }

    // Private Methods || Setters
    private void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String[] getChoices() {
        return choices;
    }

    private void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    private void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == getCorrectAnswer();
    }
}
