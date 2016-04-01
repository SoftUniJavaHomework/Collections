import java.util.Scanner;

/**
 * Created by pc on 3/29/2016.
 */
public class _11_ImplementRecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int target = Integer.parseInt(console.nextLine());
        String[]input = console.nextLine().split("\\s+");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int output = binarySearch(numbers, target);
        System.out.println(output);
    }

    public static int binarySearch(int[] a, int target) {
        return binarySearch(a, 0, a.length-1, target);
    }

    public static int binarySearch(int[] a, int start, int end, int target) {
        int middle = (start + end) / 2;
        if(end < start) {
            return -1;
        }

        if(target==a[middle]) {
            return middle;
        } else if(target<a[middle]) {
            return binarySearch(a, start, middle - 1, target);
        } else {
            return binarySearch(a, middle + 1, end, target);
        }
    }
}
