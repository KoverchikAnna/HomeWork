public class Runner_2_1 {
    //1. Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//А) минут + секунд,
//В) часов + минут + секунд,
//С) дней + часов + минут + секунд,
//D) недель + дней + часов + минут + секунд.
//по аналогии с имеющимся кодом:
//public class TaskOne {
//public static void main(String[] args) {
//		int sec = 4_521_424;
//		int min = sec/60;
//		int secRest = sec%60;
//
//System.out.println(sec + " seconds is: " + min +" full minutes and " + secRest + " seconds.");
//System.out.println("OR");
//	}
//}
public static void main (String [] args) {
    int sec=4500;
    int secRest=sec%60;
    int min=sec/60;
    int hour=min/60;
    int day=hour/24;
    int week=day/7;
    System.out.println(sec + " seconds is: "+min+" full minutes and "+ secRest+ " seconds.");
    System.out.println("OR");
    System.out.println(sec + " seconds is: " +hour+ " full hours and "+(min-hour*60)+" minutes and "+ secRest+ " seconds.");
    System.out.println("OR");
    System.out.println(sec + " seconds is: " +day+ " full days and "+(hour-day*24)+ " hours and "+(min-hour*60)+" minutes and "+ secRest+ " seconds.");
    System.out.println("OR");
    System.out.println(sec + " seconds is: " +week+ " full weeks and "+(day-week*7)+ " days and "+(hour-day*24)+ " hours and "+(min-hour*60)+" minutes and "+ secRest+ " seconds.");
}
}
