package practice4.practice4_9;

import java.util.Scanner;

// 倒著輸出
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[2];
        int count = 0;
        while (true){
            int x = sc.nextInt();
            if (x == -1){
                count--;
                break;
            }
            if (count == arr.length){
                arr = doubleArr(arr);
            }

            arr[count] = x;
            count++;
        }

        for (int i = count; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }

    public static int[] doubleArr(int arr[]){
        int newArr[] = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
