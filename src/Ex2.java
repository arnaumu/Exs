import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *   Input: "12:30pm-12:00am"
 *   Output: 690
 */
public class Ex2 {

    public static String StringChallenge(String str) {

        return str;
    }

    public static Boolean CheckString(String str) {
        Pattern p = Pattern.compile("^([0-9]|1[0-9]|2[0-3]):[0-5][0-9](pm|am)-([0-9]|1[0-9]|2[0-3]):[0-5][0-9](pm|am)$");
        Matcher m = p.matcher(str);

        if (!str.isEmpty()) {
            if (m.matches()) {
                System.out.println("String matches!");
                return true;
            } else {
                System.out.println("Not a valid input\n-----------------\nValid input example:\n'12:30pm-12:00am'\n");
            }
        } else{
            System.out.println("Empty input");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("Input: ");
        str = s.nextLine();

        while (!CheckString(str)) {
            System.out.print("Input: ");
            str = s.nextLine();
        }
    }
}
