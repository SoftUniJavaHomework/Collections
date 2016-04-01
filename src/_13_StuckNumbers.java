import java.util.Scanner;

/**
 * Created by pc on 3/30/2016.
 */
public class _13_StuckNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String[]numbersAsString = console.nextLine().split("\\s+");

        boolean isFound = false;
        for (String s : numbersAsString) {
            for (String s1 : numbersAsString) {
                for (String s2 : numbersAsString) {
                    for (String s3 : numbersAsString) {
                        if ((s != s1) && (s != s2)&& (s != s3) && (s1 != s2)  && (s1 != s3) && (s2 != s3)){
                            if ((s + s1).equals(s2 + s3)){
                                System.out.printf("%s|%s==%s|%s", s, s1, s2, s3);
                                System.out.println();
                                isFound = true;
                            }
                        }
                    }
                }
            }
        }

        if (!isFound){
            System.out.println("No");
        }
    }
}
