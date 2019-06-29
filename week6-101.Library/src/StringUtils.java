public class StringUtils {
    // Checks if the string searched is contained within the string word. Should be case insensitive, and should not care about trailing spaces.
    public static boolean included(String word, String searched) {
        if (word == "" || searched == "" ) {
            return false;
        }
        if (word.toLowerCase().contains(searched.toLowerCase().trim())) {
            return true;
        }
        return false;
    }
}
