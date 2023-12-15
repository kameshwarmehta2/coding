package Array;

import java.util.HashMap;
public class Twosum {
    
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = target - nums[i];
            if (hm.containsKey(temp)) {
                int var = hm.get(temp);
                arr[0] = var;
                arr[1] = i;
            } else {
                hm.put(nums[i], i);
            }
        }
        return arr;
    }
}


