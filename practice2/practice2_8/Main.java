package practice2.practice2_8;

import java.util.Scanner;

// 向上攀登
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 有幾組測試資料
        String resultArr[] = new String[n];  // 是否登頂成功

        int day = 0;   // 攀爬天數
        for (int i = 0; i < n ; i++){
            float k = sc.nextFloat();  // 白天向上爬的高度
            int l = sc.nextInt();      // 晚上下滑的高度
            int x = sc.nextInt();      // 懸崖的總高度
            float f = sc.nextFloat() / 100;   // 疲勞因子
            float dayDownHeight = k * f;      // 每天能攀爬高度的下降程度

            day = 1;
            float nowHight = k - l;   // 攀爬高度(預設為第一天白天的攀爬高度)(第一天不用算疲勞因子)
            while (true){
                day ++;
                k -= dayDownHeight;   // 白天能向上爬的高度(除了第一天都要算疲勞因子)
                
                // 白天
                nowHight += k;
                if (nowHight > x){
                    resultArr[i] = "success-" + day;
                    break;
                }
                
                // 晚上
                nowHight -= l;
                if (nowHight < 0){
                    resultArr[i] = "fail-" + day;
                    break;
                }
            }
        }

        for (String result : resultArr){
            System.out.println(result);
        }
    }
}
