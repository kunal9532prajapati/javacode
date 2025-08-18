public class DeleteRange {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        // Delete characters from index 5 to 11 (space + "World")
        sb.delete(5, 11);

        System.out.println(sb); // Output: Hello
    }
}
