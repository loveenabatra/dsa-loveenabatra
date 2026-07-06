class Solution {
    public String largestOddNumber(String num) {
        int idx=-1;
        int i;
        for(i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                idx=i;
                break;
            }
        }
        i=0;
        if(idx==-1) return "";
        return num.substring(i,idx+1);
    }
}