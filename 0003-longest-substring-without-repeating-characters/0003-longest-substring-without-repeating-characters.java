class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            int[] hash=new int[256];
            Arrays.fill(hash,0);
            for(int j=i;j<n;j++){
                if(hash[s.charAt(j)]==1){
                    break;
                }
                hash[s.charAt(j)]=1;
                int len=j-i+1;
                max=Math.max(max,len);
            }
        }
        return max;
    }
}