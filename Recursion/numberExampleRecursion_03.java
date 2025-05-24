public class numberExampleRecursion_03 {
    public static void main(String[] args) {
        number(1);
    }

    // public static void number(int n) {
    //     System.out.println(n);
    //     n++;
    //     if (n < 4) {
    //         number(n);
    //     }
    // }

    public static void number(int n) {
        //Base condition for recursion which tells where to stop calling
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        number(n + 1);
    }

    //In stack for every n the memory is occupied so without the base condition the memory of the computer will exceed and its the stack overflow error.
    
}
