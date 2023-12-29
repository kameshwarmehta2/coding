package Sorting;

public class Application {
    public static  void main(String[] args){
        int[] arr={0,13,410,14,0,1,2,1,9};
         int idx=(arr.length/2)-1;
        HeapSort objct=new HeapSort();
        objct.printHeapSort(arr, idx,arr.length);
        
       
        printing(arr);
    }
    public static void printing(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
