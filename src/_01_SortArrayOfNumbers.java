import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pc on 3/28/2016.
 */
public class _01_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = console.nextInt();
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
