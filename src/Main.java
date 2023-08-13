import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            double m;
            double v;
            System.out.println("Привет я помогу тебе найти плотность, введи массу тела");

            m = scanner.nextDouble();
            System.out.println("Отлично масса тела" + m + " теперь введи объём тела");
            v = scanner.nextDouble();
            double p = m / v;
            System.out.println("Плотность тела:" + p);
        }catch (Exception ex){
            System.out.println("Ты ввёл что-то не так");
        }

    }
}