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

        // 排序
        int k = sc.nextInt();  // 排序的準則
        
        for (int i = 1; i < count; i++){
            for (int j = 0 ; j < count - i; j++){
                switch (k) {
                    case 1:   // 由小到大排序
                        if (student[j][1] > student[j + 1][1]){
                            swap(student, j, j + 1);
                        }
                        break;
                    case 2:   // 由大到小排序
                        if (student[j][1] < student[j + 1][1]){
                            swap(student, j, j + 1);
                        }
                        break;
                }
            }
        }

        // 印出
        for (int i = 0; i < count; i++){
            System.out.println(student[i][0] + "." + student[i][1]);
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

    public static int[][] swap(int arr[][], int n1, int n2){
        int tmp[] = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = tmp; 
        return arr;
    }
}
