package test.test5;

import java.util.Scanner;

// 計算長條圖中的正方形面積
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 元素數量
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();    // 元素內容(高度)
        }

        int area;
        int maxArea = 0;
        for (int width = 1; width <= arr.length; width++){
            
            // System.out.println("width:" + width);
            for (int i = 0; i <= arr.length - width; i++){   // 回合
                int minHight = arr[i];
                for (int j = i; j < i + width; j++){   // 在每回合中找出最小的高
                    if (arr[j] < minHight){
                        minHight = arr[j];
                    }
                    // System.out.println("i:" + i + " arr[j]:" + arr[j]);
                }
                // System.out.println("minHeight:" + minHight);
                area = width * minHight;
                if (area > maxArea){
                    maxArea = area;
                }
            }
            // System.out.println();
        }
        System.out.println(maxArea);
    }
}
