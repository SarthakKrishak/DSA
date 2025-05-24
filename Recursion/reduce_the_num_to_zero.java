public class reduce_the_num_to_zero {
    public static void main(String[] args) {
       System.out.println(numberOfSteps(123));
    }
    
    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int steps) {
        //Base condition
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        } else {
            return helper(num - 1, steps + 1);
        }
    }
}