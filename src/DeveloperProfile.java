import java.util.Scanner;

public class DeveloperProfile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름: 정재웅");
        String name = scanner.nextLine().trim();

        System.out.print("희망 직무: Java 백엔드 개발자");
        String role = scanner.nextLine().trim();

        System.out.print("GitHub 주소: https://github.com/jjw5723844-cmyk/java-class2");
        String githubUrl = scanner.nextLine().trim();

        System.out.print("Java 학습 개월 수: 1");
        String monthsText = scanner.nextLine().trim();
        int studyMonths = Integer.parseInt(monthsText);

        System.out.print("프로젝트 수: 1");
        int projectCount = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("즉시 취업 가능(true/false): false");
        boolean available = Boolean.parseBoolean(scanner.nextLine().trim());

        String introduction = scanner.nextLine().trim();

        System.out.printf("%s | %s%n", name, role);
        System.out.printf("Java %d개월 | 프로젝트 %d개%n", studyMonths, projectCount);
        System.out.printf("취업 가능: %b%n", available);
        System.out.println(introduction);
        scanner.close();
    }
}