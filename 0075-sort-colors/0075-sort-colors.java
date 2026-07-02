class Solution {
    public void sortColors(int[] nums) {
        int count0=0,count1=0,count2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int idx=0;
        while(count0-->0){
            nums[idx++]=0;
        }
        while(count1-->0){
            nums[idx++]=1;
        }
        while(count2-->0){
            nums[idx++]=2;
        }
    }
}