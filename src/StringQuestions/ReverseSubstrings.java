package StringQuestions;

public class ReverseSubstrings {
    public static void main(String[] args) {
        String str = "my_name_is_singh";
        StringBuilder s2 = new StringBuilder();

        // Split the string by underscores
        String[] parts = str.split("_");

        // Reverse each part and concatenate with underscores
        for (int i = 0; i < parts.length; i++) {
            // Reverse the current part
            s2.append(new StringBuilder(parts[i]).reverse().toString());
            // Append underscore if it's not the last part
            if (i < parts.length - 1) {
                s2.append("_");
            }
        }

        // Print the final result
        System.out.println("Transformed string: " + s2.toString());
    }
}
