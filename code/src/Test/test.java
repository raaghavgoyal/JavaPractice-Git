package Test;
//Vlink Java + SQL 18LP
//Maximum Subarray with largest sum
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//
//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
public class test {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubarray(nums);
        System.out.println(ans);
    }
    static int maxSubarray(int[] nums){
        int maxSoFar = nums[0];
        int maxEnd = nums[0];

        for(int i = 1; i<nums.length; i++){
            maxEnd = Math.max(nums[i], nums[i]+maxEnd);
            maxSoFar = Math.max(maxSoFar,maxEnd);
        }
        return maxSoFar;
    }

}
