package Sorting;

public class MergeSort {
    public int[] SplitArray(int[] arr,int i,int j){
        if(i!=j){
          int mid=(i+j)/2;
          int[] left_arr = SplitArray(arr,i,mid);
          int[] right_arr = SplitArray(arr, mid+1, j);
          return merge(left_arr,right_arr);
        }else{
            int[] tmp = new int[1];
            tmp[0]=arr[i];
            return tmp;
        }
    }

    public int[] merge(int[] left,int[] right){
        int[] tmp = new int[left.length+right.length];
        int i =0;
        int j =0;
        int k =0;
        for(k=0;k<Math.min(left.length,right.length);k++){
            if(left[i]<right[j]){
                tmp[k]=left[i++];
            }else{
                tmp[k]=right[j++];
            }
        }
        while(i<left.length){
            tmp[k++]=left[i++];
        }
        while(j<right.length){
            tmp[k++]=right[j++];
        }
        return tmp;
    }


}
