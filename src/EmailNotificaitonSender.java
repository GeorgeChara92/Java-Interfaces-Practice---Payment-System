public class EmailNotificaitonSender implements INotificationSender{
    public void send(String message){
        System.out.println("+-------- NOTIFICATION SENT --------+\nEmail Notificaiton sent to : " + message);
    }

}
