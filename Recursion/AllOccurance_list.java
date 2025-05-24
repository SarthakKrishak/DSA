
import java.util.ArrayList;

//In this we are creating a new list everytime so when we are returning the answer then we have to check wheather the above call has some value, if yes then we have to add that one in the returning one. because everytime the recursion call is made then a new list is created.

public class AllOccurance_list {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4,4, 5, 6 };
        System.out.println(findAllIndex(arr,4,0));
    }
    
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index > arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls = findAllIndex(arr, target, index + 1);
        list.addAll(ansfromBelowCalls);
        return list;
    }
}
