public class setBits {
    public static void main(String[] args) {
        int n = 2000;
        //To display it in binary
        System.out.println(Integer.toBinaryString(n));
        int ans = setBits(n);
        System.out.println("Total setbits are"+" "+ans);
    }

    static int setBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n -= (n & -n);
        }
        return count;
    }
}
