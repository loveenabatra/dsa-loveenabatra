class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int x:freq){
                    if(x>0){
                        max=Math.max(max,x);
                        min=Math.min(min,x);
                    }
                }
                sum+=max-min;
            }
        }
        return sum;
    }
}