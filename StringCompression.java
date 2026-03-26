public class StringCompression {
    public static void main(String[] args) {
        String input = "abbccccc";
        String result = compressString(input);
        System.out.println(result);
    }

    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            
            // Check next character
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Add character
                compressed.append(str.charAt(i));
                
                // Add count only if > 1
                if (count > 1) {
                    compressed.append(count);
                }
                
                // Reset count
                count = 1;
            }
        }

        return compressed.toString();
    }
}