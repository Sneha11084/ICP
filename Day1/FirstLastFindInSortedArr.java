class Solution {
    public int[] searchRange(int[] nums, int target) {
         if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int[] result = {-1, -1};


        int s = 0;
        int e = nums.length - 1;


        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        

        if (s < nums.length && nums[s] == target) {
            result[0] = s; 
        } else {
            return new int[]{-1, -1}; 
        }


        e = nums.length - 1;

        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] <= target) {
                s = mid + 1; 
            } else {
                e = mid - 1; 
            }
        }

        result[1] = e; 
        return result;
    }
}