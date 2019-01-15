package Customers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerService extends Customer{

    //Создать классы, спецификации которых приведены ниже.
    // Определить конструкторы и методв setТип(), getТип(), toString()
    // Определить дополнительно методы в классе, создающем массив объектов.
    //Задать критерий выбора данных и вывести эти данные на консоль.
    //В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
    //1. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
    // Создать массив объектов. Вывести:
    //а) список покупателей в алфавитном порядке;
    //б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.

    public static List <Customer> customers;
    int startInterval;
    int finfshInterval;

    public static void print(List <Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }

    protected static List <Customer> listPatientsNumberCreditCardOfInterval(List<Customer> customers, int startInterval, int finfshInterval) {
        List cust=new ArrayList();
        System.out.println("Список покупателей с кредитными картами интервале от " + startInterval + " до " + finfshInterval);
        for (int i = 0; i < customers.size(); i++) {
           if ((startInterval < customers.get(i).getNumberCreditCard()) &&
                   (finfshInterval > customers.get(i).getNumberCreditCard())) {
               cust.add(customers.get(i));
           }
        }
        for(int i=0; i<cust.size();i++){
            System.out.println(cust.get(i));
        }
        return cust;
    }

    protected static List<Customer> sortCustomer(List<Customer>customers) {
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer1.getSurname().compareTo(customer2.getSurname());
            }
        });
        return customers;
    }
}
