package numbers;

import java.util.*;

public class wordMethod {
    public static boolean judgeProperty(String word, long i) {
        boolean judge = false;
        return switch (word) {
            case "BUZZ" -> Judge.judgeBuzz(i);
            case "DUCK" -> Judge.judgeDuck(i);
            case "PALINDROMIC" -> Judge.judgePalindromic(i);
            case "GAPFUL" -> Judge.judgeGapful(i);
            case "SPY" -> Judge.judgeSpy(i);
            case "SQUARE" -> Judge.judgeSquare(i);
            case "SUNNY" -> Judge.judgeSunny(i);
            case "JUMPING" -> Judge.judgeJumping(i);
            case "HAPPY", "-SAD" -> Judge.judgeHappy(i);
            case "SAD", "-HAPPY" -> !Judge.judgeHappy(i);
            case "ODD", "-EVEN" -> !Judge.judgeEvenOdd(i);

            case "-BUZZ" -> !Judge.judgeBuzz(i);
            case "-DUCK" -> !Judge.judgeDuck(i);
            case "-PALINDROMIC" -> !Judge.judgePalindromic(i);
            case "-GAPFUL" -> !Judge.judgeGapful(i);
            case "-SPY" -> !Judge.judgeSpy(i);
            case "-SQUARE" -> !Judge.judgeSquare(i);
            case "-SUNNY" -> !Judge.judgeSunny(i);
            case "-JUMPING" -> !Judge.judgeJumping(i);
            case "-ODD", "EVEN" -> Judge.judgeEvenOdd(i);
            default -> false;
        };

    }

    public static boolean judgeMultipleProperty(String[] arrayWords, long i) {
        ArrayList<Boolean> results = new ArrayList<Boolean>();
        for (String arrayWord : arrayWords) {
            results.add(judgeProperty(arrayWord, i));
        }
        return !results.contains(false);
    }
}
