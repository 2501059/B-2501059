import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int salary, save, expenses;
        int save, remain, money;
        float saveRate;


        System.out.print("당신의 급여액 입력 : ");
        System.out.print("월 저축 비율 (예 20% -> ");
        expenses = keyboard.nextInt();
        System.out.println("월 기본 지출 비용 입력 : ");
        expenses = keyboard.nextInt();



        save = (int) (saveRate * salary);
        remain = salary - (save + expenses);
        money = remain / 30;



        System.out.println("[예산 계산 결과]");
        System.out.println("월급 : %,d원\n", salary);
        System.out.println("저축액 : %,d원\n", save);
        System.out.println("지출액 : %,d원\n", expenses);
        System.out.println("남은 금액 : %,d원\n", remain);
        System.out.println("일일 사용 가능 예산 : %,d원\n" , money);





    }
}