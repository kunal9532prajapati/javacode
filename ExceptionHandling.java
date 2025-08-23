public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 2; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
    
}
