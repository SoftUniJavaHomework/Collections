import java.util.Scanner;

/**
 * Created by pc on 3/28/2016.
 */
public class _02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] words = console.nextLine().split("\\s+");
        StringBuilder output = new StringBuilder();
        output.append(words[0] + " ");

        if (words.length == 1){
            System.out.println(output.toString());
            return;
        }

        for (int i = 0; i < words.length - 1; i++) {
            String word = words[i];
            String wordToCompare = words[i + 1];

            if (word.equals(wordToCompare)){
                output.append(wordToCompare + " ");

                if (i == words.length - 2){
                    System.out.println(output.toString());
                }
            }else{
                System.out.println(output.toString());
                output.delete(0, output.capacity());
                output.append(wordToCompare + " ");

                if (i == words.length - 2){
                    System.out.println(output.toString());
                }
            }
        }
    }
}
