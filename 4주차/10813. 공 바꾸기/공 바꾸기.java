import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 바구니 번호
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        // 공 바꾸는 횟수
        int M = sc.nextInt();
        
        // 임시 데이터 저장
        int temp;

        for(int i = 0; i < arr.length; i++) {
            // 바구니 index 0 = 1번부터
            arr[i] = i + 1;                    
        }              
        
        for(int j = 0; j < M; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            
            // 순서 변경
            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
        
        for(int k = 0; k <arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
