import java.io.*;

public class Ranner_4_6 {
    //Имеется строка с текстом. Подсчитать количество слов в тексте.
    // Желательно учесть, что слова разделяются несколькими пробелами,
    // в начале и в концеитекста так же могут быть пробелы, но могуть отсутствавать.

    public static void main(String[] args) throws IOException {

        System.out.println("Введите строку символов.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        bufferedReader.close();
        String[] masWord = str.split(" ");
        int k = 0;
        for (int i = 0; i < masWord.length; i++) {
            if (!("".equals(masWord[i]))) {
                k++;
            }
        }
        System.out.println("Количество слов в тексте равно " + k);
    }
}
