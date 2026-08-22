class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0;
        int right=k-1;
        int count=0;
        char ch[]=blocks.toCharArray();
        for(int i=0;i<k;i++){
            if(ch[i]=='W'){
                count++;
            }
        }
        int minc=count;
        while(right<ch.length-1){
            if(ch[left]=='W'){
                count--;
            }
            if(ch[right+1]=='W'){
                count++;
            }
            left++;
            right++;

            minc=Math.min(minc,count);
        }
        return minc;
    }
}