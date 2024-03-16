package src.lab2.Task7;

public class Main {
    public static void main(String[] args) {
        IBankAccount acc = new BankAccount(1000);
        System.out.println("Начальный баланс: " + acc.getBalance());

        try {
            double depAmount = 500;
            double balanceAfterDep = acc.deposit(depAmount);
            System.out.println(
                String.format("Баланс после пополнения %s : %s", depAmount, balanceAfterDep)
            );
        } catch (Exception err) {
            System.out.println("Ошибка: " + err);
        }

        try {
            acc.deposit(-500);
        } catch (Exception err) {
            System.out.println("Ошибка: " + err);
        } finally {
            System.out.println("Баланс: " + acc.getBalance());
        }

        try {
            double withdrawAmount = 700;
            double balanceAfterWithdraw = acc.withdraw(withdrawAmount);
            System.out.println(
                String.format("Баланс после снятия %s : %s", withdrawAmount, balanceAfterWithdraw)
            );
        } catch (Exception err) {
            System.out.println("Ошибка: " + err);
        }

        try {
            acc.withdraw(20000);
        } catch (Exception err) {
            System.out.println("Ошибка: " + err);
        }
        System.out.println("Итоговый баланс: " + acc.getBalance());
    }
}