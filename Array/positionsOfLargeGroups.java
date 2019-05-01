class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> answer = new ArrayList<>();
        char[] arr = S.toCharArray();
        int length = arr.length;
        if (length < 3) return answer;
        
        for (int i=0;i<length-1;i++){
            int start = i;
            while(i<length-1 && arr[i]==arr[i+1]){
                i++;
            }    
            if (i-start+1 >= 3){
                List<Integer> small = new ArrayList<>();
                small.add(start);
                small.add(i);
                answer.add(small);
            }
        }
        return answer;
    }
}