
public class MissingArray {
    public static void main(String args[]) {
        long[] arr = {1, 2, 3, 5, 6};
        long n = arr.length + 1;               // total numbers should be 6
        long sum = n * (n + 1) / 2;            // expected sum of 1..6
        long arraySum = 0;

        for (long num : arr) {
            arraySum += num;
        }

        long missing = sum - arraySum;
        System.out.println("This is the array missing element: " + missing);
    }
}
