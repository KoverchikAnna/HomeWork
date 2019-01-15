import java.util.List;
//Написать метод для конвертации массива строк/чисел в список.
//Желательно использовать реализацию функционального интерфейса, содержащего метод: List <T> convert(T [] objectArray);

@FunctionalInterface
public interface Convert <T>{
    public abstract List <T> convert (T[] ObgectArray);
}
