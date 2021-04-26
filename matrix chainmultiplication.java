package javaapplication6;

import java.util.Arrays;

public class MatrixChainMultiplicationDynamic {
    static int dp[][]=new int[100][100];
    static int matrixchain(int matrix[],int i,int j)
    {
        if(i==j)
        {
            dp[i][j]=0;
            return 0;
            
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;++k)
        {
            
            int temp=matrixchain(matrix,i,k)+matrixchain(matrix,k+1,j)+matrix[i-1]*matrix[k]*matrix[j];
            ans=Integer.min(ans,temp);
        }
        dp[i][j]=ans;
        return ans;
    }
  public static void main(String args[])
  {
      try{
      for (int[] row : dp)
      Arrays.fill(row, -1);
      }catch(ArrayStoreException e){}
      int matrix[]={1,2,3,4};
      int n=matrix.length;
      System.out.print(matrixchain(matrix,1,n-1));
      
  }
}
