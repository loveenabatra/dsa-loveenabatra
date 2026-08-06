class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean neg=(dividend<0)^(divisor<0);
        long dvd=Math.abs((long)dividend);
        long div=Math.abs((long)divisor);
        int ans=0;
        while(dvd>=div){
            long temp=div;
            int mul=1;
            while(dvd>=(temp<<1)){
                temp<<=1;
                mul<<=1;
            }
            dvd-=temp;
            ans+=mul;
        }
        return neg? -ans:ans;
    }
}