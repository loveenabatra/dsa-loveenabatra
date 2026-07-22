class Solution {
    int count=0;
    public void dfs(char[][] grid,int r,int c,int row,int col){
        if(r<0 || r>=row || c<0 || c>=col || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        dfs(grid,r+1,c,row,col);
        dfs(grid,r-1,c,row,col);
        dfs(grid,r,c+1,row,col);
        dfs(grid,r,c-1,row,col);
    }
    public int numIslands(char[][] grid) {
        if(grid==null){
            return 0;
        }
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j,r,c);
                }
            }
        }
        return count;
    }
}