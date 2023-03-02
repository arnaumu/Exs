import java.util.Scanner;

/**
 * Ex #1
 * String ex:
 * Input: aabbcd
 * Output: 2a2b1c1d
 */

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        System.out.println(StringChallenge(s.nextLine()));
    }

    public static String StringChallenge(String str) {
        String result = "Output: ";
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
            result += String.valueOf(reps) + str.charAt(i);
        }
        return result;
    }
}