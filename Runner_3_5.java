import java.util.Random;

public class Runner_3_5 {
    // 5. Создать массив, заполнить его случайными элементами и распечатать. Перевернуть массив и
// снова распечатать (желательно не создавая новый массив)
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(20)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(99);
            System.out.print(" " + arr[i]);
        }

        System.out.println(" ");

        for (int i = 0; i < (int) (arr.length / 2); i++) {
            int k = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = k;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}

