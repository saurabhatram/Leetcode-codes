class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
    int n=obstacleGrid.length;
    int m=obstacleGrid[0].length;
    int[][] dir= {{1,0},{0,1}};
    int[][] dp = new int[n][m];
   if(obstacleGrid[n-1][m-1]==1 || obstacleGrid[0][0]==1)
    return 0;
    
    if(n==0||m==0)
        return 0;
        
        return uniquePaths(obstacleGrid,0,0,n-1,m-1,dir,dp);
    }
    public boolean inRange(int i,int j,int n,int m,int[][] grid)
    {
        if(i<0 || j<0 || i>=n ||j>=m || grid[i][j]==1)
            return false;
        return true;
    }
    public int uniquePaths(int[][] grid,int sr,int sc,int dr,int dc,int[][] dir,int[][] dp)
    {   
        
        if(sr==dr&& sc==dc)
        {        
       return dp[sr][sc]=1;
        }
        if(dp[sr][sc]!=0)
            return dp[sr][sc];
        
        int count=0;
       // grid[sr][sc]=1;
        for(int d=0;d<dir.length;d++)
        {
            int r= sr+ dir[d][0];
            int c= sc+ dir[d][1];
            
            if(inRange(r,c,dr+1,dc+1,grid))
            {
                count+=uniquePaths(grid,r,c,dr,dc,dir,dp);       
            }
        }
        //grid[sr][sc]=0;
        
        return dp[sr][sc]=count;
    }
    
}