public class PalindromeSubstring {
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testString = "abcba";
        int count = 0;
        for(int i=0; i<testString.length(); i++) {
            for(int j=i+1; j<=testString.length(); j++) {
                String substring = testString.substring(i, j);
                if (isPalindrome(substring)) {
                    System.out.println("Palindrome substring: " + substring);
                    count++;
                }
            }
        }
        System.out.println("Total palindrome substrings: " + count);
    }
}
 