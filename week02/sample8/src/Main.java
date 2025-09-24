import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("당신의 이름은? ");
        String name = input.nextLine();

        System.out.print(name + "님의 가족은 몇 명입니까? ");
        int familyCount = input.nextInt();
        input.nextLine(); // 입력 버퍼 비우기 (다음 줄 입력 전에 필요)

        System.out.print(name + "님의 가족은 어디에서 살지요? ");
        String location = input.nextLine();

        System.out.println();
        System.out.println(name + "님의 가족은 " + familyCount + "명 입니다.");
        System.out.println(name + "님의 가족은 " + location + "에서 살고 있습니다.");
    }
}
