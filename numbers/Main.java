package numbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Welcome to Amazing Numbers!\n\n");
        printInstrument();
        System.out.println();
        playGame();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a request: ");
                String input = sc.nextLine();
                System.out.println();
                long number = 0;
                long count = 0;
                if (input.isEmpty()) {
                    printInstrument();
                } else {
                    String[] inputs = input.split(" ");
                    InputLength.inputParameter(inputs);
                }
                System.out.println();
            } catch (NumberFormatException e) {
                InputLength.printParam1Natural();
                System.out.println();
            }
        }
    }
    public static void printInstrument() {
        System.out.print("""
                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameter shows how many consecutive numbers are to be processed;
                - two natural numbers and properties to search for;
                - a property preceded by minus must not be present in numbers;
                - separate the parameters with one space;
                - enter 0 to exit.
                """);
    }


}
