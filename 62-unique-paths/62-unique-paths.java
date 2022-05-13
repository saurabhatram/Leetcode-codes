class Solution {
    public int uniquePaths(int n, int m) {
        
    int[][] dir= {{0,1},{1,0}};
    int[][] dp=new int[n][m];
        
    return uniquePaths_01(0,0,n-1,m-1,dir,dp);
    }
    
    public boolean inRange(int i,int j,int n,int m)
    {
        if(i<0 || i>=n || j<0 || j>=m)
            return false;
        
        return true;
    }
    
    public int uniquePaths_01(int sr,int sc,int dr,int dc,int[][] dir,int[][] dp)
    {
        if(sr==dr && sc== dc)
        {
            return dp[sr][sc]=1;
            

        }
        
        if(dp[sr][sc]!=0)
            return dp[sr][sc];
        
        int count=0;
        
        for(int i=0;i<dir.length;i++)
        {
            int r=sr+dir[i][0];
            int c= sc+dir[i][1];
            
            if(inRange(r,c,dr+1,dc+1))
            {
                count+=uniquePaths_01(r,c,dr,dc,dir,dp);
            }
            
        }
        
     return   dp[sr][sc]=count;
    
    }
}