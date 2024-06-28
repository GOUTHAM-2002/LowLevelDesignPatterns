public class FactoryPatternTest {
    public static void main(String[] args){
        NotificationFactory factory = new NotificationFactory();

        Notification smsNotification = factory.createNotification("SMS");
        smsNotification.notifyUser();

        Notification emailNotification = factory.createNotification("EMAIL");
        emailNotification.notifyUser();

        Notification pushNotification = factory.createNotification("PUSH");
        pushNotification.notifyUser();


    }
}
