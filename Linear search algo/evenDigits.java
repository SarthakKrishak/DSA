
public class evenDigits {

    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 4, 50};
        System.out.println(findNumber(arr));
    }

    static int findNumber(int[] arr) {
        int count = 0;
        for (int elem : arr) {
            if (even(elem)) {
                count++;
            }
        }
        return count;
    }

    //Function to check wheather a number contains even digits.
    static boolean even(int elem) {
        int num = digits(elem);
        return num % 2 == 0;
    }

    //Count the no of digits
    static int digits(int elem) {
        int count = 0;
        while (elem > 0) {
            count++;
            elem = elem / 10;
        }
        return count;
    }

}
