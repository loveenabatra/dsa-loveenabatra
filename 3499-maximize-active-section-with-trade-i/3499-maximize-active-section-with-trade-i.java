class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        char[] a=s.toCharArray();
        int n=a.length;
        int one=0;
        int b1=0;
        int b2=0;
        int max=0;
        int i=0;
        while(i<n){
            char c=a[i];
            if(c=='0'){
                b1++;
                i++;
            }
            else{
                while(i<n && a[i]=='1'){
                    i++;
                    one++;
                }
                while(i<n && a[i]=='0'){
                    i++;
                    b2++;
                }
                if(b1!=0 && b2!=0){
                    max=Math.max(max,b1+b2);
                }
                b1=b2;
                b2=0;
            }
        }
        return one+max;
    }
}