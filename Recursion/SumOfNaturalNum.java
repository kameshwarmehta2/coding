package Recursion;

public class SumOfNaturalNum {
    public int TotalSumBottomUp(int n){
        
        if(n==1){
            return 1;
         }
        return TotalSumBottomUp(n-1)+n;
   }


   public int TotalSumTopDown(int n,int sum){
        if(n==0){
           return sum; 
        }
        else{
            sum = sum + n;
           return TotalSumTopDown(n-1,sum);
        }
   }
}
