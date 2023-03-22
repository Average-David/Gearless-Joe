package git.algorithm;
public class binarySearch {
    public int binarySearch(int[] arr,int target){
        //给定一个非递减数组和一个目标值，在数组中寻找目标值或返回target插入的位置
        int left = 0;
        int right = arr.length - 1;
        //初始以数组最两端为界
        if(target > arr[right]){
            return right + 1;
        }
        if(target < arr[left]){
            return 0;
        }
        //比较两种特殊情况，即target最大或者最小
        while(left <= right){
            int mid = left + (right - left) / 2;
            int num = arr[mid];
            if(num == target){
                return mid;
            }
            else if(num < target){
                left = mid + 1;
            }
            else if(num > target){
                right = mid - 1;
            }
        }
        return left;
    }
}
