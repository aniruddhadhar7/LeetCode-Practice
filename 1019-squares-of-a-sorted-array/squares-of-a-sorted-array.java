class Solution {
    public int[] sortedSquares(int[] nums) {
        int sqarr[]=new int[nums.length];
        int sq=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sq=nums[i]*nums[i];
            sqarr[j]=sq;
            j++;
        }
        Arrays.sort(sqarr);
        return sqarr;
    }
}