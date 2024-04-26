package Array;

//Time Complexity = O(n^2)
//Space complexity = O(1)


public class DuplicateFinding {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6};
        int n = arr.length;

        for(int i=0;i<n;i++)           //TIME COMPLEXITY = O(n^2)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate number is: "+ arr[i]);
                }
            }
        }
    }
}
