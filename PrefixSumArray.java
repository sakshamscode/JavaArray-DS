package Array1D;

import java.util.Scanner;

public class PrefixSumArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        for(int i=1;i<n;i++)
        {
            arr[0]=arr[0];
            arr[i]= arr[i]+arr[i-1];
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
