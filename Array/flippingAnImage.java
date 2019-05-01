class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] answer = new int[rows][cols];
        if (rows == 1){
            if (A[0][0] == 0){
                answer[0][0] = 1;
                return answer;
            }else{
                answer[0][0] = 0;
                return answer;
            }
        }
        
        for (int i=0;i<rows;i++){
            int[] r = reverseIt(A[i]);
            for (int j=0;j<r.length;j++){
                if (r[j] == 0){
                    r[j] = 1; 
                }else{
                    r[j] = 0; 
                }
            }
            answer[i] = r;
        }
        return answer;
    }
    private static int[] reverseIt(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}