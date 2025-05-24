public class Reverse_number {
    public static void main(String[] args) {
        reverseNum(-2022);   //the output should be 321.
    }

    static void reverseNum(int n) {
        if (Math.abs(n) == 0) return;
        System.out.print(Math.abs(n) % 10); // print last digit
        reverseNum(Math.abs(n) / 10); // process remaining digits
    }
}
