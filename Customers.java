package Customers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Customers extends Customer {
    //Создать классы, спецификации которых приведены ниже.
    // Определить конструкторы и методв setТип(), getТип(), toString()
    // Определить дополнительно методы в классе, создающем массив объектов.
    //Задать критерий выбора данных и вывести эти данные на консоль.
    //В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
    //1. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
    // Создать массив объектов. Вывести:
    //а) список покупателей в алфавитном порядке;
    //б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
    ArrayList<Customer> customers;

    public Customers() {
        customers = new ArrayList<>();
    }

    protected void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void print() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }

    protected void listPatientsNumberCreditCardOfInterval(int startInterval, int finfshInterval) {
        System.out.println("Список покупателей с кредитными картами интервале от " + startInterval + " до " + finfshInterval);
        for (int i = 0; i < customers.size(); i++) {
            if (startInterval < customers.get(i).numberCreditCard && finfshInterval > customers.get(i).numberCreditCard) {
                System.out.println(customers.get(i).surname + " " + customers.get(i).name + " " + customers.get(i).patronymic);
            }
        }
    }

    protected void sortCustomer() {
        Collections.sort(customers, new Comparator <Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer1.getSurname().compareTo(customer2.getSurname());
            }
        });
    }


}
