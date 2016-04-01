import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by pc on 3/29/2016.
 */
public class _08_ExtractAlUniqueWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String[] words = input.split("[^a-zA-Z]+");

        TreeSet<String> uniqueWords = new TreeSet<>();

        for (String word : words) {
            if (!word.equals("")) {
                uniqueWords.add(word.toLowerCase());
            }
        }

        for (String string : uniqueWords) {
            System.out.print(string + " ");
        }
    }
}
