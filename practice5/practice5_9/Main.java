package practice5.practice5_9;

// 學生成績表
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student[][]= new int[2][2];
        int count = 0;
        while (true){
            int score = sc.nextInt();
            if (score == -1){
                break;
            }

            if (count == student.length){
                student = doubleArr(student);
            }

            student[count][0] = count + 1;
            student[count][1] = score;
            count++;
        }

        // 由小到大排序
        for (int i = 1; i < count; i++){
            for (int j = 0; j < count - i; j++){
                if (student[j][1] > student[j + 1][1]){    // 小 => 大
                    int tmp[] = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = tmp;
                }
            }
        }

        // 印出
        int k = sc.nextInt();  // 排序的準則
        switch(k){
            case 1:   // 由小到大排序
                for (int i = 0; i < count; i++){
                    System.out.println(student[i][0] + "." + student[i][1]);
                }
                break;
            case 2:   // 由大到小排序
                for (int i = count; i >= 0; i--){
                    System.out.println(student[i][0] + "." + student[i][1]);
                }
                break;
        }
    }

    public static int[][] doubleArr(int arr[][]){
        // 此寫法要多加注意
        int newArr[][] = new int[arr.length * 2][2];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
