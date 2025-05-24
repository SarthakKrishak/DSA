import java.util.Arrays;
import java.util.Scanner;

public class practise {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            int s = i - 1;
            if (nums[s] + nums[i] == target) {
                return new int[] { i - 1, i };
            }
        }
        return new int[] {-1};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] num = new int[n];

        // Target input
        int target = sc.nextInt();

        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(twoSum(num, target)));
    }
}
