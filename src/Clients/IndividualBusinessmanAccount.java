package Clients;

public class IndividualBusinessmanAccount extends Clients{

    public IndividualBusinessmanAccount (double amount)
    {
        this.sum = amount;
        System.out.println("Первоначальный остаток по счету: " + sum);
        System.out.println("---");
    }

    public void addAmount (double amount)
    {
        if (amount >= 1000){
            double addCommissionPercent = 0.005;
            System.out.println("Внесена сумма = " + amount);
            System.out.println("Комиссия составит " + addCommissionPercent*100 + "%");
            super.addAmount(amount*(1 - addCommissionPercent));

        } else {
            double addCommissionPercent = 0.01;
            System.out.println("Внесена сумма = " + amount);
            System.out.println("Комиссия составит " + addCommissionPercent*100 + "%");
            super.addAmount(amount*(1 - addCommissionPercent));
        }

    }
}
