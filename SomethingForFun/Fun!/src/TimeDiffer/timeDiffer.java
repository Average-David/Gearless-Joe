package TimeDiffer;
import java.time.Duration;
import java.time.LocalDateTime;

public class timeDiffer {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            LocalDateTime pastTime = LocalDateTime.now();
                for(double j = 0;j < 50000000L;j++){
                    //计算电脑运行50000000次所需要的时间
                }
            LocalDateTime currentTime = LocalDateTime.now();
            Duration duration = Duration.between(pastTime,currentTime);
            System.out.println("第" + (i + 1) + "次运算的时间为：" + duration.toMillis() + "毫秒");
            sum += duration.toMillis();
        }
        System.out.println("平均运行时常为：" + (sum / 10) + "毫秒");
    }
}
/*
*  难点：
*       Duration 和 LocalDataTime 类的使用
*       内循环中 j 的值如果为 int 而循环次数为 double 则需要消息死循环
* */