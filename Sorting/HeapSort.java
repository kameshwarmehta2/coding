package Sorting;

import java.util.Arrays;

public class HeapSort {
    public void heapify(int[] arr,int i,int end){
         int min=i;
         int left=(2*i)+1;
         int right=(2*i)+2;
         //System.out.println("i:"+i+" left: "+left+" right: "+right);
         

         if((left < end) && (arr[left] < arr[min])){
            min=left;
         }
         if((right < end) && (arr[right] < arr[min])){
            min=right;
         }
         if(i != min){
           swap(arr,i,min);
           heapify(arr, min,end);
         }

    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }
    public void BuildMinHeap(int[] arr,int idx,int end){
       
        for(int i=idx;i>=0;i--){
            heapify(arr, i,end);
            //System.out.println(Arrays.toString(arr));
        }
        return;
    }
    public void printHeapSort(int[] arr,int idx,int end){
        BuildMinHeap(arr,idx,end);
        for(int i=arr.length-1;i>=0;i--){
           swap(arr,0,i);
           heapify(arr, 0, i);
           
        }
    }
}
