import java.util.ArrayList;
import java.util.Collections;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        ArrayList list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        if(list.contains(target)){
            return list.indexOf(target);
        }
        list.add(target);
        Collections.sort(list);
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        SearchInsertPosition test = new SearchInsertPosition();
        int[] nums = {1,3,4,6};
        int target = 2;
        System.out.println(test.searchInsert(nums,target));
    }
}
