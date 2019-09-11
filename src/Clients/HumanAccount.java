package Clients;

public class HumanAccount extends Clients {

    public HumanAccount(double amount){
        this.sum = amount;
        System.out.println("Первоначальный остаток по счету: " + sum);
        System.out.println("---");
    }
}
