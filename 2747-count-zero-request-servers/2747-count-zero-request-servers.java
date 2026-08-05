class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs,(a,b)->a[1]-b[1]);
        int m=queries.length;
        int[][] q=new int[m][2];
        for(int i=0;i<m;i++){
            q[i][0]=queries[i];
            q[i][1]=i;
        }
        Arrays.sort(q,(a,b)->a[0]-b[0]);
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,r=0;
        int[] ans=new int[m];
        for(int[] qu:q){
            int time=qu[0];
            while(r<logs.length && logs[r][1]<=time){
                int ser=logs[r][0];
                map.put(ser,map.getOrDefault(ser,0)+1);
                r++;
            }
            while(l<r && logs[l][1]<time-x){
                int ser=logs[l][0];
                map.put(ser,map.get(ser)-1);
                if(map.get(ser)==0){
                    map.remove(ser);
                }
                l++;
            }
            ans[qu[1]]=n-map.size();
        }
        return ans;
    }
}