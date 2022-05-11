import java.util.Scanner;

public class ugadayChislo {
    public static void main(String[] args) {
        System.out.println("Игра УГАДАЙ ЧИСЛО.  Автор: Казаков Алексей, java224top");
        System.out.println("Ваша задача угадать загаданное мной число");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Что бы мне загадать число, ведите любое целое число - ");
        int range = scanner.nextInt();
        int number = (int) (Math.random() * range);
        System.out.println("Я загадал число от 0 до " + range);
        System.out.print("Введи загаданное мной целое число = ");
        int yuorNamber = scanner.nextInt();
        firstBlock:
        {
            for (int i = 0; i < 3; i++) {
                if (yuorNamber < number) {
                    System.out.println("Я загадал чило больше чем " + yuorNamber);
                } else if (yuorNamber > number) {
                    System.out.println("Я загадал число меньше чем " + yuorNamber);
                } else {
                    System.out.println("* * *  УРА ТЫ ПОБЕДИЛ !!! * * *");
                    System.out.println("Именно " + number + " я и загадал ! ");
                    break firstBlock;
                }
                System.out.print("Введи загаданное мной целое число = ");
                yuorNamber = scanner.nextInt();
            }
            System.out.println("Мне жаль но ты не угалал !!!");
            System.out.println("Я загадал число - " + number);
        }
    }
}
