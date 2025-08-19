public class SubstringLoopPattern {
    public static void main(String[] args) {
        String str = "abcd";  // base string
      
// a ab abc abcd b bc bcd c cd d
      
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) { 
                System.out.println(str.substring(i, j));
            }
        }
    }
}
