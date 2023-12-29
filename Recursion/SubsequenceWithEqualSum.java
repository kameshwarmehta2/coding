package Recursion;

import java.util.ArrayList;

public class SubsequenceWithEqualSum {
    public void printingSubsequenceSum(int index,int[] arr,int req_size,int req_sum,ArrayList<Integer> list,int sum,int size){
        if(sum==req_sum && size==req_size){
            print(list);
            return;
        }
        if(sum>req_sum || size>req_size || index==arr.length){
            return;
        }
        printingSubsequenceSum(index+1, arr, req_size, req_sum, list, sum, size);
        ArrayList<Integer> new_list = new ArrayList<>(list);
        new_list.add(arr[index]);
        int new_sum=sum+arr[index];
        printingSubsequenceSum(index+1, arr, req_size, req_sum, new_list, new_sum, size+1);
        new_list.remove(new_list.size()-1);
    }
    public void print(ArrayList<Integer> list){
        for (int number : list) {
            System.out.println(number);
        }
        System.out.println();
    }
}
