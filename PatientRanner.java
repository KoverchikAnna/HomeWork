package Patints;

public class PatientRanner {
    //Создать классы, спецификации которых приведены ниже.
    // Определить конструкторы и методв setТип(), getТип(), toString()
    // Определить дополнительно методы в классе, создающем массив объектов.
    //Задать критерий выбора данных и вывести эти данные на консоль.
    //В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
    //1. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
    // Создать массив объектов. Вывести:
    //а) список пациентов, имеющих данный диагноз ;
    //б) список пациентов, номер медицинской карты которых находится в заданном интервале.
    public static void main(String[] args) {
        Patient patient0 = new Patient(1, "Kalinovskay", "Kate", "Nikolaevna",
                "Pinsk,str Center, 23-56", "+375 29 695 82 64", 15863, "Animi");
        Patient patient1 = new Patient(2, "Ivanov", "Viktor", "Sergeevich",
                "Pinsk,str Center, 23-56", "+375 29 695 82 64", 159513, "Animi");
        Patient patient2 = new Patient(56, "Petov", "Mihail", "Nikolaevich",
                "Pinsk,str Center, 23-56", "+375 29 695 82 64", 19862, "Mijgiy");

        Patients patients = new Patients();

        patients.addPatient(patient0);
        patients.addPatient(patient1);
        patients.addPatient(patient2);

        patients.printPatients();

        patients.listPatientsWithDiagnosis("Animi");
        patients.listPatientsNumberMedCardOfInterval(1,20000);
    }
}
