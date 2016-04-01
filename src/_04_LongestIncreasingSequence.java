import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by pc on 3/29/2016.
 */
public class _04_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[]input = console.nextLine().split("\\s+");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        int startNumber = numbers.get(0);
        int length = 1;
        int maxLength = 0;
        int endIndex = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> maxList = new ArrayList<Integer>();
        list.add(startNumber);

        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

            if (startNumber < currentNumber){
                list.add(currentNumber);
                startNumber = currentNumber;
                length++;
            }else{
                PrintList(list, 0, list.size());

                if (length > maxLength){
                    endIndex = i;
                    maxLength = length;
                }

                list.clear();
                startNumber = currentNumber;
                list.add(startNumber);
                length = 1;
            }

            if (i == numbers.size() - 1){
                PrintList(list, 0, list.size());
                if (length > maxLength){
                    endIndex = i + 1;
                    maxLength = length;
                }
            }
        }

        System.out.print("Longest: ");
        PrintList(numbers, endIndex - maxLength,endIndex);
    }

    private static void PrintList(ArrayList<Integer> list, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
