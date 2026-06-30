class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        int idx=0;
        for(int n:nums){
            if(!s.contains(n)){
                s.add(n);
                nums[idx]=n;
                idx++;
            }
        }
        return idx;
    }
}