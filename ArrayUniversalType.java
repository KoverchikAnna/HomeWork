//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
//Реализовать метод get(int index), который возвращает любой элемент массива по индексу.

public class ArrayUniversalType<T> {
    public T[] mas;

    public T getMas(int i) {
        return mas[i];
    }

    public void setMas(T[] mas) {
        this.mas = mas;
    }

    public void show() {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(getMas(i));
        }
    }

}
