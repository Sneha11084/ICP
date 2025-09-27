class Solution {
    public int[] searchRange(int[] arr, int target) {
     int n=arr.length;
     int ans []= new int[2];
      ans = new int[]{-1,-1};
     if(n==0) return ans;
      ans[0]=first(arr,target);
      ans[1]=last(arr,target);
     return ans;
    }

    public int first(int [] arr , int k){
        int ans=-1;
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid= i+(j-i)/2;
            if(arr[mid]==k){
                ans=mid;
                j=mid-1;
            }
            else if(arr[mid]>k){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
            
        }
        return ans;
        
    }


    public int last(int [] arr , int k){
        int ans=-1;
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid= i+(j-i)/2;
            if(arr[mid]==k){
                ans=mid;
                i=mid+1;
            }
            else if(arr[mid]>k){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
            
        }
        return ans;
        
    }
}