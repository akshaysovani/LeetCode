class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        //if (nums.length == 0){
          //  return opMat;
        //}
        
        int rows = nums.length;
        int cols = nums[0].length;
        if ((rows * cols) != (r*c)){
            return nums;
        }
        List<Integer> myList = new ArrayList<>();
        int[][] opMat = new int[r][c];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                myList.add(nums[i][j]);
            }
        }
        int ele = 0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                opMat[i][j] = myList.get(ele);
                ele++;
            }
        }
        return opMat;
    }
}