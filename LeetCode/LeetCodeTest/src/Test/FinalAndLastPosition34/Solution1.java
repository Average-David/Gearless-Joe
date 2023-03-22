package Test.FinalAndLastPosition34;

public class Solution1 {
    public int[] searchRange(int[] nums, int target){
        int[] res = new int[2];
        res[0] = res[1] = -1;
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            if(num == target){ //分别寻找当前target的两边来确认边界
                int left0 = mid + 1; //往target右边找
                int right0 = mid - 1;//往target左边找
                res[1] = mid;
                res[0] = mid;
                //记录res当前的结果
                while(binarySearch(nums,left0,nums.length - 1,target) != -1){
                    res[1] = binarySearch(nums,left0,nums.length - 1,target);
                    left0 = binarySearch(nums,left0,nums.length - 1,target) + 1;
                }

                while(binarySearch(nums,0,right0,target) != -1){
                    res[0] = binarySearch(nums,0,right0,target);
                    right0 = binarySearch(nums,0,right0,target) - 1;
                }
                return res;
            }else if(num > target){
                right = mid - 1;
            }else if(num < target){
                left = mid + 1;
            }
        }

        return res;
    }
    public int binarySearch(int[] nums,int left,int right,int target){
        while(left <= right){
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            if(num == target){
                return mid;
            }else if(num > target){
                right = mid - 1;
            }else if(num < target){
                left = mid + 1;
            }

        }
        return -1;
    }
}
