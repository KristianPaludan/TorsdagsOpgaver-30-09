import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);

        printLongestWord();

        printFirstHalfOfEachWord();

        printMostFrequentLetter();




    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:

    public static void printLongestWord() {
        String longestWord = "";
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() >= longestWord.length()) {
                longestWord = text[i];
            }
        }
        System.out.println(longestWord);

    }


    public static void printFirstHalfOfEachWord() {
        for (String word : text) { // går igennem testen word for word og finder ordlængden.

            System.out.println(word.substring(0, word.length() / 2)); // (o,word.length()/2 viser første halvdel af ordet.
            System.out.println(word); // viser hele ordet
        }
    }

 //   public static String printMostFrequentLetter(text) {


//}
}
