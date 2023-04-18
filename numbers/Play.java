package numbers;

import java.util.*;

public class Play {
    static String[] list = new String[] {"EVEN", "ODD", "BUZZ", "DUCK", "PALINDROMIC", "GAPFUL",
            "SPY", "SQUARE", "SUNNY", "JUMPING", "HAPPY", "SAD"};

    public static void playOneNumber(long n) {
        System.out.println("Properties of " + n);
        Print.printOneNumber(n);
    }

    public static void playTwoNumber(long number, long count) {
        Print.printTwoNumber(number, count);
    }
    public static void playMultipleWords(long number, long count, String[] arrayWords) {
        int len = arrayWords.length;
        ArrayList<String> arrayCapitalWord, arrayFalseWord;
        String str;
        arrayCapitalWord = new ArrayList<>();
        arrayFalseWord = new ArrayList<>();
        for (String arrayWord : arrayWords) {
            str = arrayWord.toUpperCase();
            arrayCapitalWord.add(str);

            if (!Arrays.asList(list).contains(str)
                    && !Arrays.asList(list).contains(str.replace("-", ""))) {
                arrayFalseWord.add(str);
            }
        }
        String[] arrayCapitalString = arrayCapitalWord.toArray(new String[arrayCapitalWord.size()]);
        String[] arrayFalseString = arrayFalseWord.toArray(new String[arrayFalseWord.size()]);
        if (arrayFalseString.length == 0) {
            judgeMultipleProperty(number, count, arrayCapitalString);
        } else {
            if (arrayFalseString.length == 1) {
                System.out.printf("The property [%s] is wrong.\n", arrayFalseString[0]);
            } else {
                System.out.print("The properties [");
                for (int i = 0; i < arrayFalseString.length; i++) {
                    System.out.print(arrayFalseString[i]);
                    if (i != arrayFalseString.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("] are wrong.");
            }
            printProperties();
        }
    }
    public static void judgeMultipleProperty(long number, long count, String[] arrayWords) {
        String[][] targetPairs = {{"EVEN", "ODD"}, {"DUCK", "SPY"}, {"SUNNY", "SQUARE"}, {"HAPPY", "SAD"},
                {"-EVEN", "-ODD"}, {"-HAPPY", "-SAD"}};
        boolean targetPairExists = false;
        String str1 = null;
        String str2 = null;
        loop : for (String[] pair : targetPairs) {
            for (int j = 0; j < arrayWords.length; j++) {
                for (int k = 0; k < arrayWords.length; k++) {
                    if (j != k) {
                        if (arrayWords[j].equals(pair[0]) && arrayWords[k].equals(pair[1])
                                || arrayWords[j].equals(arrayWords[k].replace("-", ""))) {
                            targetPairExists = true;
                            str1 = arrayWords[j];
                            str2 = arrayWords[k];
                            break loop;
                        }
                    }
                }
            }
        }
        if (targetPairExists) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n", str1, str2);
            System.out.println("There are no numbers with these properties.");
        } else {
            Print.printSpecificMultipleNumber(number, count, arrayWords);
        }
    }

    public static void printProperties() {
        System.out.print("""
                Available properties:
                [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]
                """);
    }

}
