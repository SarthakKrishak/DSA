//To find the number of elements that contains even digits

public class EvenCountDigits {
    public static void main(String[] args) {
        int[] arr = { 122, 5, 452, 25678 };
        int ans = countDigits(arr);
        System.out.println(ans);
    }
    
    static int countDigits(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }


    static boolean even(int a) {
        if (a < 0) {
            a = a * -1;
        }
        
        
        int repeat =0;
        while (a > 0) {
            repeat++;
            a = a / 10;

        }

        if (repeat % 2 == 0) {
            return true;
        }
        return false;
    }
}
