import java.util.Random;

public class Runner_2_3 {
    //3. Имеется прямоугольное отверстие размерами а и b.
    // Определить, можно ли его полностью закрыть круглой картонкой радиусом r.
    public static void main (String [] args){
      //  double a,b,r;
        Random ran = new Random();
        int a=ran.nextInt(89);
        System.out.println(a);
        int b=ran.nextInt(89);
        System.out.println(b);
        int r=ran.nextInt(89);
        System.out.println(r);

        if (Math.sqrt(a*a+b*b)/2<=r)System.out.println("Закроет.");
        else System.out.println("Не закроет.");
        }
}
