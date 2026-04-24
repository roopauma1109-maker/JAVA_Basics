public class Validshuffle {
    public static boolean isValidShuffle(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        int i = 0, j = 0, k = 0;
        while (k < s3.length()) {
            if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
                i++;
            } else if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return i == s1.length() && j == s2.length();
    }
}
