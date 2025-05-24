import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String name = "Sarthak krishak";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.getBytes());
        System.out.println(name.endsWith("k"));
        System.out.println("      sarth ak    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}