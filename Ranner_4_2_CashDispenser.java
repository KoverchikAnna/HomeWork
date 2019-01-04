package CashDispenser;

import java.util.Scanner;
//2.Создать класс и объекты, описывающие банкомат.
//Набор купюр в банкомате должен задаваться тремя свойствами: количеством купюр
//номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат. Сделать
//функцию снимающую деньги. На вход передается сумма денег, на выход – буленовское
//значение (удалась операция или нет). При снятии денег функция должна распечатывать
//каким количеством купюр какого номинала выдается сумма.
//Создать конструктор с тремя параметрами – количеством купюр. Усложнение
//задачи – по собственному желанию.

public class Ranner_4_2_CashDispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CashDispenser cashDispenser = new CashDispenser();
        System.out.println("Введите количество добавленных купюр в банкомат номиналом 20 ");
        cashDispenser.refillCashDispenser20(scanner.nextInt());
        System.out.println("Введите количество добавленных купюр в банкомат номиналом 50 ");
        cashDispenser.refillCashDispenser50(scanner.nextInt());
        System.out.println("Введите количество добавленных купюр в банкомат номиналом 100 ");
        cashDispenser.refillCashDispenser100(scanner.nextInt());
        System.out.println("Введите сумму снятия ");
        System.out.println(cashDispenser.withdrawalMoneyWithCashDispenser(scanner.nextInt()));
        scanner.close();

    }
}
