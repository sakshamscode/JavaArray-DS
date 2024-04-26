package Array;

public class Reversal {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18};
        int n = arr.length;

        for(int i=0;i<n/2;i++)            //TIME COMPLEXITY= O(n)linear
        {
            int temp = arr[i];            //Swapping is Done so, SPACE COMPLEXITY= O(1)Constant
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        System.out.println("Reversal of an array is :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }

    }
}
