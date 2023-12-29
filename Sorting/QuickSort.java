package Sorting;

import java.util.Arrays;

public class QuickSort {
    public void printQuickSort(int[] arr,int lb,int ub){
        int pivot=arr[lb];
        int start=lb;
        int end=ub;
        if(lb>=ub){
            return;
        }

        while(start<end){
            while(arr[start]<=pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<end){
                swap(arr,start,end);

            }
        }
        swap(arr,lb,end);
        
        printQuickSort(arr, lb,end-1);
        printQuickSort(arr, end+1, ub);
        
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }
    
}
