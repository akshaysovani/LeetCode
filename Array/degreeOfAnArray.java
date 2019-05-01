class Solution {
    public static int findShortestSubArray(int[] nums) {
        int length = nums.length;
        if (length == 1){
            return 1; 
        }
        Map<Integer,int[]> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],new int[]{1,i,i});
            }else{
                int[] arr = map.get(nums[i]);
                arr[0]++;
                arr[2] = i;
            }
        }
        
        int res = Integer.MAX_VALUE;
        int degree = Integer.MIN_VALUE;
        for (int[] a: map.values()){
            if (a[0]>degree){
                degree = a[0];
                res = a[2]-a[1]+1;
            }else if (a[0]==degree){
                if (a[2]-a[1]+1 < res){
                    res = a[2]-a[1]+1;
                }
            }
        }    
         return res;   
        
    }
}