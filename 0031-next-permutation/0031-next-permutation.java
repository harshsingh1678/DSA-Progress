class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;

        // step 1: find the break point (where idx < idx +1)
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        // if there is no breaking  point
        if (idx == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        } else {
            // step 2: find smallest in the array but greater than breaking point ele and swap with it
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[idx]) {
                    int temp = nums[idx];
                    nums[idx] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
        // just reverse the remaining array to get smallest array
        // becoj we already have large value than it
        reverse(nums, idx + 1, nums.length - 1);
        return;
    }

    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}