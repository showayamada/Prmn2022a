package lecture04;

public class Account {
    private String name;
    private String number;
    private long balance;
    Account (String name, String number) {
        setName(name);
        setNumber(number);
        setBalance(0);
    }

    public String getName () {
        return this.name;
    }

    private void setName (String name) {
        this.name = name;
    }

    public String getNumber () {
        return this.number;
    }

    private  void setNumber (String number) {
        this.number = number;
    }

    public long getBalance () {
        return this.balance;
    }

    public void setBalance (long balance) {
        this.balance = balance;
    }
}
