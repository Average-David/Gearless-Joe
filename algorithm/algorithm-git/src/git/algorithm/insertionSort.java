package git.algorithm;

public class insertionSort {
    public void insertionSort(int arr[]){
        for(int i = 1;i < arr.length;i++){
            for(int j = i - 1;j >= 0;j--){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                }else break;
            }
        }
    }

}
