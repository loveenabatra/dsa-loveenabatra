class Solution {
    void reverse(int[] a,int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public int[] rotateright(int[] a,int k){
        int n=a.length;
        if(n==0 || k==0){
            return a;
        }
        k=k%n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        return a;
    }
    public void rotate(int[] nums, int k) {
        int[] ans=rotateright(nums,k);
        for(int n:ans){
            System.out.print(n);
        }
    }
}