//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
//Реализовать метод get(int index), который возвращает любой элемент массива по индексу.

public class ArrayUniversalTypeRanner {

    public static void main(String[] args) {
        Integer[] mas = {1, 5, 6, 8, 9, 98};
        String[] mas1 = {"aaa", "fff", "kkk", "lll"};
        test(mas);
        test(mas1);
    }

    public static <T> void test(T[] mas) {
        T[] a = mas;
        ArrayUniversalType<T> arr = new ArrayUniversalType<T>();
        arr.setMas(mas);
        arr.show();
    }
}
