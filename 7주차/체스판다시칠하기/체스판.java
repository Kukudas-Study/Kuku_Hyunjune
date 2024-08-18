package codingtest;

import java.util.Scanner;

public class 체스판 {
	public static void main(String[] args) {
		
		// m 가로 * n 세로 (>=8) 체스판 W,B 입력 
		// WB 또는 BW가 아니면 +1
		
		// 체스판 입력
		Scanner sc = new Scanner(System.in);

		System.out.println("체스판 입력 : ");

		String nm = sc.nextLine();
		String[] parts = nm.split(" ");
		
		int n = Integer.parseInt(parts[0]); // 세로
		int m = Integer.parseInt(parts[1]); // 가로?
		
		// 배열
		char[][] arr = new char[n][m];
		
        int count1 = 0; // B -> W로 바꾸는 카운트
        int count2 = 0; // W -> B로 바꾸는 카운트
		
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextLine().toCharArray();
        }
        
        
        
        // 체스판이 최소 8칸이므로, n, m이 8칸 이상일 때 순회
		for (int i=0; i<=n-8; i++) {
            for (int j=0; j<=m-8; j++) {
            	
                // 체스판 순회
                for (int a=0; a<8; a++) {
                    for (int b=0; b<8; b++) {
                        if ((a + b) % 2 == 0) { // a+b가 짝수칸일 때
                        	// 첫 칸이 W일때, a+b가 짝수칸이면 (a,b)는 W이어야 함
                            if (arr[i + a][j + b] != 'W') count1++; // (a,b)가 W가 아니면 +1
                            if (arr[i + a][j + b] != 'B') count2++;
                        } else { // a+b가 홀수칸일때
                            if (arr[i + a][j + b] != 'B') count1++;
                            if (arr[i + a][j + b] != 'W') count2++;
                        }
                    }
                }
                // 최종적으로 count1, count2중 더 작은 수 반환
               System.out.println(Math.min(count1, count2));
                
            }
        }
		
		
		
		
		
		
	}
}
