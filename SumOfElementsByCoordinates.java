package Array2D;
import java.util.*;

public class SumOfElementsByCoordinates {
    public static int findSumMatrix(int[][] arr, int r1, int c1, int r2, int c2)   //Function to calculate the sum in rectangular fashion
    {
        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
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

        int result=findSumMatrix(arr,r1,c1,r2,c2);           //Function Calling
        System.out.println("Sum of the elements of given rectangle is: "+result);
    }
}
