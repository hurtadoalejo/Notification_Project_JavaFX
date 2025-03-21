package co.edu.uniquindio.notificationproject.notificationapp.factory;

import co.edu.uniquindio.notificationproject.notificationapp.model.*;
import co.edu.uniquindio.notificationproject.notificationapp.services.INotification;

public class EmailFactory extends NotificationFactory{
    @Override
    public INotification createNotification() {
        return new Email();
    }
}