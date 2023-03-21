package git.algorithm;

public class bubbleSort {
   public void bubbleSort(int[] arr){
       for (int i = 0; i < arr.length - 1; i++) {
           for (int i1 = 1; i1 < arr.length - i; i1++) {
               int temp = 0;
               if(arr[i1] < arr[i1 - 1]){
                   temp = arr[i1];
                   arr[i1] = arr[i1 - 1];
                   arr[i1 - 1] = temp;
               }
           }
       }
   }
}
