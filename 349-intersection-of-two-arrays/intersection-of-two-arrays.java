class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set=new HashSet<>();
        for(int n1:nums2){
            set.add(n1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int n2:nums1){
            if(set.contains(n2)){
                list.add(n2);
                set.remove(n2);
            }
        }
        int newarr[]=new int[list.size()];
        int i=0;
        for(int n:list){
            newarr[i]=n;
            i++;
        }
        return newarr;
    }
}