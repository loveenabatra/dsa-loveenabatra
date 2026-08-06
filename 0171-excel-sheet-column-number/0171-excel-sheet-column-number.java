class Solution {
    public int titleToNumber(String columnTitle) {
        long ans=0;
        for(int i=0;i<columnTitle.length();i++){
            char c=columnTitle.charAt(i);
            ans=ans*26+(c-'A'+1);
        }
        return (int)ans;
    }
}