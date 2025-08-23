public class ExceptionHandlingMultiCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[1] / 0; // This will cause ArithmeticException
            System.out.println(numbers[5]); // This will cause ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        finally {
            System.out.println("This block always executes.");
        }
    }
}
