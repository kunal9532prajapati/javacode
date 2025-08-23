
public class Main {
    public static void riskyMethod() throws Throwable {
        throw new Throwable("This is a custom Throwable");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Throwable t) {
            System.out.println("Caught: " + t.getMessage());
        }
    }
}
