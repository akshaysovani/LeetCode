class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length];
        arr[0] = cost[0];
        arr[1] = cost[1];
        for (int i=2;i<cost.length;i++){
            arr[i] = Math.min(arr[i-1],arr[i-2])+cost[i];
        }
        return Math.min(arr[arr.length-1],arr[arr.length-2]);
    }
}