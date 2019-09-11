package Clients;

public class CompanyAccount extends Clients {
    private double takeCommissionPercent = 0.01;

    public CompanyAccount(double amount){
        this.sum = amount;
        System.out.println("Первоначальный остаток по счету: " + sum);
        System.out.println("---");
    }

    @Override
    public void takeAmount(double amount) {
        super.takeAmount(amount * (1 + takeCommissionPercent));
    }
}
