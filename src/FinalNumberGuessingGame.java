import java.util.Scanner;

public class FinalNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = (int) (Math.random() * 100) + 1;
        int attempts = 0;

        while (true) {
            System.out.print("숫자 입력(1~100): ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("1부터 100 사이의 숫자를 입력");
                continue;
            }

            attempts++;

            if (guess < answer) {
                System.out.println("UP");
            }
            else if (guess > answer) {
                System.out.println("DOWN");
            }
            else {
                System.out.println("정답: " + attempts + "회");
                break;
            }
        }

        System.out.println("게임을 종료합니다.");
    }
}
