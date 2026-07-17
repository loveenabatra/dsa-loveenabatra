class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max=0;
        for(int x:nums){
            max=Math.max(max,x);
        }
        long[] freq=new long[max+1];
        for(int x:nums) freq[x]++;
        long[] div=new long[max+1];
        for(int i=1;i<=max;i++){
            for(int j=i;j<=max;j+=i){
                div[i]+=freq[j];
            }
        }
        long[] exact=new long[max+1];
        for(int i=max;i>=1;i--){
            exact[i]=div[i]*(div[i]-1)/2;
            for(int j=2*i;j<=max;j+=i){
                exact[i]-=exact[j];
            }
        }
        long[] pref=new long[max+1];
        for(int i=1;i<=max;i++){
            pref[i]=pref[i-1]+exact[i];
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            long target=queries[i]+1;
            int l=1,r=max;
            while(l<r){
                int mid=l+(r-l)/2;
                if(pref[mid]>=target){
                    r=mid;
                }
                else{
                    l=mid+1;
                }
            }
            ans[i]=l;
        }
        return ans;
    }
}