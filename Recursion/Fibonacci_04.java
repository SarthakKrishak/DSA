//Fibonacci numbers are the series of number in which the number is the sum of its previous numbers.

//Recurrence relation
// Fib(n) = Fib(n-1)+Fib(n-2);

public class Fibonacci_04 {
    public static void main(String[] args) {
        //Fourth fibonacci number
        System.out.println(fib(2));
    }

    static int fib(int n) {
        if (n<2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
