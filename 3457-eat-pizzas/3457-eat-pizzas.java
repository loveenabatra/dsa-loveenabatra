class Solution {
    public long maxWeight(int[] pizzas) {
        long ans=0;
        long days=pizzas.length/4;
        long oddday=(days+1)/2;
        Arrays.sort(pizzas);
        for(int i=pizzas.length-1,day=1;day<=days;i--,day++){
            if(day>oddday){
                i--;
            }
            ans+=(long)pizzas[i];
        }
        return ans;
    }
}