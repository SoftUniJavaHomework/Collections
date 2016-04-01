import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by pc on 3/30/2016.
 */
public class _14_SumCards {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[]cards = console.nextLine().split("\\s+");
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("J", 12);
        hash.put("Q", 13);
        hash.put("K", 14);
        hash.put("A", 15);

        int length = cards.length;
        int sum = 0;
        int mediumSum = 0;
        int count = 0;

        for (int i = 0; i < length; i++) {
            String card = cards[i];
            String cardFace = card.substring(0, card.length() - 1);
            int face = 0;

            if (hash.containsKey(cardFace)){
                face = hash.get(cardFace);
            }else{
                face = Integer.parseInt(cardFace);
            }

            if (i == length - 1){
                sum += face;
            }

            while (i + count + 1 < length){
                String nextCard = cards[i + count + 1];
                String nextCardFace = nextCard.substring(0, nextCard.length() - 1);
                int nextFace = 0;

                if (hash.containsKey(nextCardFace)){
                    nextFace = hash.get(nextCardFace);
                }else {
                    nextFace = Integer.parseInt(nextCardFace);
                }

                if (face == nextFace){
                    count++;

                    if (i + count == length - 1){
                        mediumSum = face * (count + 1);
                        sum += mediumSum * 2;
                        System.out.println(sum);
                        return;
                    }
                }else if (face != nextFace && count > 0){
                    mediumSum = face * (count + 1);
                    sum += mediumSum * 2;
                    mediumSum = 0;
                    i = i + count;
                    count = 0;
                    break;
                } else if(face != nextFace && count == 0){
                    sum += face;
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}
