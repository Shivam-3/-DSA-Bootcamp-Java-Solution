package com.shivam;

public class Q5 {
    public static void main(String[] args) {
        pattern5(4);
    }

    private static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsinrow=row>n ? 2*n-row:row;
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
