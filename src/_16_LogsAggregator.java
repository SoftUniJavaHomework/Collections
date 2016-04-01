import java.util.*;

/**
 * Created by pc on 3/30/2016.
 */
public class _16_LogsAggregator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        HashMap<String, TreeSet<String>> logInfo = new HashMap<>();
        TreeMap<String, Integer> time = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[]input=console.nextLine().split("\\s+");
            String IP = input[0];
            String name = input[1];
            int duration = Integer.parseInt(input[2]);

            if (!logInfo.containsKey(name)) {
                logInfo.put(name, new TreeSet<String>());
                time.put(name, 0);
            }

            logInfo.get(name).add(IP);
            int totalTime = time.get(name);
            time.put(name, totalTime + duration);
        }

        for (Map.Entry<String, Integer> entry : time.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                               entry.getValue() + " " +
                               logInfo.get(entry.getKey()));
        }
    }
}
