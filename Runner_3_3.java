import java.util.Random;

public class Runner_3_3 {
    //3. Найти сумму первых n чисел, которые делятся без остатка на 3
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10);
        int sumNumbersDivible=0;
        int i=1;
        int k=0;
        while (k!=num) {
           if (i%3==0) {
               sumNumbersDivible = sumNumbersDivible + i;
               k++;
           }
           i++;
        }
        System.out.println("Сумма первых "+num+" чисел, которые делятся без остатка на 3, равна " +sumNumbersDivible);

    }
}
