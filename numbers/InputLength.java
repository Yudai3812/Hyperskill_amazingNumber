package numbers;

import java.util.*;
public class InputLength {
    public static void inputParameter(String[] inputs) {
        long n = 0;
        long number = 0;
        long count = 0;
        int len = inputs.length;
        if (len == 1) {
            n = Long.valueOf(inputs[0]);
            inputLength1(n);
        } else {
            if (Integer.valueOf(inputs[1]) > 0) {
                number = Long.valueOf(inputs[0]);
                count = Long.valueOf(inputs[1]);
                inputMoreLength(number, count, len, inputs);
            } else {
                printParam2Natural();
            }
        }
    }

    public static void inputLength1(long n) {
        if (n == 0) {
            System.out.printf("Goodbye!\n");
            System.exit(0);
        } else if (n > 0) {
            Play.playOneNumber(n);
        } else {
            printParam1Natural();
        }
    }

    public static void inputMoreLength(long number, long count, int len, String[] inputs) {
        if (len == 2) {
            Play.playTwoNumber(number, count);
        } else {
            ArrayList<String> arrayWords = new ArrayList<String>();
            for (int i = 2; i < len; i++) {
                arrayWords.add(inputs[i]);
            }
            Set<String> arrayHash = new HashSet<> (arrayWords);
            String[] arrayString = arrayHash.toArray(new String[arrayHash.size()]);
            Play.playMultipleWords(number, count, arrayString);
        }
    }

    public static void printParam1Natural() {
        System.out.println("The first parameter should be a natural number or zero.");
    }
    public static void printParam2Natural() {
        System.out.println("The second parameter should be a natural number.");
    }
}
