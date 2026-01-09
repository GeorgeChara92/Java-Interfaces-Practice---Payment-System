import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IPaymentProcessor paymentProcessor;
        INotificationSender notificationSender;
        boolean userInputLoop = false;


        System.out.println("+-------- PAYMENT SENDER --------+");


        System.out.println("Enter amount to send: ");
        double amount = scanner.nextDouble();


        while (!userInputLoop) {

            System.out.printf("+-------- PAYMENT TYPE --------+\n1: Credit Card \n2: Paypal\nSelect Payment type: ");
            int paymentOption = scanner.nextInt();

            if (paymentOption == 1) {
                paymentProcessor = new CreditCardPayments();
                paymentProcessor.amount(amount);
                userInputLoop = true;

            } else if (paymentOption == 2) {
                paymentProcessor = new PayPalPayments();
                paymentProcessor.amount(amount);
                userInputLoop = true;

            } else {
                System.out.println("Invalid option, please try again.");
            }
        }


        System.out.println("+-------- CONTACT METHOD --------+\nSelect prefered contact method: ");
        System.out.println("1: Email\n2: SMS\n3: Phone\nSelect Contact Method: ");
        int contactMethod = scanner.nextInt();


        if (contactMethod == 1) {
            notificationSender = new EmailNotificaitonSender();
            System.out.println("+-------- ENTER INFORMATION --------+\nEnter your email address: ");
            String emailAddress = scanner.next();
            notificationSender.send(emailAddress);
        }
        else if (contactMethod == 2){
            notificationSender = new SMSNotificationSender();
            System.out.println("+-------- ENTER INFORMATION --------+\nEnter your phone number for SMS: ");
            String phoneNumber = scanner.next();
            notificationSender.send(phoneNumber);
        }
        else if (contactMethod == 3){
            notificationSender = new SMSNotificationSender();
            System.out.println("+-------- ENTER INFORMATION --------+\nEnter your phone number: ");
            String phoneNumber = scanner.next();
            notificationSender.send(phoneNumber);
        }

    }
}