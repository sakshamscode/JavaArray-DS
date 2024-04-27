package Array1D;

import java.util.Scanner;
class Solution{
    public void rotate(int arr[],int k)
    {
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public void reverse(int arr[], int start, int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
public class RotateArrayByKSteps {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the number of steps you want to rotate:");
        int k= sc.nextInt();
//        k = k%n;

        Solution sl=new Solution();

        sl.rotate(arr,k);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
