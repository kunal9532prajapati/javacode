public class DeleteCharExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        // Delete character at index 5 (the space)
        sb.deleteCharAt(5);

        System.out.println(sb); // Output: HelloWorld
    }
}
