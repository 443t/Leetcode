package MoveZeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        if (nums == null) return;

        int nullIndex = 0;
        int start = 0;
        boolean isNullExists = false;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nullIndex = i;
                isNullExists = true;
                break;
            }
        }

        if (!isNullExists) return;

        start = (nullIndex == 0) ? 0 : nullIndex;

        for (int i = start; i < nums.length; i++) {
            if (!(nums[i] == 0)) {
                nums[nullIndex] = nums[i];
                nums[i] = 0;
                nullIndex += 1;
            }
        }

    }
}