class Solution {
    static void reverse(int[] a,int start,int end){
        while(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void nextPermutation(int[] nums) {
        int id=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                id=i;
                break;
            }
        }
        if(id==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>id;i--){
            if(nums[i]>nums[id]){
                swap(nums,i,id);
                break;
            }
        }
        reverse(nums,id+1,nums.length-1);
    }
}