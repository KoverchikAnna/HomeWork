import java.util.List;
//Написать метод для конвертации массива строк/чисел в список.
//Желательно использовать реализацию функционального интерфейса, содержащего метод: List <T> convert(T [] objectArray);

public class ConvertMasInList<T> implements Convert  {
    public T[] mas;
    public List<T>list;

    @Override
    public List <T> convert(Object[] ObgectArray) {
        for (int i=0;i<mas.length;i++){
            list.add(mas[i]);
        }
        return list;
    }
}
