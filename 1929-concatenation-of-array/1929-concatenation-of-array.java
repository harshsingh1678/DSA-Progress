class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int i = 0;

        for (int ele : nums) {
            ans[i++] = ele;
        }

        for (int ele : nums) {
            ans[i++] = ele;
        }

        return ans;
    }
}