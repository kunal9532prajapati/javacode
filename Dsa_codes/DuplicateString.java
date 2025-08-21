public class DuplicateString {
    public static void main(String[] args) {
        String str = "aaaabbjkkkll";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i - 1) + "" + count);
                count = 1;
            }
        }
        System.out.print(str.charAt(str.length() - 1) + "" + count);
    }
    
}
//a4b2j1k3l2