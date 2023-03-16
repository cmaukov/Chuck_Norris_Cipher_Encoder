package chucknorris;

import java.util.Scanner;

import static chucknorris.Menu.showDecodeMenu;
import static chucknorris.Menu.showEncodeMenu;

public class Main {
    private static boolean isWorkingState = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (isWorkingState) {
            Menu.showMainMenu();
            String inputStr = scanner.nextLine();
            switch (inputStr) {
                case "encode" -> showEncodeMenu();
                case "decode" -> showDecodeMenu();
                case "exit" -> {
                    isWorkingState = false;
                    System.out.println("Bye!");
                }
                default -> System.out.printf("There is no '%s' operation%n", inputStr);
            }
        }
    }

}