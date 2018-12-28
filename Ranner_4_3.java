import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Ranner_4_3 {

    public static void main(String[] args) {
        System.out.println("Введите строку символов. ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(str);

        int sum = 0;
        int i = 0;
        while (i < stringBuilder.length()) {
            if ((stringBuilder.charAt(i) == '0') || (stringBuilder.charAt(i) == '1') || (stringBuilder.charAt(i) == '2') ||
                    (stringBuilder.charAt(i) == '3') || (stringBuilder.charAt(i) == '4') || (stringBuilder.charAt(i) == '5') ||
                    (stringBuilder.charAt(i) == '6') || (stringBuilder.charAt(i) == '7') || (stringBuilder.charAt(i) == '8') ||
                    (stringBuilder.charAt(i) == '9')) {
                sum = sum + Character.getNumericValue(stringBuilder.charAt(i));
                stringBuilder.deleteCharAt(i);
            } else {
                i++;
            }
        }
        System.out.println("Сумма цифр равна " + sum);
        System.out.println("После удаления цифр получили стрроку: " + stringBuilder);

    }

}
