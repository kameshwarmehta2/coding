package Recursion;

public class Application {
    public static void main(String[] args){
        
        // PrintNumnbers obj=new PrintNumnbers();
        // obj.printBottomUp(5);
        // System.out.println();
        // obj.printTopDown(5, 1);

        SumOfNaturalNum objct=new SumOfNaturalNum();
        int n=objct.TotalSumBottomUp(5);
        int m=objct.TotalSumTopDown(5, 1);
        System.out.println(n);
        System.out.println(m);
    }
    public static void printing(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
