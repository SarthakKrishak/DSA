
import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for pallindrom: ");
        String str = sc.nextLine();
        if (isPallindrom(str)) {
            System.out.println(str + " is a pallindrom");
        }
        else {
            System.out.println(str + " is not a pallindrom");
        }
    }
    
    static boolean isPallindrom(String str) {
        if (str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
    
        for (int i = 0; i <= str.length() / 2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
