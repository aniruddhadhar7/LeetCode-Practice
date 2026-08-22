class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int right=k-1;
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=k*threshold){
                count++;
            }
        while(right<arr.length-1){
            sum+=arr[right+1]-arr[left];
            left++;
            right++;
            if(sum>=k*threshold){
                count++;
            }
        }
        return count;
    }
}