package Array;

public class FindIndex {
    public int returnIndex(int[] arr,int target){
        int n=arr.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
               ans=i;
               break;
            }
        }
        return ans;
    }
}
