class Solution {
    public int[][] imageSmoother(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;
        int[][] ans = new int[rows][cols];
        
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                int sum = M[i][j];
                int count = 1;
                
                if (i>0){
                    sum += M[i-1][j];
                    count++;
                    if (j>0){
                        sum += M[i-1][j-1];
                        count++;
                    }
                    if (j<cols-1){
                        sum += M[i-1][j+1];
                        count++;
                    }
                }
                
                if (i<rows-1){
                    sum += M[i+1][j];
                    count++;
                    if (j>0){
                        sum += M[i+1][j-1];
                        count++;
                    }
                    if (j<cols-1){
                        sum += M[i+1][j+1];
                        count++;
                    }
                }
                
                if(j>0){
                    sum+=M[i][j-1];
                    count++;
                }
                if(j<cols-1){
                    sum+=M[i][j+1];
                    count++;
                }
                ans[i][j] = sum/count;
            }
            
        }
        return ans;
    }
}