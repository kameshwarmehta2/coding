package Sorting;

public class SelectionSort {
    public void sortArray(int[] arr,int index){
        if(index==arr.length-1){
            printArray(arr);
            return;
        }

         int n=arr.length;
         int min=index;
         for(int i=index;i<n;i++){
            if(arr[i]<arr[min]){
               min=i;
            }
         }
         swap(arr,index,min);
         sortArray(arr, index+1);

    }
    public void swap(int[] arr,int index,int j){
       int temp=arr[index];
       arr[index]=arr[j];
       arr[j]=temp;
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
