
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	//		System.out.println("정수 입력 : ");

			String num = sc.nextLine();
			String[] abcdef = num.split(" ");
	        
			int a = Integer.parseInt(abcdef[0]);
			int b = Integer.parseInt(abcdef[1]);
			int c = Integer.parseInt(abcdef[2]);
			int d = Integer.parseInt(abcdef[3]); 
			int e = Integer.parseInt(abcdef[4]);
			int f = Integer.parseInt(abcdef[5]); 
			
	        int x = 0;
	        int y = 0;

	        // 범위만큼 순회
	        for (x=-999; x<=999; x++) { // -999 ~ 999
	            for (y=-999; y<=999; y++) { // -999 ~ 999
	                if (a*x + b*y == c && d*x + e*y == f) { // 연립 방정식
	                    System.out.println(x + " " + y);
	                    return;
	                }
	            }
	        }
	    
	

	
	
	
	}	
}
