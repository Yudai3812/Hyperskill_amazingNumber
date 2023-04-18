package numbers;

public class Print {

    public static void printSpecificMultipleNumber(long number, long count, String[] arrayWords) {
        int i = 0;
        int j = 0;
        while (true) {
            if (wordMethod.judgeMultipleProperty(arrayWords, number + i)) {
                printJudge(number, count, i);
                j++;
            }
            if (j == count) {
                break;
            }
            i++;
        }
    }
    public static void printOneNumber(long n) {
        System.out.println("        buzz: " + Judge.judgeBuzz(n));
        System.out.println("        duck: " + Judge.judgeDuck(n));
        System.out.println(" palindromic: " + Judge.judgePalindromic(n));
        System.out.println("      gapful: " + Judge.judgeGapful(n));
        System.out.println("         spy: " + Judge.judgeSpy(n));
        System.out.println("      square: " + Judge.judgeSquare(n));
        System.out.println("       sunny: " + Judge.judgeSunny(n));
        System.out.println("     jumping: " + Judge.judgeJumping(n));
        System.out.println("       happy: " + Judge.judgeHappy(n));
        System.out.println("         sad: " + !Judge.judgeHappy(n));
        System.out.println("        even: " + Judge.judgeEvenOdd(n));
        System.out.println("         odd: " + !Judge.judgeEvenOdd(n));
    }

    public static void printTwoNumber(long number, long count) {
        for (int i = 0; i < count; i++) {
            printJudge(number, count, i);
        }
    }

    public static void printJudge(long number, long count, int i) {
        System.out.print(number + i + " is ");
        if (Judge.judgeBuzz(number + i)) { System.out.print("buzz, "); }
        if (Judge.judgeDuck(number + i)) { System.out.print("duck, "); }
        if (Judge.judgePalindromic(number + i)) { System.out.print("palindromic, "); }
        if (Judge.judgeGapful(number + i)) { System.out.print("gapful, "); }
        if (Judge.judgeSpy(number + i)) { System.out.print("spy, "); }
        if (Judge.judgeSquare(number + i)) { System.out.print("square, "); }
        if (Judge.judgeSunny(number + i)) { System.out.print("sunny, "); }
        if (Judge.judgeJumping(number + i)) { System.out.print("jumping, "); }
        if (Judge.judgeHappy(number + i)) {
            System.out.print("happy, ");
        } else {
            System.out.print("sad, ");
        }
        if (Judge.judgeEvenOdd(number + i)) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
