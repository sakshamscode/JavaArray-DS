package Array;
public class Palindrome {
    public static void main(String[] args) {
        int[] array={1,2,3,2,1,};
        int n= array.length;
        int flag = 0;

        for(int i=0;i<n/2;i++)    //Time Complexity = O(n).
        {
            if(array[i]!=array[n-i-1]) {            //Space Complexity = O(1) Linear
                flag = 1;
                System.out.println("Array is not palindromic");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Array is Palindromic");
        }
    }
}

