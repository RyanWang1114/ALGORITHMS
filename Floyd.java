/**
 * Finds a duplicate number using Floyd's tortoise-and-hare cycle detection.
 */
public class Floyd {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));
    }

    /**
     * Returns the duplicate without modifying the input array.
     *
     * <p>Requires n + 1 values in the range 1 through n, with exactly one
     * distinct value repeated. That value may appear more than twice.
     *
     * <p>Runs in O(n) time and uses O(1) extra space.
     */
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        // Treat each value as the index of the next node. Find a cycle meeting point.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Moving both pointers one step at a time locates the cycle entry.
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
