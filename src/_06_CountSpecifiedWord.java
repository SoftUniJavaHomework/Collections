import java.util.Scanner;

/**
 * Created by pc on 3/29/2016.
 */
public class _06_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        String text = console.nextLine();
        String targetWord = console.nextLine().trim().toLowerCase();

        String[] words = text.split("[^a-zA-Z]+");

        int count = 0;

        for (String word : words) {
            if (targetWord.equals(word.toLowerCase())) {
                count++;
            }
        }

        System.out.printf("%s appears %d time%s", targetWord, count, count != 1 ? "s" : "");
    }
}
