import java.util.*;


public class celebrity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            s.push(i);
        }

        while (s.size() > 1) {
            int a = s.pop();
            int b = s.pop();

            if (mat[a][b] == 1) {
                s.push(b);
            } else {
                s.push(a);
            }
        }
        
        if (s.isEmpty()) {
            System.out.println("No Celebrity");
            return;
        }
        int pc = s.pop();

        for (int i = 0; i < n; i++) {
            if (i != pc) {
                if (mat[pc][i] != 0 || mat[i][pc] != 1) {
                    System.out.println("NO Celeb");
                    return;
                }
            }
        }
        System.out.println(pc+" Is the celebrity");
    }
}
