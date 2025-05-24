public class que3_letterSearch {
   public static void main(String[] args) {
      char[] arr = { 'a','b','d' };
      char target = 'a';
      char ans = letter(arr, target);
      System.out.println(ans);
   }
   
   static char letter(char [] arr, char target) {
      int start = 0;
      int end = arr.length - 1;

      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (target < arr[mid]) {
            end = mid - 1;
         } else {
            start = mid + 1;
         }
      }
      
      return arr[start%arr.length];
   }

}
