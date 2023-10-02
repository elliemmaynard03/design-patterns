package singleton;
/*
 * @Author Ellie Maynard
 * Class Game uses the array lists to allow the user to play the anagram game
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {
    private static Game game;
    private static Random rand;
    private static Difficulty level;
    private static HashMap<Difficulty, ArrayList<Anagram>> anagram = new HashMap<Difficulty, ArrayList<Anagram>>() ;
    private static Anagram currentAnagram;
    private static int score;
/*
 * uses the file reader and the difficulty enumerations to get a file and add it to the Hash Map 
 */
    public Game() {
        for (Difficulty difficulty : Difficulty.values()) {
            anagram.put(difficulty, FileReader.getAnagrams(difficulty));
        }
        level = Difficulty.EASY;
        score = 0;
        rand = new Random();
    }

/*
 * Get Instance allows a new game to be initialized and played
 * @return game which returns a new game
 */
    public static Game getInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }
/*
 * Allows the user to read a question
 * Array List levelAnagrams is equal to the anagram array list at the level the user is at
 * @return currentAnagram.getQuestion which takes the current anagram file's question
 */
    public String getQuestion() {
        ArrayList<Anagram> levelAnagrams = anagram.get(level);
        if(levelAnagrams == null || levelAnagrams.isEmpty()) {
            return "no anagrams available for level";
        }
        int index = rand.nextInt(levelAnagrams.size());
        currentAnagram = levelAnagrams.get(index);
       return currentAnagram.getQuestion();
    }
    /*
     * Is Correct method says whether or not the word the user puts in a correct anagram
     * if the answer is correct the score is increased by 1
     * when the user score is greater than 6 then level is changed to medium
     * when user score is > than 10 then level is changed to difficult
     * @param String userAnswer takes the answer the user gives for each anagram question
     * @return true the method is a boolean expression and starts false but returns true when the method runs
     */

    public boolean isCorrect(String userAnswer) {
        boolean isAnswerCorrect = false;

       if( userAnswer != null) {
        userAnswer = userAnswer.trim().toLowerCase();
        isAnswerCorrect = currentAnagram.isCorrect(userAnswer);

        if(isAnswerCorrect) {
            score++;


            if(score >= 6 && level == Difficulty.EASY) {
                level = Difficulty.MEDIUM;
            }
            else if(score >= 10 && level == Difficulty.MEDIUM) {
                level = Difficulty.HARD;
                }
            }

        }
        return true;
    }

    /*
     * @return this.getScore() which gets the user score 
     */
    public int getScore() {
        return this.getScore();
    }
}
