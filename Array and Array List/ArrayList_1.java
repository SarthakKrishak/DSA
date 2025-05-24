import java.util.*;

public class ArrayList_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //This "Integer" is a wrapper class
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(2);
        // list.add(5);
        // list.add(70);
        // list.add(40);
        // list.add(40);
        // list.add(90);
        // list.set(0, 5);

        // list.remove(2);
        // System.out.println(list);
        // System.out.println(list.contains(100));

        // giving Input to Array List
        for (int row = 0; row < 5; row++) {
            list.add(sc.nextInt());
        }

        //Output of list, list[index] will not work here.
        for (int row = 0; row < 5; row++) {
            System.out.print(list.get(row));
        }

        //The initial capacity of 10 is now important we can add as many as we want.

    }
}
