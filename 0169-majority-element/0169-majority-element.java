class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int value = 0;

        // moore voting algorithm

        for (int ele : nums) {
            if (count == 0) {
                value = ele;
            }
            if (ele == value) {
                count++;
            } else {
                count--;
            }
        }
        return value;
    }
}