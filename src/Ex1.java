import java.util.Scanner;

/**
 * Ex #1
 * String ex:
 * Input: aabbcd
 * Output: 2a2b1c1d
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        System.out.print(StringChallenge(s.nextLine()));
    }

    public static String StringChallenge(String str) {
        if (CheckInput(str)) {
            StringBuilder result = new StringBuilder("Output: ");
            int reps;

            for (int i = 0; i <= str.length() - 1; i++) {
                reps = 1;
                int x = i;
                try {
                    while (str.charAt(x) == str.charAt(x + 1)) {
                        reps++;
                        x++;
                        i = x;
                    }
                } catch (StringIndexOutOfBoundsException ignored) {
                }
                result.append(reps).append(str.charAt(i));
            }
            return result.toString();
        } else {
            return "Not a valid input";
        }
    }

    public static boolean CheckInput(String str) {
        return str.matches("[a-z]+");
    }
}