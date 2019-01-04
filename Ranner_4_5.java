import java.util.Scanner;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ranner_4_5 {
// Найти в произвольной строке не только запятые, но и все знаки препинания.
//Посчитать их общее количество.(Не обязательно - посчитать сколько каких знаков).

    public static void main(String[] args) {
        System.out.println("Введите строку символов.");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
        int k = 0;
        char mas[] = {'.', ',', '!', '?', ':', ';','-'};
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                char a=str.charAt(j);
                if (a==mas[i]) {
                    k++;
                }

            }

        }
        System.out.println("Количество знаков препинания равно "+k);


    }
}
