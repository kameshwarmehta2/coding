package Recursion;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args){
        int[] arr={1,2,3};
        int[] flag=new int[arr.length];
        int i=0;
        AllSubsequences objct1=new AllSubsequences();
        objct1.printAllSubsequence(arr,new ArrayList<>(),0);

    }
    public static void printing(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
