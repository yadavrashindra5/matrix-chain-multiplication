/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static java.lang.Integer.min;



public class JFrame2{
    public static int matrixChain(int matrix[],int i,int j)
    {
        int ans=Integer.MAX_VALUE;
        if(i==j)
            return 0;
        for(int k=i;k<j;++k)
        {
            int temp=matrixChain(matrix,i,k)+matrixChain(matrix,k+1,j)+matrix[i-1]*matrix[k]*matrix[j];
            ans=min(ans,temp);
        }
        return ans;
    }
    public static void main(String args[])
    {
        int matrix[]={1,2,3,4};
        int n=matrix.length;
        System.out.print(matrixChain(matrix,1,n-1));
        
    }
}
