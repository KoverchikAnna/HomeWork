package Patints;

public class Patient {
    //Создать классы, спецификации которых приведены ниже.
    // Определить конструкторы и методв setТип(), getТип(), toString()
    // Определить дополнительно методы в классе, создающем массив объектов.
    //Задать критерий выбора данных и вывести эти данные на консоль.
    //В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
    //1. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
    // Создать массив объектов. Вывести:
    //а) список пациентов, имеющих данный диагноз ;
    //б) список пациентов, номер медицинской карты которых находится в заданном интервале.
    private int id;
    public String surname;
    public String name;
    public String patronymic;
    private String address;
    private String phone;
    public int numberMedCard;
    public String diagnosis;

    public Patient(int id, String surname, String name, String patronymic,
                   String address, String phone, int numberMedCard, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.numberMedCard = numberMedCard;
        this.diagnosis = diagnosis;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumberMedCard() {
        return numberMedCard;
    }

    public void setNumberMedCard(int numberMedCard) {
        this.numberMedCard = numberMedCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return getClass().getName() + " id: " + id + " surname: " + surname + " @name: " + name
                + " patronymic: " + patronymic + " address: " + address + " phone: " + phone  +
            " numberMedCard: " + numberMedCard + " diagnosis: " + diagnosis;
}
}

