package Basics.Recursion.MidLevel;

//check if an array is sorted (Strictly Increasing)
// 1,2,3,4,5
// not like 1,2,2,4,5

class CheckArray{
    boolean isSorted(int arr[], int indx){
        if(indx==arr.length-1){
            return true;
        }
        if (arr[indx]<arr[indx+1]){
            return isSorted(arr,indx+1);
        }
        else
            return false;
    }
}
public class SortedArray {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
        int [] arr2 = {1,3,3,4,5};
         CheckArray obj = new CheckArray();
        System.out.println("Result for arr 1: "+ obj.isSorted(arr,0));
        System.out.println("Result for arr 2: "+ obj.isSorted(arr2,0));
    }
}
