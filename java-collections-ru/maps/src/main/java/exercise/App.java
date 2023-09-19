package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String phrase) {
        String[] words = phrase.split(" ");

        Map<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            var count = wordsMap.get(word);
            if (!word.isEmpty()) {
                wordsMap.put(word, count != null ? count + 1 : 1);
            }
        }

        return wordsMap;
    }

    public static String toString(Map<String, Integer> wordsMap) {
        if (wordsMap.isEmpty()) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<String, Integer> word : wordsMap.entrySet()) {
            var current = "\n  " + word.getKey() + ": " + word.getValue();
            result.append(current);
        }
        result.append("\n}");

        return result.toString();
    }
}
//END
