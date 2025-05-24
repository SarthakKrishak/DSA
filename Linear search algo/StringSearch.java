
import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "sarthak";
        char target = 'l';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Search(name, target));
    }

    static boolean Search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return true;
            }
        }
        return false;
        
    }
}
