import java.util.Random;

public class Runner_3_7 {
    // 7. Создать двумерный квадратный массив (произвольной длины!!!!) и заполнить его
//«бабочкой», т.е. так:
//            1 1 1 1 1
//            0 1 1 1 0
//            0 0 1 0 0
//            0 1 1 1 0
//            1 1 1 1 1
    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(20);
        int[][] arr = new int[size][size];

        for (int i = 0; i < (arr.length/2+1); i++) {
            for (int j = 0+i; j < (arr[i].length/2+1); j++) {
                       arr[i][j] = 1;
                }
            }

        for (int i = 0; i < (arr.length/2); i++) {
            for (int j = arr[i].length-1-i; j > (arr[i].length/2-1); j--) {
                arr[i][j] = 1;
            }
        }

        for (int i = (arr.length-1); i > (arr.length/2); i--) {
            for (int j = (arr[i].length-1)-(arr.length-1-i); j > (arr[i].length/2-1); j--) {
                arr[i][j] = 1;
          }
        }

        for (int i = (arr.length-1); i > (arr.length/2)-1; i--) {
            for (int j = (arr.length-1-i); j < (arr[i].length/2); j++) {
                arr[i][j] = 1;
            }
        }

        for (int i = 0; i < (arr.length); i++) {
            for (int j = 0; j < (arr[i].length); j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
