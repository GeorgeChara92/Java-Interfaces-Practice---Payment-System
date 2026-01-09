public class PayPalPayments implements  IPaymentProcessor{

    public void amount(double amountSent){
        System.out.println("+-------- PAYMENT SUCCESS --------+\nThe customer has paid via Paypal sending the amount: " + "£"+ amountSent);
    }

}
