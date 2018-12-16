import java.util.Random;

public class Runner_2_5 {
    //5. Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.
public static void main (String [] args){
    Random ran = new Random();
    int x = ran.nextInt(8999);
    System.out.println(x);

    for (int i=1; i<=4; i++){
     System.out.print(x%10);
     x=x/10;
    }

    }
}
