import java.util.Scanner;

public class FinalOrderKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffeeCount = 0;
        int sandwichCount = 0;
        int waterCount = 0;
        int orderAmount = 0;
        boolean paid = false;

        orderLoop:
        while (true) {
            System.out.println("1. 커피(2500원)");
            System.out.println("2. 샌드위치(4500원)");
            System.out.println("3. 생수(1000원)");
            System.out.println("4. 결제하기");
            int menu = scanner.nextInt();

            if (menu >= 1 && menu <= 3) {
                String productName = switch (menu) {
                    case 1 -> "커피";
                    case 2 -> "샌드위치";
                    default -> "생수";
                };

                int price = switch (menu) {
                    case 1 -> 2500;
                    case 2 -> 4500;
                    default -> 1000;
                };

                int quantity;
                do {
                    System.out.print("수량: ");
                    quantity = scanner.nextInt();
                } while (quantity <= 0);

                if (menu == 1) {
                    coffeeCount += quantity;
                } else if (menu == 2) {
                    sandwichCount += quantity;
                } else {
                    waterCount += quantity;
                }

                orderAmount += price * quantity;
                continue;
            }

            if (menu == 4) {
                if (orderAmount == 0) {
                    System.out.println("상품을 선택하세요.");
                    continue;
                }

                int discountRate;
                if (orderAmount >= 50000) {
                    discountRate = 10;
                } else if (orderAmount >= 30000) {
                    discountRate = 5;
                } else {
                    discountRate = 0;
                }

                int discountAmount = orderAmount * discountRate / 100;
                int paymentAmount = orderAmount - discountAmount;

                for (int i = 0; i < 20; i++) {
                    System.out.print("=");
                }

                System.out.println();
                System.out.println("결제 금액: " + paymentAmount);

                paid = true;
                break orderLoop;
            }
        }

        scanner.close();
    }
}