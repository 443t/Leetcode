package MaximumSubarray;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int maxForward = nums[0];
        int maxSoFar = nums[0];

        for (int i = 0; i < nums.length; ++i) {

            maxForward = Math.max(maxForward + nums[i], maxForward);
            maxSoFar = Math.max(maxForward, maxSoFar);
        }

        return maxSoFar;
    }
}
