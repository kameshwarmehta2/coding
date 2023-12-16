package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import java.util.Arrays;

public class AllSubsequences {
    public void printAllSubsequence(int[] array,ArrayList<ArrayList<Integer>> lst_1,int k){
        int n=array.length;
        if(k==n){
           print(lst_1);
        } else {
            ArrayList<ArrayList<Integer>> lst_2 = new ArrayList<>();
            lst_2.addAll(lst_1);
            for (ArrayList<Integer> innerList : lst_1) {
                ArrayList<Integer> temp = new ArrayList();
                temp.addAll(innerList);
                temp.add(array[k]);
                lst_2.add(temp);

            }
            ArrayList newList =  new ArrayList<>();
            newList.add(array[k]);
            lst_2.add(newList);
            printAllSubsequence(array, lst_2, k+1);
        
        }
 
    }

    public void printAllSubsequence(int[] array,int[] flag,int i){
        if(i==array.length){
           print(array,flag);
        }else{
            int[] flagArr = flag.clone();
            printAllSubsequence(array,flagArr,i+1);
            flagArr[i]=1;
            printAllSubsequence(array,flagArr,i+1);

        }
    }
    public void print(int[] arr,int[] flag){
        for(int j=0;j<flag.length;j++){
            if(flag[j]==1){
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
        
    }

    public void print(ArrayList<ArrayList<Integer>>list){
        for(ArrayList<Integer> inner:list){
            System.out.println(inner.toString());
        }        
    }
}
