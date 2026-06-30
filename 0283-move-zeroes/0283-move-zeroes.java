class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp=new int[nums.length];
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                temp[i]=nums[j];
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=temp[j];
        }
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}