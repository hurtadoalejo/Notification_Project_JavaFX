package co.edu.uniquindio.notificationproject.notificationapp.factory;

import co.edu.uniquindio.notificationproject.notificationapp.model.SMS;
import co.edu.uniquindio.notificationproject.notificationapp.services.INotification;

public class SMSFactory extends NotificationFactory{
    @Override
    public INotification createNotification() {
        return new SMS();
    }
}