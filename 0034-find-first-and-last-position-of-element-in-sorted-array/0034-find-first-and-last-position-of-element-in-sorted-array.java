class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] { firstElement(nums, target), lastElement(nums, target) };
    }

    public static int firstElement(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                first = mid;
                high = mid - 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }

    public static int lastElement(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == arr[mid]) {
                last = mid;
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last;
    }
}