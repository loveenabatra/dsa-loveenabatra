class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int[] s:reservedSeats){
            int r=s[0];
            int c=s[1];
            int mask=m.getOrDefault(r,0);
            if(c==2 || c==3){
                mask|=1;
            }
            else if(c==4 || c==5){
                mask|=3;
            }
            else if(c==6 || c==7){
                mask|=6;
            }
            else if(c==8 || c==9){
                mask|=4;
            }
            m.put(r,mask);
        }
        int max=(n-m.size())*2;
        for(int mask:m.values()){
            if((mask&1)==0 && (mask&4)==0){
                max+=2;
            }
            else if((mask&1)==0 || (mask&4)==0 || (mask&2)==0){
                max+=1;
            }
        }
        return max;
    }
}