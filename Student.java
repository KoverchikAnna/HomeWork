package Students;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    /*
    Создать классы, спецификации которых приведены ниже.
    Определить конструкторы и методв setТип(), getТип(), toString()
    Определить дополнительно методы в классе, создающем массив объектов.
    Задать критерий выбора данных и вывести эти данные на консоль.
    В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
    1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет,Курс, Группа.
    Создать массив объектов. Вывести:
    а) список студентов заданного факультета.
    б) список студентов для каждого факультеет и курса
    с) список студентов, родившихся после заданного года
    d) список учебной группы
    */

    private int id;
//
    public String surname;
    public String name;
    public String patronymic;
    private Calendar birthday;
    private String address;
    private String phone;
    public String faculty;
    public int course;
    public String group;

    public Student(int id, String surname, String name, String patronymic,
                   int yearBirthday, int monthBirthday, int dayBirthday, String address, String phone,
                   String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday=new GregorianCalendar(yearBirthday,monthBirthday,dayBirthday);
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
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

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@name: " +name+ " id: " + id + " surname: "+ surname+ " patronymic: "+ patronymic+
                " birthday: "+birthday+" address: "+address+" phone: "+phone+" faculty: "+faculty+" course: "+course+" group: "+group;
    }

    @Override
    public int hashCode() {
        return this.id * 31 + ((this.surname == null) ? 0 : this.surname.hashCode()) +
                ((this.name == null) ? 0 : this.name.hashCode()) +
                ((this.patronymic == null) ? 0 : this.patronymic.hashCode()) +
                ((this.birthday == null) ? 0 : this.birthday.hashCode()) +
                ((this.address == null) ? 0 : this.address.hashCode()) +
                ((this.phone == null) ? 0 : this.phone.hashCode()) +
                ((this.faculty == null) ? 0 : this.faculty.hashCode()) +
                course + ((this.group == null) ? 0 : this.group.hashCode());
    }
}


