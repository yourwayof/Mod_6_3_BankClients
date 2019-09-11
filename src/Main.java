import Clients.CompanyAccount;
import Clients.HumanAccount;
import Clients.IndividualBusinessmanAccount;

public class Main {

    public static void main(String[] args) {
        System.out.println("Реализуйте классы, представляющие клиентов банка: абстрактный класс Client, а также классы для физических лиц, юридических лиц и индивидуальных предпринимателей. \nУ каждого клиента есть расчётный счёт (число), который можно пополнять, с которого можно снимать, и баланс на котором можно смотреть. \nРеализовать методы таким образом, чтобы у физических лиц пополнение и снятие происходило без комиссии, у юридических лиц — снятие с комиссией 1%, а у ИП — пополнение с комиссией 1%, если сумма меньше 1000 рублей, и 0,5%, если сумма больше либо равна 1000 рублей.");
        System.out.println("---");

        HumanAccount humanAccount = new HumanAccount(100000);
        humanAccount.showAccount();
        humanAccount.addAmount(500);
        humanAccount.takeAmount(10000);
        humanAccount.showAccount();
        System.out.println("---");

        CompanyAccount companyAccount = new CompanyAccount(100000);
        companyAccount.showAccount();
        companyAccount.addAmount(500);
        companyAccount.takeAmount(10000);
        companyAccount.showAccount();
        System.out.println("---");

        IndividualBusinessmanAccount individualBusinessmanAccount = new IndividualBusinessmanAccount(100000.0);
        individualBusinessmanAccount.showAccount();
        individualBusinessmanAccount.addAmount(500);
        individualBusinessmanAccount.addAmount(10000);
        individualBusinessmanAccount.takeAmount(55);
        individualBusinessmanAccount.showAccount();
        System.out.println("---");


    }


}
