import java.util.Scanner;

public class FinalMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 단(2~9): ");
        int startDan = scanner.nextInt();
        System.out.print("끝 단(2~9): ");
        int endDan = scanner.nextInt();

        boolean invalid = (startDan < 2 || startDan > 9) ||
                          (endDan < 2 || endDan > 9) ||
                          (startDan > endDan);
        if (invalid) {
            System.out.println("2~9 범위를 순서대로 입력하세요.");
        }
        else{
            for (int dan = startDan; dan <= endDan; dan++) {
                System.out.println("[" + dan + "단]");

                for (int number = 1; number <=9; number++) {
                    int result = dan * number;
                    System.out.println(dan + " x " + number + " = " + result);
                }

                System.out.println();
            }
        }
    }
}
