package CashDispenser;
//2.Создать класс и объекты, описывающие банкомат.
//Набор купюр в банкомате должен задаваться тремя свойствами: количеством купюр
//номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат. Сделать
//функцию снимающую деньги. На вход передается сумма денег, на выход – буленовское
//значение (удалась операция или нет). При снятии денег функция должна распечатывать
//каким количеством купюр какого номинала выдается сумма.
//Создать конструктор с тремя параметрами – количеством купюр. Усложнение
//задачи – по собственному желанию.

public class CashDispenser {

    public int quantutyOfBill20;
    public int quantutyOfBill50;
    public int quantutyOfBill100;
    private final int parMoner20 = 20;
    private final int parMoner50 = 50;
    private final int parMoner100 = 100;


    public CashDispenser() {
        this.quantutyOfBill20 = 0;
        this.quantutyOfBill50 = 0;
        this.quantutyOfBill100 = 0;
    }

    public int refillCashDispenser20(int quantutyOfBill20) {
        this.quantutyOfBill20 = this.quantutyOfBill20 + quantutyOfBill20;
        return this.quantutyOfBill20;
    }

    public int refillCashDispenser50(int quantutyOfBill50) {
        this.quantutyOfBill50 = this.quantutyOfBill50 + quantutyOfBill50;
        return this.quantutyOfBill50;
    }

    public int refillCashDispenser100(int quantutyOfBill100) {
        this.quantutyOfBill100 = this.quantutyOfBill100 + quantutyOfBill100;
        return this.quantutyOfBill100;
    }

    public boolean withdrawalMoneyWithCashDispenser(int sumMoney) {
        int quantutyWithdrawalMoneyPar20 = 0;
        int quantutyWithdrawalMoneyPar50 = 0;
        int quantutyWithdrawalMoneyPar100 = 0;
        boolean finishWithdrawalMoneyWithCashDispenser;

        if ((sumMoney / parMoner20 != 0) && (sumMoney != 30)) {
            quantutyWithdrawalMoneyPar20 = sumMoney / parMoner20;
            int ostatok = sumMoney % parMoner20;
            if ((ostatok == 10) && (quantutyWithdrawalMoneyPar20 >= 2)) {
                quantutyWithdrawalMoneyPar50 = 1;
                quantutyWithdrawalMoneyPar20 = quantutyWithdrawalMoneyPar20 - 2;
            }
        }

        if (quantutyWithdrawalMoneyPar20 / 5 > 0) {
            quantutyWithdrawalMoneyPar100 = quantutyWithdrawalMoneyPar20 / 5;
            quantutyWithdrawalMoneyPar20 = quantutyWithdrawalMoneyPar20 % 5;
        }

        if ((quantutyOfBill100 - quantutyWithdrawalMoneyPar100) < 0) {
            quantutyWithdrawalMoneyPar50 = quantutyWithdrawalMoneyPar50 + (quantutyWithdrawalMoneyPar100 - quantutyOfBill100) * 2;
            quantutyWithdrawalMoneyPar100 = quantutyOfBill100;
        } else {
            quantutyOfBill100 = quantutyOfBill100 - quantutyWithdrawalMoneyPar100;
        }

        if ((quantutyOfBill50 - quantutyWithdrawalMoneyPar50) < 0) {
            if (quantutyOfBill50 % 2 == 0) {
                quantutyWithdrawalMoneyPar20 = quantutyWithdrawalMoneyPar20 + (quantutyWithdrawalMoneyPar50 - quantutyOfBill50) / 2 * 5;
                quantutyWithdrawalMoneyPar50 = quantutyOfBill50;
            } else {
                quantutyWithdrawalMoneyPar20 = quantutyWithdrawalMoneyPar20 + (quantutyOfBill50 + 1 - quantutyWithdrawalMoneyPar50) / 2 * 5;
                quantutyWithdrawalMoneyPar50 = quantutyOfBill50 - 1;
            }
        }

        if ((sumMoney == (quantutyWithdrawalMoneyPar100 * parMoner100 + quantutyWithdrawalMoneyPar50 * parMoner50 +
                quantutyWithdrawalMoneyPar20 * parMoner20)) && ((quantutyOfBill20 - quantutyWithdrawalMoneyPar20) >= 0)) {
            finishWithdrawalMoneyWithCashDispenser=true;
           // System.out.println("Транзакция прошла успешно!");
            System.out.println("Сумма " + (quantutyWithdrawalMoneyPar100 * 100 + quantutyWithdrawalMoneyPar50 * 50 +
                    quantutyWithdrawalMoneyPar20 * 20) + " выдана купюрами номиналом 100 " + quantutyWithdrawalMoneyPar100 +
                    " шт., номиналом 50 " + quantutyWithdrawalMoneyPar50 + " шт., номиналом 20 " + quantutyWithdrawalMoneyPar20 + " шт.");
        } else {
            finishWithdrawalMoneyWithCashDispenser=false;
          //  System.out.println("Транзакция не прошла!! ");
        }
        return finishWithdrawalMoneyWithCashDispenser;
    }
}
