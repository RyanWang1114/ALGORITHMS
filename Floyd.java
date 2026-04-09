public class Floyd {
    
    /* Given an array of integers containig n+1 integers
    where each integer is between 1 and n(inclusive), and there is exactly one duplicate number.
    Identify the duplicate number and explain the complete solution step by step
    required Space: O(1), required time: O(n)
     */
    public static void main(String[] args){
        int[] nums = {2,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums){
        int slow = 0;
        int fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];

        } while(slow!= fast);

        if(slow == 0&& fast == 0){
            throw new IllegalArgumentException();
        }

        fast = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        
        }
        return slow;
    }
}
