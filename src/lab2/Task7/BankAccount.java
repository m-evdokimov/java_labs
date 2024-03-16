package src.lab2.Task7;

interface IBankAccount {
    double deposit(double amount) throws Exception;
    double withdraw(double amount) throws Exception;
    double getBalance();
}

class BankAccount implements IBankAccount {
    private double balance;

    public BankAccount(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double deposit(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Сумма пополнения должна быть положительной");
        }
        this.balance += amount;
        return this.getBalance();
    }
    
    @Override
    public double withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Сумма снятия должна быть положительной");
        }
        if (this.balance < amount) {
            throw new Exception("Недостаточно средств");
        }

        this.balance -= amount;
        return this.getBalance();
    }
}