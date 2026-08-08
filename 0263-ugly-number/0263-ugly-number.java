class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        int[] fac={2,3,5};
        for(int i:fac){
            while(n%i==0){
                n/=i;
            }
        }
        return n==1;
    }
}