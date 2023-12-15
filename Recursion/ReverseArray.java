package Recursion;

public class ReverseArray {
    public int[] reverseArray(int[] array,int i,int j){
        if(i>=j){
            return array;
        }
        else{
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            return reverseArray(array, i+1, j-1);
        }
    }
}
