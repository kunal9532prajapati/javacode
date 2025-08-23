public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "hello my name is kunal";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        // Reverse each word
        for (String word : words) {
            StringBuilder revWord = new StringBuilder(word);
            result.append(revWord.reverse()).append(" ");
        }

        // Print result (trim to remove last space)
        System.out.println(result.toString().trim());
    }
}

