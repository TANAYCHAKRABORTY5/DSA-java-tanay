package backtracking;



import java.util.Arrays;

class beautifulSubsets {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);  // Sort the array to handle subsets in order
        int[] count = new int[1001];  // Initialize count array to track occurrences of numbers
        return solve(0, nums, k, count) - 1;  // Subtract 1 to exclude the empty subset
    }

    private int solve(int i, int[] nums, int k, int[] count) {
        if (i >= nums.length) return 1;  // Base case: end of the array, count this subset
        int ans = 0;

        // Include nums[i] if it does not violate the beautiful subset condition
        if (nums[i] >= k && count[nums[i] - k] == 0) {
            count[nums[i]]++;
            ans += solve(i + 1, nums, k, count);
            count[nums[i]]--;
        }

        // Also consider the option of not including nums[i]
        ans += solve(i + 1, nums, k, count);
        return ans;
    }

    // Main method
    public static void main(String[] args) {
        beautifulSubsets solution = new beautifulSubsets();

        // Test case 1
        int[] nums1 = {1, 3, 2, 4};
        int k1 = 2;
        System.out.println("Number of beautiful subsets: " + solution.beautifulSubsets(nums1, k1));

        // Test case 2
//        int[] nums2 = {1, 1, 1, 1};
//        int k2 = 1;
//        System.out.println("Number of beautiful subsets: " + solution.beautifulSubsets(nums2, k2));
//
//        // Test case 3
//        int[] nums3 = {5, 10, 15};
//        int k3 = 5;
//        System.out.println("Number of beautiful subsets: " + solution.beautifulSubsets(nums3, k3));
    }
}
