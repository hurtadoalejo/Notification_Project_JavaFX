package co.edu.uniquindio.notificationproject.notificationapp.factory;

import co.edu.uniquindio.notificationproject.notificationapp.model.Email;

public class EmailFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new Email();
    }
}
