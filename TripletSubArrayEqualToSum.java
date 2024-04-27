package Array1D;
import java.util.Scanner;

public class TripletSubArrayEqualToSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int count=0;


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sum: ");
        int a = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==a)
                    {
                        count++;
                        System.out.print("The SubArrays equal to Sum are-  ");
                        System.out.println(arr[i] +","+arr[j]+","+arr[k]);
                    }
                }
            }

        }

        System.out.println("The SubArrays equal to Sum are - "+ count);

    }
}
