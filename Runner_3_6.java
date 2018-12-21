import java.util.Random;

public class Runner_3_6 {
    //6. Определить сумму элементов одномерного массива, расположенного между минимальным и
//    максимальным значениями (включительно).
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(10)];
        int max = 0, min, numMax = 0, numMin = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(89);
            System.out.print(" " + arr[i]);
        }

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max=arr[i];
                numMax=i;
            }
        }
        System.out.println(numMax);
        min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
                numMin=i;
            }
        }

        int sum = 0;

        if (numMin > numMax) {
            for (int i = numMax; i <= numMin; i++) {
                sum = sum + arr[i];
            }
        } else {
            for (int i = numMin; i <= numMax; i++) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
