class Solution {
    public boolean check(int[] nums) {
        int count = 0;

        for (int right = 1; right <= nums.length; right++) {
            if (nums[right - 1] > nums[right%nums.length])
                count++;
        }
        return count <= 1;
    }
}