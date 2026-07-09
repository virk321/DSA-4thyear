package day2;

public class maxSubarray{
    public static int subarray(int[] nums){
        int maxSum = nums[0];
        int curr = nums[0];

        for(int i=1; i<nums.length; i++){
            curr = Math.max(nums[i],curr+nums[i]);
            maxSum = Math.max(maxSum,curr);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subarray(nums));
    }
}
