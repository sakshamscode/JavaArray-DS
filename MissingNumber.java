package Array;

//TIME COMPLEXITY = O(n)
//SPACE COMPLEXITY = O(1)


public class MissingNumber {
    public static void main(String[] args) {
        long[] arr = {1,2,3,7,6,5};                     //Long data type is used to overcome OVERFLOW problem
        long n = arr.length;

        long sum_natural_num = (n+1)*(n+2)/2;           //Sum of natural numbers in an array ---- O(1)
        long sum = 0;

        for(int i=0;i<n;i++)                          ///Sum of current elements present in an array ---- O(n)
        {
            sum = arr[i]+sum;
        }

        long missing_elem = 0;
        missing_elem = sum_natural_num-sum;
        System.out.println("Missing element in an array is : "+ missing_elem);
    }
}
