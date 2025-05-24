public class duplicates {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 2, 6, 4 };
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            //The xor of two numbers when they are same is zero and if we xor that number with that number then we get that number .
            unique ^= n;
        }
        return unique;
    }
}
