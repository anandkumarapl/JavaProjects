public class BankAccount {
private int balance;
private String name,accountnumber;
static BankAccount[] accounts={new BankAccount(10,"anand","123321123321"),new BankAccount(10,"amit","749259472")};
public BankAccount(int balance,String name,String accountnumber){
    this.balance=balance;
    this.name=name;
    this.accountnumber=this.accountnumber;
    }

public int getBalance(){
    return balance;
}
public String getName(){
    return name;
}
public String getAccountNumber(){
    return accountnumber;
}
public static BankAccount[] accounts(){
    return accounts;
}

    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + ", name=" + name + ", accountnumber=" + accountnumber + '}';
    }
public static void main(String args[]){
    BankAccount a=new BankAccount(6475, "", "");
    System.out.println(a);
}
}
