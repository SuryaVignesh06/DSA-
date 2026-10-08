class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        int minSum=nums[0];

        for(int i = 1;i<nums.length;i++){
            int tempSum = sum;
            sum = Math.max(nums[i],Math.max(tempSum * nums[i],minSum * nums[i]));
            minSum = Math.min(nums[i],Math.min(tempSum * nums[i],minSum * nums[i]));

            max = Math.max(max,sum);
        }
        return max;
      
        
    }
}
