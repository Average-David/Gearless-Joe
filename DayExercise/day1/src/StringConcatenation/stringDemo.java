package StringConcatenation;

import jdk.swing.interop.SwingInterOpUtils;

public class stringDemo {
    //将一个int数组拼接成一个字符串
    public static void main(String[] args) {
        {
            int arr[] = {1,2,3,4,5};
            String str = intToString(arr);
            System.out.println(str);
            System.out.println(str.charAt(1));
        }
    }

    public static String intToString(int[] arr) {
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "";
        }
        String res = "";//创建返回字符串 res;
        for (int i = 0; i < arr.length; i++) {
            res = res + arr[i]; //字符串遇到 + 会直接拼接成字符串
        }
        return res;
    }
}
