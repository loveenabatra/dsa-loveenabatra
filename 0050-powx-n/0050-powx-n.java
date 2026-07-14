class Solution {
    public double Power(double x, long n) {
        if(n==0 || x==1){
            return 1;
        }
        if(n<0){
            return 1.0/Power(x,-n);
        }
        if(n%2==1){
            return x*Power(x*x,(n-1)/2);
        }
        else{
            return Power(x*x,n/2);
        }
    }
    public double myPow(double x,int n){
        return Power(x,(long)n);
    }
}