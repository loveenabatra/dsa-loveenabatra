class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> s=new HashSet<>();
        int i=0;
        for(int n:nums){
            if(!s.contains(n)){
                s.add(n);
                nums[i]=n;
                i++;
            }
        }
        return i;
    }
}