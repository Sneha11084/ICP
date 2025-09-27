// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int n = nums.length - k + 1;
//         int[] arr = new int[n];
//         int p = 0;

//         for (int i = 0; i <= nums.length - k; i++) {
//             int max = nums[i];
//             for (int j = i; j < i + k; j++) {
//                 if (nums[j] > max) {
//                     max = nums[j];
//                 }
//             }
//             arr[p] = max;
//             p++;
//         }
//         return arr;
//     }
// }



import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if (n == 0 || k == 0) return new int[0];
        
        int[] result=new int[n - k + 1];
        Deque<Integer> dq =new ArrayDeque<>();
        
        for (int i=0; i<n; i++) {
            while (!dq.isEmpty() && dq.peekFirst()<=i-k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] <=nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i>=k-1) {
                result[i-k+1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}