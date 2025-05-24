//IN this we are not creating a new list everytime we are just passing the reference.
import java.util.ArrayList;

public class AllOccurance_return {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,4,5,4};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllOccurance(arr, 4, 0, list));
        // System.out.println(findAllOccurance(arr, 4, 0, new ArrayList<>()));
        //Above both are same.
    }
    
    static ArrayList<Integer> findAllOccurance(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index > arr.length - 1) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        return findAllOccurance(arr, target, index + 1, list);
    }
}
