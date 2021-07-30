package practice5.practice5_7;

// 骰子遊戲2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++){   // 三個人
            int max = 0;
            for (int j = 0; j < 3; j++){    // 擲三次並選出最大值
                int point = sc.nextInt();   // 投擲點數
                if (max < point){
                    max = point;
                }
            }
            arr[i] = max;
        }

        // 判斷三人輸贏
        int max = 0;
        int win = 0;
        int count = 0;   // 最大值出現次數
        for (int i = 0; i < arr.length; i++){   // 三個人
            if (max < arr[i]){
                max = arr[i];
                win = i;
            }

            int key = max;   // 確認最終最大值出現幾次

            if (i == arr.length -1){
                for (int value : arr){
                    if (value == key){
                        count++;     // 最終最大值出現次數
                    }
                }

                if (count > 1){    // 代表擲出最大值數值不只一人
                    System.out.println("不分勝負");
                    break;
                }

                // 執行到此行，代表擲出最大值的只有一人
                switch (win) {    // 判斷擲出最大值的人是誰
                    case 0:
                        System.out.println("A");
                        break;
                    case 1:
                        System.out.println("B");
                        break;
                    case 2:
                        System.out.println("C");
                        break;
                }
            }
        }
    }
}
