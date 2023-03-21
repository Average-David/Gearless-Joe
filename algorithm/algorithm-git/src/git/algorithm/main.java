package git.algorithm;

public class main {
    public static void main(String[] args) {
        int[] nums =new int[]{2,1,5,3,6,4,7,8,8,9};
       insertionSort insS = new insertionSort();
       insS.insertionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
