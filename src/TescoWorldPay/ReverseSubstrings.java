package TescoWorldPay;
public class ReverseSubstrings {
    public static void main(String[] args) {
        String str = "my_name_is_singh";
        StringBuilder result = new StringBuilder();

        // Split the string by underscores
        String[] parts = str.split("_");

        // Reverse "my" and "singh" only
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals("my") || parts[i].equals("singh")) {
                // Reverse the current part if it's "my" or "singh"
                result.append(new StringBuilder(parts[i]).reverse().toString());
            } else {
                // Keep other parts as they are
                result.append(parts[i]);
            }
            // Append underscore if it's not the last part
            if (i < parts.length - 1) {
                result.append("_");
            }
        }

        // Print the final result
        System.out.println("Transformed string: " + result.toString());
    }
}
