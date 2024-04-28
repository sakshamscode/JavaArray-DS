package Array2D;

import java.io.*;
import java.util.*;
import java.util.Scanner;

//TIME COMPLEXITY=

public class OptimizedApproachForSum {

    //TIME COMPLEXITY= O(m*n)
    //SPACE COMPLEXITY= O(1)
    public static void prefixSumMatrix(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {                 //Calculating prefix sum row wise
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        //FINAL 2D ARRAY

        for (int j = 0; j < n; j++) {              //Calculating prefix sum column wise
            for (int i = 1; i < m; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }


    }
    //TIME COMPLEXITY= O(1)
    //SPACE COMPLEXITY= O(1)
    public static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2)    //This function logic varies according to the Queries
    {
        int sum=0, upward=0, left=0,repeated_region=0, result=0;

        sum=arr[r2][c2];
        upward=arr[r1-1][c2];
        left=arr[r2][c1-1];
        repeated_region=arr[r1-1][c1-1];

        result=sum-upward-left+repeated_region;
        return result;
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows of the Array(m): ");           //input of Array row size
        int m= sc.nextInt();
        System.out.println("Enter the columns of the Array(n): ");        //input of Array column size
        int n=sc.nextInt();

        int arr[][]=new int[m][n];

        System.out.println("Now Enter the "+m*n+" elements of the Array: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();                             //Array elements input
            }
        }
        for (var mat:arr) {
            System.out.println(Arrays.toString(mat));               //Displaying inputted array
        }

        System.out.println("Enter the r1 coordinate: ");            // coordinates input
        int r1= sc.nextInt();
        System.out.println("Enter the c1 coordinate: ");
        int c1=sc.nextInt();
        System.out.println("Enter the r2 coordinate: ");
        int r2=sc.nextInt();
        System.out.println("Enter the c2 coordinate: ");
        int c2=sc.nextInt();


        prefixSumMatrix(arr);
        int result = sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Sum of the elements of given rectangle is: "+result);
    }
}
