package StringReverse;
import java.util.Scanner;

public class stringDemo {
    //从键盘录入一个字符串，调用方法后实现反转并再控制台输出
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = stringReverse(str);
        System.out.println(str);


    }


    public static String stringReverse(String str){
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }
}
