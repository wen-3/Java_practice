package practice2.practice2_5;

import java.util.Scanner;

// 連續判斷質數
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        boolean result = true;
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++){
            int count = nums[i];
            for (int k = 2; k < count; k++){
                if (nums[i] % k == 0){
                    result = false;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
