public class Eleventh extends CreditCard {
//    If the parameter to the makePayment method of the CreditCard class (see Code Fragment 1.5)
//    were a negative number, that would have the effect of raising the balance on the account.
//    Revise the implementation so that it throws an IllegalArgumentException if a negative amount is sent as a parameter.


    public Eleventh(String cust, String bk, String acnt, int lim, double initialBal) {
        super(cust, bk, acnt, lim, initialBal);
    }

    public Eleventh(String cust, String bk, String acnt, int lim) {
        super(cust, bk, acnt, lim);
    }

    public void makePayment(double amount) { // make a payment
        if(amount<0)
            throw new IllegalArgumentException("Negative Amount is not Allowed");
        balance -= amount;
    }
}
