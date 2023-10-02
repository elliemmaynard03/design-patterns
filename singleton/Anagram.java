package singleton;
/*
 * @Author Ellie Maynard
 * class Anagram calls all of the questions within the anagram files and checks if they are correct
 */
import java.util.ArrayList;


public class Anagram {
    String question;
    ArrayList<String> answers;
/*
 * @param String question; takes a question and calls current question
 * @Param ArrayList<String> answers; takes an answer and calls current answer
 */
    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    /*
     * @return question; returns the current question for the user
     */
    public  String getQuestion() {
        return question;
    }

    /*
     * @return answers.contains(userAnswer); returns the answer and the answer that the user gives
     */
    public boolean isCorrect(String userAnswer) {
        return answers.contains(userAnswer);
    }
}
