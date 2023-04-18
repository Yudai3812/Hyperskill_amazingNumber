package numbers;

import java.util.*;

public class Judge {
    public static boolean judgeEvenOdd(long n) {
        return n % 2 == 0;
    }

    public static boolean judgeBuzz(long n) {

        if (n % 7 == 0 && n % 10 == 7) {
            return true;
        } else return n % 7 == 0 || n % 10 == 7;
    }

    public static boolean judgeDuck(long n) {
        int len = String.valueOf(n).length();
        boolean duck = false;
        int digit = 0;
        long num = 0;
        long po = 1;
        for (int i = 0; i < len; i++) {
            num = (long) (n / po);
            digit = (int) (num % 10);
            if (digit == 0) {
                duck = true;
            }
            po *= 10;
        }
        return duck;
    }

        /*Integer[] arrayDigit = digits(n);
        int lenNum = arrayDigit.length;
        int digit = 0;
        long num = 0;
        return Arrays.asList(arrayDigit).contains(0);*/

    public static boolean judgePalindromic(long n) {
        long number = n;
        long reversedNumber = 0;
        while (number != 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return n == reversedNumber;
    }

    public static boolean judgeGapful(long n) {
        String str = String.valueOf(n);
        int len = str.length();
        if (len >= 3) {
            int gapNumber = Integer.parseInt((String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(len - 1))));
            return n % gapNumber == 0;
        }
        return false;
    }

    public static boolean judgeSpy(long n) {
        Integer[] arrayDigit = digits(n);
        int lenNum = arrayDigit.length;
        int sum = 0;
        int product = 1;
        for (Integer integer : arrayDigit) {
            sum += integer;
            product *= integer;
        }
        return sum == product;
    }

    public static boolean judgeSquare(long n) {
        double sqrtOfNumber = Math.sqrt(n);
        return sqrtOfNumber == Math.floor(sqrtOfNumber);
    }
    public static boolean judgeSunny(long n) {
        double sqrtOfNumber = Math.sqrt(n + 1);
        return sqrtOfNumber == Math.floor(sqrtOfNumber);
    }

    public static boolean judgeJumping(long n) {
        Integer[] arrayDigit = digits(n);
        int lenNum = arrayDigit.length;
        boolean jumping = true;
        for (int i = 0; i < lenNum - 1; i++) {
            if (arrayDigit[i] + 1 != arrayDigit[i + 1] && arrayDigit[i + 1] + 1 != arrayDigit[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean judgeHappy(long n) {
        Set<Long> seen = new HashSet<>();
        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                long digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return true;
    }

    public static Integer[] digits(long n) {
        int len = String.valueOf(n).length();
        int epo = 1;
        ArrayList<Integer> arrayDigit = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            arrayDigit.add((int)((long)(n / epo) % 10));
            epo *= 10;
        }
        int arraySize = arrayDigit.size();
        return arrayDigit.toArray(new Integer[arraySize]);
    }

}
