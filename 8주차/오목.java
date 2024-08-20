package codingtest;

import java.util.Scanner;

public class 오목 {
	public static void main(String[] args) {
		
		// 6개 이상은 승리가 아님(??)
		// 1 : 흰돌 | 2 : 검은돌 | 0 : 빈 칸
        Scanner sc = new Scanner(System.in);
        
        // 오목 판
        int[][] bd = new int[19][19];
        
        // 방향 이동 배열 : 
        int[] x = {1, 0, 1, 1}; 
        int[] y = {0, 1, 1, -1};

        // 오목판 입력
        for (int i=0; i<19; i++) {
        	String[] row = sc.nextLine().split(" ");
            for (int j=0; j<19; j++) {
                bd[i][j] = Integer.parseInt(row[j]);
            }
        }

        // 오목판 순회
        for (int i=0; i<19; i++) {
            for (int j=0; j<19; j++) {
            	            	
                if (bd[i][j] != 0) { // 오목판이 빈 칸이 아닌 경우
                    int color = bd[i][j]; // color에 1(흰돌) 또는 2(검돌)을 저장

                    for (int d=0; d<4; d++) { // 4가지 방향으로 이동하기 위해
                        int count = 1; // 연속된 돌의 개수

                        int nx = i + x[d]; // x = {1, 0, 1, 1}
                        int ny = j + y[d]; // y = {0, 1, 1, -1}
                        // 현재 좌표(i,j)에서 오른쪽, 아래, 오른아래, 오른위
                        
                        // 돌이 연속된 경우
                        while ( nx >= 0 && ny >= 0 && // 좌표는 0부터
                        		nx < 19 && ny < 19 && // 오목판 범위 내
                        		bd[nx][ny] == color) {// 같은 색 돌이 있는 경우
                            count++;
                            nx += x[d]; // 다음 위치로
                            ny += y[d];
                        }

                        // 오목이 된 경우
                        if (count == 5) {
                            System.out.println(color); // 흰색=1, 검정색=2
                            System.out.println((i + 1) + " " + (j + 1)); // 이긴쪽의 최초 좌표
                            return;
                        }
                        
                    } // 4개방향 for문 끝
                    
                } // 빈칸(0)이 아닌 경우 if문 끝
                
            }
        }
        // 승부가 나지 않은 경우
        System.out.println(0);
		    


		
		
		
		
		
	}
}
