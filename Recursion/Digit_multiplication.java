public class Digit_multiplication {
    public static void main(String[] args) {
        System.out.println(digitMul(23));
    }

    static int digitMul(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10)*digitMul(n/10); 
    }
}
