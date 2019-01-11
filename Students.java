package Students;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
public class Students {

    private ArrayList<Student> studentsList;

    public Students() {
        studentsList = new ArrayList<>();
    }

    public void addStudents(Student student) {
        studentsList.add(student);
    }

    public void printStudens() {
        for (int i=0; i<studentsList.size();i++) {
            System.out.println(studentsList.get(i));
        }
    }

    protected void listStudentFaculty(String faculty){
        System.out.println("Список студентов "+ faculty+" факультета: " );
        for (int i=0; i<studentsList.size();i++) {
            if (faculty==studentsList.get(i).faculty){
            System.out.println(studentsList.get(i).surname+" "+studentsList.get(i).name+" "+studentsList.get(i).patronymic);
            }
        }
    }

    protected void listStudensGroup(String group){
        System.out.println("Список студентов "+ group +" группы:");
        for (int i=0; i<studentsList.size();i++) {
            if (group==studentsList.get(i).group){
                System.out.println(studentsList.get(i).surname+" "+studentsList.get(i).name+" "+studentsList.get(i).patronymic);
            }
        }
    }

    protected void listStudensAfterYear(int year){
        Calendar calendar=new GregorianCalendar(year,11,31);
        System.out.println("Список студентов родившихся после "+ year +" года");
        for (int i=0; i<studentsList.size();i++) {
            if (studentsList.get(i).getBirthday().after(calendar)){
                System.out.println(studentsList.get(i).surname+" "+studentsList.get(i).name+" "+studentsList.get(i).patronymic);
            }
        }
    }

    protected void listStudensFacultyAndCourse(String faculty,int course){
        System.out.println("Список студентов "+ faculty+" факультета " +course+" курса:");
        for (int i=0; i<studentsList.size();i++) {
            if (faculty==studentsList.get(i).faculty && course==studentsList.get(i).course){
                System.out.println(studentsList.get(i).surname+" "+studentsList.get(i).name+" "+studentsList.get(i).patronymic);
            }
        }
    }



}
