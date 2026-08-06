class Solution {
    public int[] findErrorNums(int[] nums) {
        int missing = 0;
        int duplicate = 0;
        int[] freq = new int[nums.length + 1];

        for (int ele : nums) {
            freq[ele]++;
        }

        for (int i = 1; i < nums.length + 1; i++) {
            if (freq[i] == 0)
                missing = i;
            if (freq[i] == 2)
                duplicate = i;
        }
        return new int[] { duplicate, missing };
    }
}