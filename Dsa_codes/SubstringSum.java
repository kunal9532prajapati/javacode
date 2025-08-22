public class SubstringSum {
    public static void main(String[] args) {
        String num = "6759"; //6+7+5+9+67+75+59+675+759+6759
        int n = num.length();
        int sum = 0;

        // Generate all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = num.substring(i, j); // take substring
                sum += Integer.parseInt(sub);     // convert to int and add
            }
        }

        System.out.println("Sum of substrings = " + sum);
    }
}
