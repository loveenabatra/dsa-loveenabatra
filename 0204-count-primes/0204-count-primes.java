class Solution {
    public int countPrimes(int n) {
        boolean[] notprime=new boolean[n];
        int cnt=0;
        for(int i=2;i<n;i++){
            if(notprime[i]==false){
                cnt++;
                for(int j=2;i*j<n;j++){
                    notprime[i*j]=true;
                }
            }
        }
        return cnt;
    }
}