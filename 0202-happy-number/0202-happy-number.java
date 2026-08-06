class Solution {
    public boolean isHappy(int n) {
        Set<Integer> vis=new HashSet<>();
        while(!vis.contains(n)){
            vis.add(n);
            n=getnext(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    int getnext(int n){
        int ans=0;
        while(n>0){
            int dig=n%10;
            ans+=dig*dig;
            n/=10;
        }
        return ans;
    }
}