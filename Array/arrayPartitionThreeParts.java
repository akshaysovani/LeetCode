class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int length = A.length;
        int tot = 0;
        for (int i: A){
            tot+=i; 
        }          
        if (tot%3 != 0) return false;
        int target = tot/3;
        int i=0;
        int sum=0;
        while(i<length){
            sum+=A[i];
            if (sum==target){
                int j=i+1;
                int sum2=0;
                while(j<length){
                    sum2+=A[j];
                    if (sum2==target){
                        return true;
                    }
                    j++;
                }
            }
            i++;
        }
        return false;
    }
}