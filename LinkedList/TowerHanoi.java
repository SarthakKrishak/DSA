import java.util.Scanner;

public class TowerHanoi {

    public static void towerHanoi(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.out.println("Tranfer disk" + n + "from" + src + "to" + dest);
            return;
        }
        towerHanoi(n - 1, src, dest, helper);
        System.out.println("Tranfer disk" + n + "from" + src + "to" + dest);
        towerHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerHanoi(n, "S", "H", "D");
    }
}
