import java.util.Random;

public class Runner_2_5 {
    //5. Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.
    public static void main(String[] args) {
        Random ran = new Random();
        int x = ran.nextInt(8999);
        System.out.println(x);
        int num = 0;
        for (int i = 0; i < 4; i++) {
            num = num + (x % 10) * (int) Math.pow(10, (3 - i));
            x = x / 10;
        }

        System.out.println("Число " + num);
    }
}
