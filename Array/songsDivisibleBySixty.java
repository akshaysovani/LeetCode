class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        for (int i: time){
            count[i%60]++;
        }
        int ans = 0;
        for (int i=0;i<=30;i++){
            if (i==0 || i==30){
                ans += (count[i]*(count[i]-1))/2;
                continue;
            }
            ans += count[i] * count[60-i];
        }
        return ans;
    }
}