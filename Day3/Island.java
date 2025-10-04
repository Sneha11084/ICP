class Solution {
    public int numIslands(char[][] grid) {
        int c = 0;
        for(int i = 0; i < grid.length; i ++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]=='1'){
                    c++;
                    clear(grid,i,j);
                }
            }
        }
        return c;
    }
        
        void clear(char[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
        return;
    }
    grid[i][j] = '0';
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    for(int d[]: dir){
        clear(grid,i+d[0],j+d[1]);
    }
        }
}
