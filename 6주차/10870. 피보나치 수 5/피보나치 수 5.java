
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// F(n) = F(n-1) + F(n-2) (n ≥ 2)
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
		// F0 F1 F2 F3 F4 F5 F6 F7  F8...
		
	//	System.out.println("N번째 피보나치수 입력");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		// n <= 1 / n==0, 0 / n==1, 1
		if (n == 0) {
			System.out.println(0);
		} else if (n == 1) {
			System.out.println(1);
		} else {
			// n이 2 이상일 때
			// F(n) = F(n-1) + F(n-2)
			int fn = 0;
			int fn_1 = 1;
			int fn_2 = 0; 
			
			for (int i=2; i<=n; i++) {
				fn = fn_1 + fn_2;
				fn_2 = fn_1; // fn-2에 fn-1을 덮어씌움
				fn_1 = fn; // fn-1에 최종값 fn을 덮어씌움
			}
			System.out.println(fn);
			
		}
		
		
		
		
		
		
		
		
		
	}
}
