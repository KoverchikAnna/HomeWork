import java.util.Random;
import java.util.Scanner;

public class Ranner_4_4 {
  //2.Создайте простую игру основанную на угадывании букв (буква задается
  //случайным образом). Пользователь должен угадать загаданную букву A-Z введя ее в
  //консоль. Если пользователь угадал букву программа выведет «Right» и игра закончится,
  //если нет, то пользователь продолжит вводить буквы.
  //(Опционально) Вывести «You’re too low»- если пользователь ввел букву меньше
  //загаданной, «You’re too high»- если пользователь ввел букву больше загаданной.
    public static void main(String[] args) {
        int i=0;
        String mas[] = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a",
                "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while ( i>=0 ){
            System.out.println("Введите букву ");
            String a = scanner.next();
            i=random.nextInt(26);
            if ((a.compareTo(mas[i]) == 0)) {
                System.out.println("Right");
                break;
            }
            else{
                if (a.compareTo(mas[i]) > 0) {
                    System.out.println("You're too high");
                }
                else {
                    System.out.println("You're too low");
                }
            }
        }
        scanner.close();
    }
}
