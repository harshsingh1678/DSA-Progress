class Solution {
    public long gcdSum(int[] nums) {
        long max = Integer.MIN_VALUE;
        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            arr[i] = GCD(max, nums[i]);
        }

        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;
        long sum = 0;

        while (low < high) {
            sum += GCD(arr[high], arr[low]);
            low++;
            high--;
        }
        return sum;
    }

    // x should me greater than y
    private static long GCD(long x, long y) {
        while (y != 0) {
            long rem = x % y;
            x = y;
            y = rem;
        }
        return x;
    }
}