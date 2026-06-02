class Solution {
    public int pivotIndex(int[] nums) {

        int totalsum = 0;

        // cal total sum
        for (int num : nums)
            totalsum += num;

        int leftsum = 0;

        // check pivot
        for (int i = 0; i < nums.length; i++) {
            int rightsum = totalsum - leftsum - nums[i];

            if (leftsum == rightsum)
                return i;

            leftsum += nums[i];
        }
        return -1;
    }
}