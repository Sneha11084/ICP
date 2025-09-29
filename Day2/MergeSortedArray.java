class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int m1= 0;
        int n1=0;
        while(m1<m+n && n1 < n){
            
                if(nums1[m1]<=nums2[n1]){
                    m1++;
                }
                else{
                    for(int j = m+n-1; j > m1; j--){
                        nums1[j]= nums1[j-1];
                    }
                    nums1[m1]= nums2[n1];
                    m1++;
                    n1++;
                }
            
        }
        int left = n-n1;
        while(n1<n){
            nums1[m1-left] = nums2[n1];
            left--;
            n1++;
            
        }
    }
}
