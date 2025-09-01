public class LC_974 {
    static int subarraysDivByK(int[] nums, int k) {
        int[] freq = new int[k];
        freq[0] = 1;
        int sum = 0;
        int count = 0;
        for (int ele : nums) {
            sum += ele;
            int r = ((sum % k) + k) % k;
            count += freq[r];
            freq[r]++;
        }
        for (int ele : freq)
            System.out.print(ele + " ");
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        System.out.println(subarraysDivByK(nums, k));
    }
}
