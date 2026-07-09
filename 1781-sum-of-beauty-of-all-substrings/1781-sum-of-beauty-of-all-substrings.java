class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            Map<Character,Integer> m=new HashMap<>();
            for(int j=i;j<n;j++){
                m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int x:m.values()){
                    min=Math.min(min,x);
                    max=Math.max(max,x);
                }
                sum+=(max-min);
            }
        }
        return sum;
    }
}