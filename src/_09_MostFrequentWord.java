import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by pc on 3/29/2016.
 */
public class _09_MostFrequentWord {
    public static void main(String[] args) {
        Scanner console  = new Scanner(System.in);

        String input = console.nextLine();
        String[] words = input.split("[^a-zA-Z]+");

        TreeMap<String, Integer> frequencies = new TreeMap<>();

        int occurences = 0;

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i].toLowerCase();

            if (currentWord.equals("")) {
                continue;
            }

            int count = 0;

            for (String string : words) {
                if (currentWord.equals(string.toLowerCase())) {
                    count++;
                }
            }

            if (count > occurences) {
                occurences = count;
            }

            frequencies.put(currentWord, count);
        }

        for (String word : frequencies.keySet()) {
            if (frequencies.get(word) == occurences) {
                System.out.println(word + " -> " + occurences + " times");
            }
        }
    }
}
