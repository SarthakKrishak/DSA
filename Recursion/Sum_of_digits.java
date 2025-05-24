public class Sum_of_digits {
    public static void main(String[] args) {
        System.out.println(digitSum(1433));
    }

    static int digitSum(int n) {
        // we are checking for the single digit case here
        if (n / 10 == 0) {
            return n;
        }

        int remainder = n % 10;         // 3
        int N = n / 10;                 // 143

        return remainder + digitSum(N);
    }
}
