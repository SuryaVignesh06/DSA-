import java.util.Arrays;
class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long currentSum = 0;
        int maxLen= 0;


        for (int right = 0; right < nums.length;right++){
            currentSum += nums[right];



            while ((long) nums[right] * (right - left + 1)- currentSum>k){
                currentSum -= nums[left];
                left++;
            }
            maxLen = Math.max(maxLen,right - left + 1);
        }
        return maxLen;
        
    }
}