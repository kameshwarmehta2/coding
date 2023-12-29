package Recursion;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args){
        // int[] arr={1,2,3};
        // int[] flag=new int[arr.length];
        // int i=0;
        // AllSubsequences objct1=new AllSubsequences();
        // objct1.printAllSubsequence(arr,new ArrayList<>(),0);


        int[] arr={3,1,4,0};
        int index=0;
        int req_sum=4;
        int req_size=2;
        int size=0;
        int sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        SubsequenceWithEqualSum objct=new SubsequenceWithEqualSum();
        objct.printingSubsequenceSum(index,arr,req_size,req_sum,list,sum,size);

    }
    public static void printing(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
