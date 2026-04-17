import java.util.Scanner;

public class StringStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int upper = 0, lower = 0, digits = 0, spaces = 0;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digits++;
            else if (Character.isWhitespace(ch))
                spaces++;
        }

        System.out.println("Uppercase characters: " + upper);
        System.out.println("Lowercase characters: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
