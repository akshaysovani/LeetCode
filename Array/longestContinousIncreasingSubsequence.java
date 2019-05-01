class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        int count = 1;
        int maxCount = 0;
        int found = 0;
        for (int i=0;i<length-1;i++){
            if (nums[i]<nums[i+1]){
                count++;
            }else{
                found = 1;
                if (count > maxCount){
                    maxCount = count;
                }
                count = 1;
            }
        }
        if (found==0) return nums.length;
        if (count>maxCount){
            return count;
        }
        return maxCount;
    }
}