class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        while(right<nums.length-1){
            sum+=nums[right+1]-nums[left];
            left++;
            right++;
            max=Math.max(max,sum);
            
        }
        double avg=(double)max/k;
        return avg;
    }
}