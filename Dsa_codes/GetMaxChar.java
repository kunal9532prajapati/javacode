class Main {
    public static void main(String[] args) {
        String s = "kunalprajapati";

        int n = s.length();
        int[] freq = new int[26]; // frequency array for 'a' to 'z'

        // Count frequency of each character
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int indx = ch - 'a'; // map 'a'->0, 'b'->1, ...
            freq[indx]++;
        }

        // Find max frequency character
        int maxfreq = 0;
        char ans = s.charAt(0);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxfreq) {
                maxfreq = freq[i];
                ans = (char) (i + 'a'); // convert back to character
            }
        }

        System.out.println("Max occurring character: " + ans);
        System.out.println("Frequency: " + maxfreq);
    }
}
