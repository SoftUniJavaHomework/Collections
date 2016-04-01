import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by pc on 3/29/2016.
 */
public class _10_CardsFrequencies {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        String input = console.nextLine();
        String[] cards = input.split(" ");
        int totalCards = cards.length;

        LinkedHashMap<String, Integer> occurences = new LinkedHashMap<>();

        for (String card : cards) {
            String face = card.substring(0, card.length() - 1);

            if (occurences.containsKey(face)) {
                occurences.put(face, occurences.get(face) + 1);
            } else {
                occurences.put(face, 1);
            }
        }

        System.out.println("\nResult:");

        for (String face : occurences.keySet()) {
            double percentage = (double)occurences.get(face) / totalCards * 100;
            System.out.printf("%s -> %.2f%%%n",face, percentage);
        }
    }
}
