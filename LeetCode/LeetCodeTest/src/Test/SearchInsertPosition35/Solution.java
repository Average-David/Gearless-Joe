package Test.SearchInsertPosition35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int Left = 0;
        int Right  = nums.length - 1;
        while(Left <= Right){
            int mid = Left + (Right - Left) / 2;
            int num = nums[mid];
            if(num == target){
                return mid;
            }else if(num < target){
                Left = mid + 1;
            }else if(num > target){
                Right = mid - 1;
            }
        }
        return Left;
    }
}
