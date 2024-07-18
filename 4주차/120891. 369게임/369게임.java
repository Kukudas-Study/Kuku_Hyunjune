
class Solution {
    public int solution(int order) {
        int answer = 0;


		
		// 3, 6, 9 개수만큼 박수 : contain?
		// 숫자(order)가 주어질때, 박수 횟수(result)
		
		
		// 숫자 입력
//		System.out.println("숫자를 입력하세요.");
		
		// 수를 문자열로 바꿔 str.contains(text)
		String text = Integer.toString(order);
		
//		// if contain 3일때 ++ , 6일때 ++, 9일때 ++
			// 중복도 1로 취급
//		if (text.contains("3")) {
//			answer++;
//		}
//		if (text.contains("6")) {
//			answer++;
//		}
//		if (text.contains("9")) {
//			answer++;
//		}
		
		for (int i=0; i<text.length(); i++) {

			if (text.charAt(i) == '3') {
				answer++;
			}
			if (text.charAt(i) == '6') {
				answer++;
			}
			if (text.charAt(i) == '9') {
				answer++;
			}
		}

//		System.out.println(answer);
		
		
        return answer;
    }
}