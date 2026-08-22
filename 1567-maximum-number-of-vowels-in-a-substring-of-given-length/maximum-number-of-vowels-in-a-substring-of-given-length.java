class Solution {
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        char ch[]=s.toCharArray();
        int left=0;
        int right=k-1;
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(ch[i])){
                count++;
            }
        }
        int maxc=count;
        while(right<ch.length-1){
            if(isVowel(ch[left])){
                count--;
            }
            if(isVowel(ch[right+1])){
                count++;
            }
            
            left++;
            right++;

            maxc=Math.max(maxc,count);
        }
        return maxc;
    }
}