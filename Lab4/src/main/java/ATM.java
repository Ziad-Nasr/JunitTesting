public class ATM {
    int Money;

    public ATM(int money) {
        Money = money;
    }
    public ATM() {
    }

    public void setMoney(int money) {
        Money = money;
    }

    public int showMoney() {
        //stub
        return Money;
    }

    public int Operation(int op, int Amount){
        if(op == 1 ) return Deposit(Amount);
        else if(op == 2 ) return Withdraw(Amount);
        else return -1;
    }
    public int Deposit(int Amount){
        Money += Amount;
        return showMoney();
    }
    public int Withdraw(int Amount){
        if(Money < Amount) return -1;
        Money -= Amount;
        return showMoney();
    }
}
