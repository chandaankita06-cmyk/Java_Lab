public class ReverseWords {
    public static void main(String[] args) {
        // Check if input is provided
        if (args.length == 0) {
            System.out.println("Please provide a sentence as command-line argument.");
            return;
        }

        // Combine all command-line arguments into one string
        String input = String.join(" ", args);

        // Split into words
        String[] words = input.split(" ");

        // Reverse and print
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
