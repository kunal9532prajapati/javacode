class PrimeComposite {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i);
            } else {
                System.out.println("Composite: " + i);
            }
        }
    }

    // Function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0,1 are not prime
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
