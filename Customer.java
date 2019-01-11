package Customers;

import java.util.Comparator;

public class Customer {
    //Создать классы, спецификации которых приведены ниже.
    // Определить конструкторы и методв setТип(), getТип(), toString()
    // Определить дополнительно методы в классе, создающем массив объектов.
    //Задать критерий выбора данных и вывести эти данные на консоль.
    //В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
    //1. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
    // Создать массив объектов. Вывести:
    //а) список покупателей в алфавитном порядке;
    //б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
    private int id;
    public String surname;
    public String name;
    public String patronymic;
    private String address;
    public long numberCreditCard;
    public int numberBankAccount;

    public Customer() {
        super();
    }


    public Customer(int id, String surname, String name, String patronymic,
                    String address, long numberCreditCard, int numberBankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberCreditCard = numberCreditCard;
        this.numberBankAccount = numberBankAccount;
    }

    @Override
    public String toString() {
        return getClass().getName() + " id: " + id + " surname: " + surname + " @name: " + name
                + " patronymic: " + patronymic + " address: " + address + " numberCreditCard: " + numberCreditCard +
                " numberBankAccount " + numberCreditCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberBankAccount() {
        return numberBankAccount;
    }

    public void setNumberBankAccount(int numberBankAccount) {
        this.numberBankAccount = numberBankAccount;
    }

    public long getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(int numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

}
