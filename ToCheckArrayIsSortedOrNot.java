package Array1D;

import java.util.Scanner;
class Sorted{

    boolean SortedorNot(int[] arr)
    {

        boolean a = true;
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                a=false;
                break;
            }
        }
        return a;
    }
}
public class ToCheckArrayIsSortedOrNot {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        Sorted s = new Sorted();
        System.out.println("Array is Sorted? = "+s.SortedorNot(arr));

    }
}
