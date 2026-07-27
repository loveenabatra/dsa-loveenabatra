class Solution {
    public int countmost(int[] nums,int k){
        int left=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                k--;
            }
            while(k<0){
                if(nums[left]%2!=0){
                    k++;
                }
                left++;
            }
            ans+=(i-left+1);
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return countmost(nums,k)-countmost(nums,k-1);
    }
}