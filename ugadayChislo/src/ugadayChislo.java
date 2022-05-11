import java.util.Scanner;

public class ugadayChislo {
    public static void main(String[] args) {
        System.out.println("Игра УГАДАЙ ЧИСЛО.  Автор: Казаков Алексей, java224top");
        System.out.println("Ваша задача угадать загаданное мной число");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Что бы мне загадать число, ведите любое целое начальное число диапазана - ");
        int min = scanner.nextInt();
        System.out.print("Что бы мне загадать число, ведите любое целое конечное число диапазана - ");
        int max = scanner.nextInt();
        int rnd = rnd(min, max);
        System.out.println("Я загадал число от " + min + " до " + max);
        System.out.print("Введи загаданное мной целое число = ");
        int yuorNamber = scanner.nextInt();
        firstBlock:
        {
            for (int i = 0; i < 5; i++) {
                if (yuorNamber < rnd) {
                    System.out.println("Я загадал чило больше чем " + yuorNamber);
                } else if (yuorNamber > rnd) {
                    System.out.println("Я загадал число меньше чем " + yuorNamber);
                } else {
                    System.out.println("* * *  УРА ТЫ ПОБЕДИЛ !!! * * *");
                    System.out.println("Именно " + rnd + " я и загадал ! ");
                    break firstBlock;
                }
                System.out.print("Введи загаданное мной целое число = ");
                yuorNamber = scanner.nextInt();
            }
            System.out.println("Мне жаль но ты не угалал !!!");
            System.out.println("Я загадал число - " + rnd);
        }
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
