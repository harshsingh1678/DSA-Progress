class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] { findFirst(nums, target), findLast(nums, target) };
    }

    public static int findFirst(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (x == arr[mid]) {
                first = mid;
                high = mid - 1;
            } else if (x < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return first;
    }

    public static int findLast(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (x == arr[mid]) {
                last = mid;
                low = mid + 1;
            } else if (x < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return last;
    }
}