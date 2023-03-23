package Test.Sqrt69;
class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(x / mid == mid){//mid 可能为0所以排除x == 0和x == 1
                return mid;
            }else if(x / mid < mid){ //因为mid平方可能过大，所以用除法
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }
}

