class Solution {
    public int[] solution(int[] emergency) {
    
        int len = emergency.length;
        int[] answer = new int[len];
        
        // 배열의 값 큰 수부터 1씩 부여
	
	
		// 순서를 출력할 배열
		
		for (int i=0; i<len; i++) {
			// 순서
			int rank = len;
			for (int j=0; j<len; j++) {
				if (emergency[j] < emergency[i]) {
					rank--;
				}
			}
			answer[i] = rank;
		}
		
        
        
        
        return answer;
    }
}