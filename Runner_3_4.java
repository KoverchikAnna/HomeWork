import java.util.Random;

public class Runner_3_4 {
    //4. Создать массив оценок в классе и вывести максимальную оценку, вывести ее номер (позицию
//в массиве), вывести первую и последнюю оценки.
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(25)];
        int max=0, numMax=0;

        for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(11);
                System.out.print(arr[i] + "\t");
            }
            System.out.println(" ");

        for (int i=1; i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
                numMax=i;
            }
        }
         System.out.println("Максимальная оценка в классе "+max+". Её номер:"+numMax);
            System.out.println("Первая оценка "+arr[0]);
            System.out.println("Последняя оценка "+arr[arr.length-1]);
        }
        }
