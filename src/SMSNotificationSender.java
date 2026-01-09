public class SMSNotificationSender implements INotificationSender {

    public void send(String message){
        System.out.println("+-------- NOTIFICATION SENT --------+\nSMS Notificaiton sent to : " + message);
    }
}
