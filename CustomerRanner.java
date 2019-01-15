package Customers;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

public class CustomerRanner {
    //Создать классы, спецификации которых приведены ниже.
    // Определить конструкторы и методв setТип(), getТип(), toString()
    // Определить дополнительно методы в классе, создающем массив объектов.
    //Задать критерий выбора данных и вывести эти данные на консоль.
    //В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
    //1. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
    // Создать массив объектов. Вывести:
    //а) список покупателей в алфавитном порядке;
    //б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
    public static void main(String[] args) {

        Customer customer0 = new Customer(1, "Kalinovskay", "Kate", "Nikolaevna",
                "Pinsk,str Center, 23-56", 134564631, 953131);
        Customer customer1 = new Customer(28, "Ivanov", "Viktor", "Sergeevich",
                "Pinsk,str Center, 23-56", 613113131, 15863);
        Customer customer2 = new Customer(5, "Petov", "Mihail", "Nikolaevich",
                "Pinsk,str Center, 23-56", 1321354661, 16461);
        List<Customer> customers = new ArrayList<Customer>();
        List<Customer> customers1 = new ArrayList<Customer>();
        customers.add(customer0);
        customers.add(customer1);
        customers.add(customer2);

        CustomerService.print(customers);

        CustomerService.listPatientsNumberCreditCardOfInterval(customers, 134564631, 613113135);

        System.out.println("Sort");
        CustomerService.sortCustomer(customers);
        CustomerService.print(customers);
    }
}
