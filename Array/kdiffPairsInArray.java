class Solution {
    public int findPairs(int[] nums, int k) {
        
        if (nums.length == 0 || k<0){
            return 0;
        }
        Map<Integer,Integer> diffMap = new HashMap<>();
        for (int i: nums){
            diffMap.put(i,diffMap.getOrDefault(i,0)+1);    
        }
        int counter = 0;
        for (Map.Entry<Integer,Integer> entry: diffMap.entrySet()){
            if (k==0){
                if (entry.getValue() > 1){
                    counter++;
                }
            }else{
                if (diffMap.containsKey(entry.getKey() + k)){
                    counter++;
                }
            }
        }
        return counter;
    }        
}