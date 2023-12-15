package Array;

public class Application {
    public static void main(String[] args){
           int[] arr={1,4,5,4,2};
           printing(arr);
           Twosum twosum=new Twosum();
           int[] ans=twosum.twoSum(arr, 9);
           
           printing(ans);
    }
    public static void printing(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
