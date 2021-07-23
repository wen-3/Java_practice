package practice2.practice2_8;

import java.util.Scanner;

// 向上攀登
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 有幾組測試資料
        float arr[] = new float[n];
        String result = "success";  // 是否登頂成功

        for (int i = 0; i < n; i++){
            float k = sc.nextFloat();  // 白天向上爬的高度
            float l = sc.nextFloat();  // 晚上下滑的高度
            float x = sc.nextFloat();  // 懸崖的總高度
            float f = sc.nextFloat();  // 疲勞因子
            int day = 0;  // 攀爬天數
            float high = k;  // 攀爬高度(預設為第一天白天的攀爬高度)
            while(true){
                day ++;
                // 白天
                // 3
                // 3 - 3 * 0.1 * 1
                // 3 - 3 * 0.1 * 2
                // k - k * 0.1 * (day - 1)  => k * (1 - (f / 100) * (day - 1))
                if (day != 1){     // 除了第一天都要算疲勞因子
                    high += k * (1 - (f / 100) * (day - 1));
                }
                System.out.print("白天" + high + " ");
                if (high >= x){
                    break;
                }
                // 晚上
                high -= l;
                System.out.print("晚上" + high + " ");
                if (high <= 0){
                    result = "fail";
                    break;
                }
            }
            System.out.println(result + "-" + day);
        }
    }
}
