import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// AAAA
		// BB
		// 보드판 ".", "X"로 이루어져있음
		// X가 4개면 AAAA, 2개면 BB, 홀수면 -1
		
		// XXXX -> AAAA
		// XXXXX -> -1
		// XXXXXX -> AAAABB
		// XX.XXXXXX -> BB.AAAABB
		
		Scanner sc = new Scanner(System.in);
		
		// 보드판
   //     System.out.print("보드판 입력: ");
        String b = sc.nextLine();

        // 결과값: 갱신하는 String
        StringBuilder result = new StringBuilder();

        // X개수
        int count = 0;

        for (int i=0; i<=b.length(); i++) {
        	// X가 나오면 count + 1
            if (i < b.length() && b.charAt(i) == 'X') {
                count++; 
                
            // X가 아니거나 마지막(i = b.length())인 경우
            } else { 
            	// 홀수면 바로 -1
                if (count % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                // X가 4개면 AAAA를 추가하고 -4
                while (count >= 4) {
                    result.append("AAAA");
                    count -= 4;
                } 
                // X 2개면 BB 추가하고 -2
                if (count == 2) {
                    result.append("BB");
                    count -= 2;
                } 
                
                // '.'처리
                if (i < b.length() && b.charAt(i) == '.') {
                    result.append('.');
                }
                // '.' 처리 후 X를 다시 처리하기 위해 count 초기화
                count = 0;
            }
        }

        System.out.println(result);
				    

				
				
				
				
				
				
				
				
				
				
				
		
		
	}
}
