import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 9x9 행렬 입력
        // 가장 큰 수 행, 열 찾기
        
        int[][] arr = new int[9][9];
        int max = 0;
        int maxRow = 1;
        int maxCol = 1;
        
        // 최대값 찾기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
            	// 행렬 입력
                arr[i][j] = sc.nextInt();
                
                // 행렬 첫번째 수를 최대값으로
                if (i == 0 && j == 0) {
                max = arr[0][0];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1; 
                }
            }
        }
        
        // 최댓값 출력
        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);
        
    }
}
