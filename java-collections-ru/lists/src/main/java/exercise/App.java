package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String word, String chars) {
        int charsLength = chars.length();
        int wordLength = word.length();

        if (wordLength < charsLength) {
            return false;
        }

        List<String> charsList = new ArrayList<>(Arrays.asList(chars.split("")));
        List<String> wordList = new ArrayList<>(Arrays.asList(word.split("")));

        for (String letter : charsList) {
            if (wordList.contains(letter.toLowerCase())) {
                wordList.remove(letter);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
