package practice3.practice3_10;

import java.util.Scanner;

public class Main {
    // 奇偶數列
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // 測試幾筆資料
        int arr[][] = new int[t][];
        
        for (int i = 0; i < arr.length; i++){
            int n = sc.nextInt();
            arr[i] = new int[n];   // 每筆將輸入幾個數值
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
                
            }
        }

        // 判斷是否符合規律
        for (int i = 0; i < arr.length; i++){
            boolean result = true;
            for (int j = 1; j < arr[i].length; j++){
                if (arr[i][j - 1] % 2 == 0 && arr[i][j] % 2 != 0 || arr[i][j - 1] % 2 != 0 && arr[i][j] % 2 == 0){
                    continue;
                }

                result = false;
                break;
            }
            System.out.println(result);
        }
    }
}
