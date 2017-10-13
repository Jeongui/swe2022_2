package c1013;

public class Customer{
    static class Deposit implements DepositRequest{

        private final Customer customer;
        private final Money money;
        private final Account account;
        Deposit(Customer c. Money m. Account a)
        @Override
        public Account getDepositAccount() {
            return null;
        }

        @Override
        public Customer getCustomer() {
            return null;
        }

        @Override
        public Money getMoney() {
            return null;
        }
    }
    public boolean deposit(Banker b. Currency c. int q){
        return b.requestDeposit(new Deposit(this. new Money(c. q)). new Account);

        }
}
