package chucknorris;

import java.util.Scanner;

import static chucknorris.ChuckNorrisCodec.*;


public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showMainMenu() {
        System.out.println("Please input operation (encode/decode/exit):");
    }

    public static void showEncodeMenu() {
        System.out.println("Input string:");
        String encodedStr = scanner.nextLine();
        System.out.println("Encoded string:");
        System.out.println(chuckNorrisEncode(encodedStr));
        System.out.println();
    }

    public static void showDecodeMenu() {
        System.out.println("Input encoded string:");
        String encodedStr = scanner.nextLine();
        if (isValidEncodeStr(encodedStr)) {
            System.out.println("Decoded string:");
            System.out.println(chuckNorrisDecode(encodedStr));
            System.out.println();
        } else {
            System.out.println("Encoded string is not valid.");
        }

    }
}
