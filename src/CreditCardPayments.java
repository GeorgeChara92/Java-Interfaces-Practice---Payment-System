public class CreditCardPayments implements IPaymentProcessor {

    public void  amount(double amountSent){
        System.out.println("+-------- PAYMENT SUCCESS --------+\nCustomer has paid via Credit Card sending the amount: " + "£"+amountSent);
    }
}
