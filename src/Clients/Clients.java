package Clients;

abstract public class Clients {

    private double amount;
    protected double sum = 0;

   public void addAmount(double amount)
   {
       this.sum += amount;
       System.out.println("Счет пополнен на сумму " + amount);
       System.out.println("Сумма на счету " + sum);
       System.out.println("");
   };
    public void takeAmount(double amount)
    {
        if (amount > sum){
            System.out.println("Недостаточно средств для снятия");
            System.out.println("---");
        } else {
            this.sum -= amount;
            System.out.println("Общая сумма, снятая со счета: " + amount);
            System.out.println("Сумма на счету " + sum);
            System.out.println("");
        }
    };
   public double showAccount()
   {
       String message = "Остаток по Вашему счету: ";
       message += sum;
       System.out.println(message);
       return sum;
   };


}
