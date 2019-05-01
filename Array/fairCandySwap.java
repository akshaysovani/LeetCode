class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int a_tot = 0;
        int b_tot = 0;
        for (int a: A){
            a_tot += a;
        }
        for (int b: B){
            b_tot += b;
        }
        int diff = (b_tot - a_tot)/2;
        Set<Integer> set = new HashSet<>();
        for (int b: B){
            set.add(b);
        }
        
        for (int a: A){
            if (set.contains(a+diff)){
                return new int[]{a,a+diff};
            }
        }
        return new int[]{};
    }
}