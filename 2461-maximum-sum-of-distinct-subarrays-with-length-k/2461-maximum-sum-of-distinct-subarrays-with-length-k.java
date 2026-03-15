class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long cursum = 0;
        long maxsum = 0;
        int left = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right]) || set.size() == k) {
                set.remove(nums[left]);
                cursum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            cursum += nums[right];

            if (set.size() == k) {
                maxsum = Math.max(maxsum, cursum);
            }
        }
        return maxsum;
    }
}