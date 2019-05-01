class Solution {
    public int pivotIndex(int[] nums) {
        int length = nums.length;
        if (length == 0 || length == 2){
            return -1;
        }
        if (length == 1){
            return 1;
        }
        int[] first = Arrays.copyOfRange(nums,1,length);
        int firstsum=0;
        for (int i: first){
            firstsum += i;
        }
        if (firstsum == 0) return 0;
        for (int i=1;i<length-1;i++){
            int[] prev = Arrays.copyOfRange(nums,0,i);
            int[] next = Arrays.copyOfRange(nums,i+1,length);
            int prevsum = 0;
            int nextsum = 0;
            for (int p: prev){
                prevsum += p;
            }
            for (int p: next){
                nextsum += p;
            }
            if (i==3){
                System.out.println(prevsum);
                System.out.println(nextsum);
            }
            if (prevsum == nextsum){
                return i;
            }
        }
        int[] last = Arrays.copyOfRange(nums,0,length-1);
        firstsum=0;
        for (int i: last){
            firstsum += i;
        }
        if (firstsum == 0) return length-1;
        return -1;
    }
}
}