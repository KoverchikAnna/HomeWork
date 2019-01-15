import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//Написать метод для конвертации массива строк/чисел в список.
//Желательно использовать реализацию функционального интерфейса, содержащего метод: List <T> convert(T [] objectArray);
public class ConvertRanner {
    public static void main(String[] args) {
        Integer[] mas = new Integer[10];
        List list = new ArrayList();
        Random random = new Random(100);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] = random.nextInt());
        }

        Convert<Integer> con= new Convert<Integer>() {
            @Override
            public List<Integer> convert(Integer[] mas) {
                for (int i = 0; i < mas.length; i++) {
                    list.add(mas[i]);
                   // System.out.println(list.get(i));
                }
                return list;
            }
        };
        con.convert(mas);
    }
}
