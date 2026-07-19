class Solution {
    public String smallestSubsequence(String s) {
        int[] freq=new int[128];
        StringBuilder sb=new StringBuilder();
        boolean[] vis=new boolean[128];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        for(char c:s.toCharArray()){
            freq[c]--;
            if(vis[c]){
                continue;
            }
            while(sb.length()>0 && last(sb)>c && freq[last(sb)]>0){
                vis[last(sb)]=false;
                sb.setLength(sb.length()-1);
            }
            sb.append(c);
            vis[c]=true;
        }
        return sb.toString();
    }
    char last(StringBuilder sb){
        return sb.charAt(sb.length()-1);
    }
}