public class StringBuilderDemo {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace text
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // Delete text
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // Reverse text
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Set a character at specific index
        sb.setCharAt(0, '!');
        System.out.println("After setCharAt: " + sb);

        // Get length and capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
