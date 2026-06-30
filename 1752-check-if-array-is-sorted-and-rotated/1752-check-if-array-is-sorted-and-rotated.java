class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        boolean c=false;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                if (c) return false;
                c=true;
            }
        }
        return true;
    }
}