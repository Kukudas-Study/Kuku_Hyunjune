import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> arr2 = new ArrayList<>();
        
        // 처음 제거되는 arr[0] 추가
		arr2.add(arr[0]);

        // arr2에 arr 입력과 중복 제거
		for (int i=1; i<arr.length; i++) {
			if (arr[i] != arr[i-1]) {
				arr2.add(arr[i]);
			}
		}
		

        
        answer = arr2.stream().mapToInt(a -> a.intValue()).toArray();

        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}