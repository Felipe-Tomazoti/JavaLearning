package entities;

public class Bank {
    private int accountNumber;
    private String accountName;
    private double balence;

    public Bank(int accountNumber, String accountName, double accountMoneyValue){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        setDepositInBank(accountMoneyValue);
    }
    public Bank(int accountNumber, String accountName){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public void setDepositInBank(double amount){
        balence += amount;
    }

    public void setBankWithdrawal(double amount){
        balence = balence -
                amount - 5.0;
    }

    public String toString(){
        return "Account " + accountNumber+
                ", Holder: " + accountName + ", Balance: $ " + String.format("%.2f",balence);
    }

}
