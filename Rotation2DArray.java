package Array2D;


import java.util.*;


//TIME COMPLEXITY= O(n^2)
//SPACE COMPLEXITY= O(1)


public class Rotation2DArray {
    public static void rotatedMatrix(int[][] arr)
    {
        //Step 1: Transpose the 2D array
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                 arr[j][i] =temp;
            }

        }

        //Step 2: Swap the left and right side column
        for(int i=0;i<arr.length;i++) {
            int li = 0;
            int ri = arr.length - 1;
            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int m=sc.nextInt();
        int arr[][]=new int[m][m];
        System.out.println("Enter the " +m*m+ " elements: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for (var mat: arr) {                          //Displaying inputed matrix
            System.out.println(Arrays.toString(mat));

        }
        System.out.println("   ");



        rotatedMatrix(arr);          //Function calling


        for (var mat: arr) {                          //Display purpose
            System.out.println(Arrays.toString(mat));

        }
    }
}
