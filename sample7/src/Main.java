import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        int radius = input.nextInt();

        double boxArea = Math.pow(radius * 2, 2);   // 정사각형 면적
        double circleArea = Math.PI * Math.pow(radius, 2); // 원의 면적
        double area = boxArea - circleArea;         // 구하는 영역의 면적

        System.out.printf("정사각형 면적: %.2f cm²\n", boxArea);
        System.out.printf("원의 면적: %.2f cm²\n", circleArea);
        System.out.printf("구하는 면적: %.2f cm²\n", area);
    }
}
