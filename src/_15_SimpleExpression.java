import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 3/30/2016.
 */
public class _15_SimpleExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        Pattern pattern = Pattern.compile("(\\+|-)");
        Matcher matcher = pattern.matcher(input);

        String[] numbersAsString = input
                .replaceAll("[+-]+", " ")
                .trim()
                .split("\\s+");

        BigDecimal sum = new BigDecimal(numbersAsString[0]);
        ArrayList<String> plusOrMinus = new ArrayList<>();

        while (matcher.find()) {
            plusOrMinus.add(matcher.group());
        }

        for (int i = 1; i < numbersAsString.length; i++) {

            if (plusOrMinus.get(i - 1).equals("+")){
                sum = sum.add(new BigDecimal(numbersAsString[i]));
            }else{
                sum = sum.subtract(new BigDecimal(numbersAsString[i]));
            }
        }

        System.out.println(sum);
    }
}
