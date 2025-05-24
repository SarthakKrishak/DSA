// Amazon question

public class magicNumber{
    public static void main(String[] args) {
        // nth magic number
        int n = 6;
        int base = 5;
        
        int ans = 0;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans = ans + (last * base);
            base = base * 5;
        }
        
        System.out.println(ans);
    
    }
}