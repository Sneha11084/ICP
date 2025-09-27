class Solution {
    public int findKthLargest(int[] nums, int k) {
        for(int i =0; i<k; i++){
            int maxin=0;
            for(int j=1; j <nums.length; j++){
                if(nums[j]>nums[maxin]){
                    maxin=j;
                }
            }
            if (i==k-1) return nums[maxin]; 
            nums[maxin]=Integer.MIN_VALUE; 
        }
        return -1; 
    }
}
