import java.util.Random;

public class Runner_2_4 {
    //4. Имеется целове число (задать с помощью Random rand = new Random(); int x = rand.nextInt() ).
    // Это число – количесво денег в рублях.
    // Вывести это число, добавив к нему слово «рублей» в правильном падеже.
    public static void main(String[] args) {
        Random ran = new Random();
        int x = ran.nextInt(89);
        System.out.println(x);

        if (x % 10 == 1 && ((x / 10) % 10) != 1) {
            System.out.println(x + " рубль.");
        } else {
            if (((x % 10 == 2) || (x % 10 == 3) || (x % 10 == 4)) && ((x / 10) % 10 != 1)) {
                System.out.println(x + " рубля.");
            } else {
                System.out.println(x + " рублей.");
            }
        }

    }
}
