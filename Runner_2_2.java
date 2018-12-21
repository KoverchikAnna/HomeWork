import java.util.Random;

public class Runner_2_2 {
    //2. Создайте число. Определите, является ли число трехзначным.
    //Определите, является ли его последняя цифра семеркой. Определите, является ли число четным.
    public static void main(String[] args) {
        Random ran = new Random();
        int x = ran.nextInt(899);
        System.out.println(x);

        //определение является ли число трехзначным.
        if (x > 99 && x < 1000) {
            System.out.println("Трехзначное.");
        }
        else{
            System.out.println("Не трехзначное.");
        }


        //определение является ли его последняя цифра семеркой.
        if (x % 10 == 7) {
            System.out.println("Последняя цифра числа 7.");
        } else {
            System.out.println("Пояледня цифра числа не равна 7.");
        }


        //Определение является ли число четным.
        if (x % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число не четное.");
        }

    }


}
