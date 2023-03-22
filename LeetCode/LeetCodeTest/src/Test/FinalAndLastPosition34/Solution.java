package Test.FinalAndLastPosition34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = getLeftBorder(nums,target);
        res[1] = getRightBorder(nums,target);
        return res;
    }
    public int getRightBorder(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            if(num > target){
                right = mid - 1;
            }
            else if(num == target) {
                rightBorder = mid;
                left = mid + 1;
            }else {
                left = mid + 1;
            }
        }
        return rightBorder;
    }
    public int getLeftBorder(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            if(num > target){
                right = mid - 1;
            }
            else if(num == target) {
                leftBorder = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return leftBorder;
    }
}
