import java.util.Scanner;

/**
 * Created by pc on 3/29/2016.
 */
public class _12_CalculateFactorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int result = Factorial(n);
        System.out.println(result);
    }

    private static int Factorial(int n) {
        int result;

        if (n == 1 || n == 0){
            return 1;
        }

        result = Factorial(n-1) * n;
        return result;
    }
}
