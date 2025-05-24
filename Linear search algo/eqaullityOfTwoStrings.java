import java.util.Scanner;

public class eqaullityOfTwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        if (arr1.length != arr2.length) {
            System.out.println("Arrays have different lengths.");
            return;
        }

        boolean identical = true;
        StringBuilder mismatchIndices = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                identical = false;
                if (mismatchIndices.length() > 0) {
                    mismatchIndices.append(" ");
                }
                mismatchIndices.append(i);
            }
        }

        if (identical) {
            System.out.println("YES");
            System.out.println(arr1.length);
        } else {
            System.out.println("NO");
            System.out.println(mismatchIndices.toString());
        }
    }
}
