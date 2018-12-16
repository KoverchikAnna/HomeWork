import java.util.Random;

public class Runner_2_6 {
    //6. Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
    public static void main (String [] args){
        Random ran = new Random();
        int x = ran.nextInt(8999);
        System.out.println(x);
        int y=x;

        int a1=x%10;
        x=x/10;
        int a2=x%10;
        x=x/10;
        int a3=x%10;
        int a4=x/10;
        if ((a1!=a2)&&(a1!=a3)&&(a1!=a4)&&(a2!=a3)&&(a2!=a4)&&(a3!=a4))
        System.out.println(" Все цифры числа "+y+" различны.");
        else System.out.println("В числе "+y+" есть повторяющиеся цифры.");

    }
}
