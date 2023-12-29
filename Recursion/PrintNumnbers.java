package Recursion;

public class PrintNumnbers{
    public void printBottomUp(int n){
         if(n==1){
            System.out.println(n);
         }
         else{
            printBottomUp(n-1);
            
            System.out.println(n);
         }
    }
    public void printTopDown(int n,int cnt){
         if(cnt==n){
            System.out.println(n);
         }
         else{
            System.out.println(cnt);
            printTopDown(n, cnt+1);
         }
    }
}