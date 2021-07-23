package practice5.practice5_7;

// 骰子遊戲2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxArr[] = new int[3];

        for (int i = 0; i < maxArr.length; i++){
            int max = 0;
            for (int j = 0; j < 3; j++){
                int point = sc.nextInt();
                if (max < point){
                    max = point;
                }
            }
            maxArr[i] = max;
        }

        // for (int i : maxArr){
        //     System.out.println(i + " ");
        // }

        // 判斷贏家
        int max = 0;
        for (int i = 0; i < maxArr.length; i++){
            if (max == maxArr[i]){
                System.out.println("不分勝負");
                break;
            }

            if (max < maxArr[i]){
                max = maxArr[i];
            }

            if (i == maxArr.length - 1){
                for (int j = 0; j < maxArr.length; j++){
                    if (max == maxArr[j]){
                        switch (j){
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
                        break;
                    }
                }
            }
        }
    }
}
