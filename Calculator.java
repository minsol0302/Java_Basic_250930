import java.util.Scanner;

public class Calculator {
    // 덧셈 메소드 선언 
    public static int add(int a, int b) {
        return a + b;
    }
    // 뺄셈 메소드 선언
    public static int sub(int a, int b) {
        return a - b;
    }
    // 곱셈 메소드 선언
    public static int mul(int a, int b) {
        return a * b;
    }
    // 나눗셈 메소드 선언
    public static int div(int a, int b) {
        return a / b;
    }

    
    public static void main(String[] args) {
        System.out.println("계산기 어플");

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.println("연산 결과 : ");
        System.out.println("덧셈 : " + add(num1, num2));
        System.out.println("뺄셈 : " + sub(num1, num2));
        System.out.println("곱셈 : " + mul(num1, num2));
        
        // 나눗셈은 0 나눔 방지
        if (num2 != 0) {
            System.out.println("나눗셈 : " + div(num1, num2));
        } else {
            System.out.println("나눗셈 : 0으로 나눌 수 없습니다.");
        }

        scanner.close();

    }
}