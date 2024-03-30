package DS.Arrays;

class ArrayReverse{
    void reverseArr(int arr[], int n){
       for(int i=0;i<n/2;i++){
           int temp = arr[i];
           arr[i]=arr[n-i-1];
           arr[n-i-1] = temp;
       }
    }
}
public class ReverseArray {
    public static void main(String [] args){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        ArrayReverse obj = new ArrayReverse();
        obj.reverseArr(arr, n);

        // Printing the reversed array
        System.out.println("Reversed array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
