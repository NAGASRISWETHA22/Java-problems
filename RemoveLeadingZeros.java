import java.util.Scanner;

public class RemoveLeadingZeros {

    public static String removeLeadingZeros(String str) {

        int i = 0;
        int n = str.length();

        while (i < n && str.charAt(i) == '0') {
            i++;
        }

        if (i == n) {
            return "0";
        }

        String result = "";
        for (int j = i; j < n; j++) {
            result += str.charAt(j);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String output = removeLeadingZeros(str);

        System.out.println("Result: " + output);

        sc.close();
    }
}
