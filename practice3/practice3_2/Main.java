package practice3.practice3_2;

import java.util.Scanner;

// 正反數列
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 測試幾筆資料
        int arr[][] = new int[t][];
        boolean result = true;
        
        // 存入資料
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();  // 每筆將輸入幾個數值
            arr[i] = new int[n];
            for (int j = 0; j < n; j++){
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }

        // 判斷資料
        for (int i = 0; i < t; i++){
            for (int j = 1; j < arr[i].length; j++){
                if ((arr[i][j - 1] > 0 && arr[i][j] < 0) || (arr[i][j - 1] < 0 && arr[i][j] > 0)){
                    result = true;
                }else{
                    result = false;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
