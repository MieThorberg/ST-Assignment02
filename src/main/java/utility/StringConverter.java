package utility;

public class StringConverter {

    public static String reverse(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        if (s.isEmpty()) {
            return s;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static String capitalize(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        if (s.isEmpty()) {
            return s;
        }
        return s.toUpperCase();
    }

    public static String lowercase(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        if (s.isEmpty()) {
            return s;
        }
        return s.toLowerCase();
    }

}
