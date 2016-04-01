import java.util.Scanner;

/**
 * Created by pc on 3/28/2016.
 */
public interface _03_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] words = console.nextLine().split("\\s+");

        int maxLength = 1;
        int length = 1;
        String word = words[0];
        String wordToCompare = words[0];

        for (int i = 1; i < words.length; i++) {
            String currentString = words[i];

            if (i != words.length - 1 && currentString.equals(wordToCompare)) {
                length++;
            } else {
                if (currentString.equals(wordToCompare)) {
                    length++;
                }
                if (length > maxLength) {
                    maxLength = length;
                    word = wordToCompare;
                }

                length = 1;
                wordToCompare = currentString;
            }
        }

        System.out.println("\nThe longest sequence of equal strings is:");
        for (int i = 0; i < maxLength; i++) {
            System.out.print(word + " ");
        }
    }
}
