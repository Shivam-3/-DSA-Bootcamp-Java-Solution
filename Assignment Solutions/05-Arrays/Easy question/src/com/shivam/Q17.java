package com.shivam;

public class Q17 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] anss=transpose(matrix);
        System.out.println(anss);


    }
    public static int[][] transpose(int[][] matrix) {
        int m= matrix.length;
        int n = matrix[0].length;
        int[][] ans=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;

    }
}
