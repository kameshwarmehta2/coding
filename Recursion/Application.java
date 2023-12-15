package Recursion;

public class Application {
    public static void main(String[] args){
        
        // PrintNumnbers obj=new PrintNumnbers();
        // obj.printBottomUp(5);
        // System.out.println();
        // obj.printTopDown(5, 1);

        // SumOfNaturalNum objct=new SumOfNaturalNum();
        // int n=objct.TotalSumBottomUp(5);
        // int m=objct.TotalSumTopDown(5, 1);
        // System.out.println(n);
        // System.out.println(m);

        // int[]arr={1,3,5,7,9};
        // ReverseArray obj1=new ReverseArray();
        // int[] ans=obj1.reverseArray(arr, 0,4);
        // printing(ans);

        int[]arr={1,3,5,4,1};
        Palindrome objct=new Palindrome();
        boolean ans=objct.isPalindrome(arr,0,4);
        System.out.println(ans);

    }
    public static void printing(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
