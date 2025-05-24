public class Passing_number {
    public static void main(String[] args) {
        fun(5);
    }
    
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // fun(n--);
        fun(--n);

        // n-- vs --n , since if we are using the n-- then it will pass the value 5 first and then substract so it will always pass the value 5 but if we are using --n then it will first substract the value and then pass the value.
    }
}
