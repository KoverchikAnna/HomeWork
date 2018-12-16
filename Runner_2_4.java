import java.util.Random;

public class Runner_2_4 {
    //4. Имеется целове число (задать с помощью Random rand = new Random(); int x = rand.nextInt() ).
    // Это число – количесво денег в рублях.
    // Вывести это число, добавив к нему слово «рублей» в правильном падеже.
    public static void main (String [] args ){
        Random ran = new Random();
        int x=ran.nextInt(89);
        System.out.println(x);

        int y=x%10;
        int z=(x/10)%10;
        if (y==1 && z!=1)System.out.println(x + " рубль.");
        else {
            if (((y==2)||(y==3)||(y==4)&&(z!=1))) System.out.println(x + " рубля.");
            else System.out.println(x + " рублей.");
        }

    }
}
