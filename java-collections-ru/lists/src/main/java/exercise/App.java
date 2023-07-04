package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String sym, String word) {

        int length = word.length();
        String[] letters = symbols.split("");
        List colls = new ArrayList(Arrays.asList(letters));

        for (int i = 0; i < length; i++) {
            String current = word.substring(i, i + 1).toLowerCase();

            if (!colls.contains(current)) {
                return false;
            }

            colls.remove(current);
        }

        return true;
    }
}
//END
