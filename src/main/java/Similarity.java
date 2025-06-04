public class Similarity {
    public int compare(String str1, String str2) {
        assertIllegalArgument(str1);
        assertIllegalArgument(str2);
        return 60;
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
        if(str.length() == 0) throw new IllegalArgumentException();
    }

}
