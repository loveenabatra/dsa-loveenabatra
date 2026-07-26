class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int x=m*n;
        k%=x;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> r=new ArrayList<>();
            for(int j=0;j<n;j++){
                r.add(0);
            }
            ans.add(r);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int oldid=i*n+j;
                int newid=(oldid+k)%x;
                int newr=newid/n;
                int newc=newid%n;
                ans.get(newr).set(newc,grid[i][j]);
            }
        }
        return ans;
    }
}