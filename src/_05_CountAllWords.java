import java.util.Scanner;

/**
 * Created by pc on 3/29/2016.
 */
public class _05_CountAllWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String[] words = input.split("[^a-zA-Z]+");

        System.out.println("There are " + words.length + " words in the text.");
    }
}
