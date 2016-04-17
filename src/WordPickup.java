import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Yulong Tan
 * 4.16.16
 * <p>
 * This class keeps track of the various cheeky sayings from
 * word pickups
 */

public class WordPickup {

    public static void main(String[] params) throws FileNotFoundException {
        File file = new File("pickups.txt");
        Scanner input = new Scanner(file);
        Map<String, String> words = new TreeMap<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] parts = line.split("[|]");
            if (!words.containsKey(parts[0])) {
                words.put(parts[0].trim(), parts[1].trim());
            }
        }
        System.out.println("Current words: " + words.keySet());
    }
}
