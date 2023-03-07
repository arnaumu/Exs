import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *   Input: "11:00pm-12:00pm"
 *   Output: 690
 */
public class Ex2 {

    public static String StringChallenge(String str) {
        //hour = {"hour1","hour2"}
        //hours = {(hour1:"hour","mins","am/pm"),(hour2:"hour","mins","am/pm")}          10:59pm -> 12:58pm
        String[] hour = str.split("-");
        String[][] hours = new String[2][3];

        for (int i = 0; i < hour.length; i++) {
            if (hour[i].length() < 7) {
                hours[i][0] = hour[i].substring(0, 1);
                hours[i][1] = hour[i].substring(2, 3);
                hours[i][2] = hour[i].substring(4, 6);
            } else {
                hours[i][0] = hour[i].substring(0, 2);
                hours[i][1] = hour[i].substring(3, 5);
                hours[i][2] = hour[i].substring(5, 7);
            }
        }
        System.out.println("Hora 1--->Hora: " + hours[0][0] + " Minutos: " + hours[0][1] + " Time: " + hours[0][2]);
        System.out.println("Hora 2--->Hora: " + hours[1][0] + " Minutos: " + hours[1][1] + " Time: " + hours[1][2]);


        return str;
    }

    public static Boolean CheckString(String str) {
        Pattern p = Pattern.compile("^([0-9]|1[0-9]|2[0-3]):[0-5][0-9](pm|am)-([0-9]|1[0-9]|2[0-3]):[0-5][0-9](pm|am)$");
        Matcher m = p.matcher(str);

        if (!str.isEmpty()) {
            if (m.matches()) {
                return true;
            } else {
                System.out.println("Not a valid input\n--------------------\nValid input example:\n'12:30pm-12:00am'\n'1:00pm-1:45pm'\n'11:30pm-12:00am'\n");
            }
        } else {
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

        System.out.println(StringChallenge(str));

    }
}


