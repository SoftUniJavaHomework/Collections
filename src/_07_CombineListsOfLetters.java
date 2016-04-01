import java.util.Scanner;

/**
 * Created by pc on 3/29/2016.
 */
public class _07_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String[] firstList = input.split("\\s+");
        input = console.nextLine();
        String[] secondList = input.split("\\s+");

        StringBuilder output = new StringBuilder();

        for (String s : firstList) {
            output.append(s);
            output.append(" ");
        }

        for (int i = 0; i < secondList.length; i++) {
            String currentSymbol = secondList[i];

            if (!ConatinsSymbol(firstList, currentSymbol)){
                output.append(currentSymbol);
                output.append(" ");
            }
        }

        System.out.println(output.toString());
    }

    private static boolean ConatinsSymbol(String[] firstList, String currentSymbol) {
        boolean containsSymbol = false;
        for (String s : firstList) {
            if (s.equals(currentSymbol)){
                containsSymbol = true;
                return containsSymbol;
            }
        }

        return containsSymbol;
    }
}
