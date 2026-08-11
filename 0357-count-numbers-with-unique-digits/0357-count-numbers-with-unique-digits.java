class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int res=10;
        int uniquedig=9;
        int avail=9;
        while(n-->1 && avail>0){
            uniquedig=uniquedig*avail;
            res+=uniquedig;
            avail--;
        }
        return res;
    }
}