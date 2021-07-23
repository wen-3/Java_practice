package practice5.practice5_10;

// 骰子遊戲3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();   // 玩家人數
        int c = sc.nextInt();        // 要進行的局數
        int win[] = new int[player];   // 玩家贏的次數
        for (int i = 0; i < c; i++){
            int arr[] = new int[player];   // 每個玩家投擲的點數
            
            int max = 0;   // 投擲點數最大值
            for (int j = 0; j < arr.length; j++){
                int point = sc.nextInt();
                arr[j] = point;
                
                if (max < arr[j]){
                    max = arr[j];
                }
            }

            // 此回合哪位玩家勝利
            for (int j = 0; j < win.length; j++){
                if (max == arr[j]){
                    win[j] += 1;
                }
            }
        }

        for (int i = 0; i < win.length; i++){
            System.out.println(win[i]);
        }

    }
}