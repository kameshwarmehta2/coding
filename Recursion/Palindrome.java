package Recursion;

public class Palindrome {
    public boolean isPalindrome(int[] array,int i,int j){
        int n=array.length;
        
        if(i>=j){
            return true;
        }
        else{
            if(array[i]==array[j]){
               return  isPalindrome(array, i+1, j-1);
            }
            else{
                return false;
            }
        }
    }
}
