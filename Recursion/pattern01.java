public class pattern01 {
    public static void main(String[] args) {
        // patternupwards(4, 0);
        patterndownwards(4, 0);
    }

    static void patternupwards(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            patternupwards(r, c + 1);
            System.out.print("*");
        } else {
            patternupwards(r - 1, 0);
            System.out.println();
        }
    }
    static void patterndownwards(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            patterndownwards(r, c + 1);
        } else {
            System.out.println();
            patterndownwards(r - 1, 0);
        }
        
    }
}


