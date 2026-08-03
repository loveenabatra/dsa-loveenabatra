class Solution {
    public String RLE(String seq){
        StringBuilder sb=new StringBuilder();
        char[] n=seq.toCharArray();
        char cur=n[0];
        int cnt=0;
        for(char num:n){
            if(num==cur){
                cnt++;
            }
            else{
                sb.append(cnt);
                sb.append(cur);
                cur=num;
                cnt=1;
            }
        }
        sb.append(cnt);
        sb.append(cur);
        return sb.toString();
    }
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return RLE(countAndSay(n-1));
    }
}