package singleton;

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

    public Game() {
        for (Difficulty difficulty : Difficulty.values()) {
            anagram.put(difficulty, FileReader.getAnagrams(difficulty));
        }
        level = Difficulty.EASY;
        score = 0;
        rand = new Random();
    }

    public static Game getInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }

    public String getQuestion() {
        ArrayList<Anagram> levelAnagrams = anagram.get(level);
        if(levelAnagrams == null || levelAnagrams.isEmpty()) {
            return "no anagrams available for level";
        }
        int index = rand.nextInt(levelAnagrams.size());
        currentAnagram = levelAnagrams.get(index);
       return currentAnagram.getQuestion();
    }

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

    public int getScore() {
        return this.getScore();
    }
}
