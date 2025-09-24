public class Main {
    public static void main(String[] args) {
        String country = "대한민국";
        String capital = "서울";
        int area = 99538;
        int population = 10373234;
        int year = 2010;

        System.out.printf("우리나라는 %s 입니다.\n", country);
        System.out.printf("%s 수도 : %s\n", country, capital);
        System.out.printf("%s 면적 : %,d ㎢ (남한)\n", country, area);
        System.out.printf("%s의 인구 : %,d 명 (%d년 기준)\n", capital, population, year);
    }
}
