public class ReplaceZeroWithFive {
    public static int convertFive(int num) {
        // Convert to string, replace '0' with '5', then back to int
        String result = String.valueOf(num).replace('0', '5');
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        int n = 1004;
        int ans = convertFive(n);
        System.out.println("Output: " + ans);
    }
}
