public class Similarity {
    public int compare(String str1, String str2) {
        assertIllegalArgument(str1);
        assertIllegalArgument(str2);

        if (str1.length() < str2.length()) {
            String tmp = str1;
            str1 = str2;
            str2 = tmp;
        }

        return compareLength(str1, str2);
    }

    private int compareLength(String str1, String str2) {
        if (str1.length() == str2.length()) return 60;
        if (str1.length() >= str2.length() * 2) return 0;
        double gap = str1.length() - str2.length();
        return (int) ((1.0 - (gap) / str2.length()) * 60);
    }

    private void assertIllegalArgument(String str) {
        assertLengthLongerThan0(str);
        assertStringOnlyContainsAlphabet(str);
    }

    private static void assertStringOnlyContainsAlphabet(String str) {
        for (char c : str.toCharArray()) {
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                throw new IllegalArgumentException();
            }
        }
    }

    private static void assertLengthLongerThan0(String str) {
        if (str.length() == 0) throw new IllegalArgumentException();
    }

}
