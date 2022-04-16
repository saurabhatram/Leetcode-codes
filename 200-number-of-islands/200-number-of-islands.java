class Solution {
    public int numIslands(char[][] grid) {
        
    int count=0;
    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]=='1')
            {   
                count++;
                dfs(grid,i,j);
            }
        }
    }
        
        return count;
        
    }
    
 static int[][] dir={{-1,0},{0,-1},{1,0},{0,1}};
    
    public static void dfs(char[][] grid,int i,int j)
    {
        int m= grid.length;
        int n= grid[0].length;
    
    grid[i][j]='0';
    
    for(int k=0;k<dir.length;k++)
    {
       int r=i+dir[k][0];
      int  c=j+dir[k][1];
            
    if(r>=0&&r<m && c>=0&&c<n&&grid[r][c]=='1')
        {
         dfs(grid,r,c);
        }
    }
        
    

    }
    
}