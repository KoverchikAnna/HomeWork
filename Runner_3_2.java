import java.util.Random;

public class Runner_3_2 {
//2. Имеется целое число, определить, является ли число простым (делится без остатка только на
//1 и само на себя)
public static void main (String [] args){
    Random rand = new Random();
    int num=rand.nextInt();
    int numDividers=1;
    for (int i=2;i<=num; i++) {
        if (num % i == 0) {
            numDividers++;
            if (numDividers > 2) {
                System.out.println("Число " + num + " не является простым");
                break;
            }
        }
    }
    if (numDividers<3){
        System.out.println("Число " +num+ " - простое");
    }
    }
}
