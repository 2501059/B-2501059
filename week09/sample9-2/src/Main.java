import java.lang.module.InvalidModuleDescriptorException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IDException {
        Scanner keyboard = new Scanner(System.in);
        int start;
        int last;
        int sum = 0;

        while (true) {
            System.out.print("어디까지 더할까요 ? ");
            start = keyboard.nextInt();
            System.out.print("어디까지 더할까요 ? ");
            last = keyboard.nextInt();

            if (start >= last) {
                System.err.printf("ERROR : start가 Last보다 작아야 함");
                System.in.read();
            } else {
                break;
            }
        }
        for (int i = start; i <= last; i++) {
            sum += i;
        }

        System.out.printf("%d + %d + ... + %d = %,d|n", start, start + 1, last, sum);
    }
}