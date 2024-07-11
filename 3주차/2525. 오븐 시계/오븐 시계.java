// 1. 현재 시각 : A시 B분 (정수)
// A : 0 ~ 23
// B : 0 ~ 59

// 2. 요리 시간 : C (0 ~ 1000 분)
// System.out.println( A시 B분 );
// System.out.println( C분 );

//---------------------------------------------------------------
// B : 59 -> 60일 때, A + 1, B = 0
// A : 23 -> 24일 때, A = 0

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
        // 총 요리 시간 = a * 60 + b + c
        // 시간 표시 = 총 요리 시간 / 60
        // 분 표시 = 총 요리 시간 % 60
        
        // 시간 표시 : 24가 되면 0이 되기 위해 = 총 요리 시간 / 60 % 24
      
//    if (int A >= 24) {
//        A = 0;
//    }
//    if (int B >= 60) {
//        B = 0;
//        A += 1;
//    }
    
    int cookingTime = A * 60 + B + C;
    int hour = cookingTime / 60 % 24;
    int minute = cookingTime % 60;
        
//      System.out.println(A + " " + B+C);
    System.out.println(hour + " " + minute);
    
    
    }
    
}







