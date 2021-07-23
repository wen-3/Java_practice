package practice3.practice3_9;

import java.util.Scanner;

public class Main {
    // 記帳成效2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money[] = new int[7];
        int up = 0;
        int down = 0;
        
        for (int i = 0; i < money.length; i++){
            money[i] = sc.nextInt();
        }

        // 技巧 => 沒有規律，依據條件是否成立而改變 
        int tmp = money[0];  // 占存變數
        
        for (int i = 1; i < money.length; i++){
            if (money[i] - tmp > 1000){
                continue;
            }

            tmp = money[i - 1];

            if (tmp < money[i]){
                up++;
            }else if (tmp > money[i]){
                down++;
            }
        }

        if (up > down){
            System.out.println("變得會花");
        }else if(up < down){
            System.out.println("變得節省");
        }else{
            System.out.println("沒變");
        }
    }
}
