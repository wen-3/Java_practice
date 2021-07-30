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
        for (int i = 0; i < arr.length; i++){   // 三個人
            if (max < arr[i]){
                max = arr[i];
                win = i;
            } else if (max == arr[i]){
                System.out.println("不分勝負");
                break;
            }

            if (i == arr.length -1){
                switch (win) {
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
