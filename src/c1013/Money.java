package c1013;

public class Money{

    private final int quantity;
    private final Currency currency;


    private Money(){
        quantity = 0;
        currency = null;
    }

    public Money(Currency currency, int q) {
        this.currency = currency;
        this.quantity = q;

    }

    public int getMoney(Currnecy Currency) {
        return currency.changeMoney(this.currency, this.quantity);
    }
}

