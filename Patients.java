package Patints;

import java.util.ArrayList;
//Создать классы, спецификации которых приведены ниже.
// Определить конструкторы и методв setТип(), getТип(), toString()
// Определить дополнительно методы в классе, создающем массив объектов.
//Задать критерий выбора данных и вывести эти данные на консоль.
//В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
//1. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
// Создать массив объектов. Вывести:
//а) список пациентов, имеющих данный диагноз ;
//б) список пациентов, номер медицинской карты которых находится в заданном интервале.

public class Patients {

    ArrayList <Patient>patients;

    public Patients(){
        patients=new ArrayList<>();
    }

    protected void addPatient (Patient patient){
        patients.add(patient);
    }

    public void printPatients(){
        for (int i=0; i<patients.size();i++) {
            System.out.println(patients.get(i));
        }
    }

    protected void listPatientsWithDiagnosis(String diagnosis){
        System.out.println("Список пациентов с диагнозом "+diagnosis );
        for (int i=0; i<patients.size();i++) {
            if (diagnosis == patients.get(i).diagnosis) {
                System.out.println(patients.get(i).surname + " " + patients.get(i).name + " " + patients.get(i).patronymic);
            }
        }
    }

    protected void listPatientsNumberMedCardOfInterval(int startInterval,int finfshInterval){
        System.out.println("Список пациентов с мед. картами в интервале от "+startInterval+ " до "+finfshInterval );
        for (int i=0; i<patients.size();i++) {
            if (startInterval< patients.get(i).numberMedCard && finfshInterval>patients.get(i).numberMedCard) {
                System.out.println(patients.get(i).surname + " " + patients.get(i).name + " " + patients.get(i).patronymic);
            }
        }
    }

}
