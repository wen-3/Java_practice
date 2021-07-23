package practice4.practice4_7;

import java.util.Scanner;

// 降雨機率2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
        
        for (int i = 0; i < arr.length; i++){
            String result;
            if (arr[i] > 60){
                result = "不出門";
            }else if (arr[i] > 30){
                result = "帶傘出門";
            }else{
                result = "出門";
            }
            System.out.println(result);
        }
    }
}
