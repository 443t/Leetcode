package ArrayPartition1;

import java.util.Arrays;

public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            sum += Math.min(nums[i], nums[i + 1]);
            i++;
        }
        return sum;
    }
}