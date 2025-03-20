package co.edu.uniquindio.notificationproject.notificationapp.factory;

import co.edu.uniquindio.notificationproject.notificationapp.services.INotification;

public abstract class NotificationFactory {
    public abstract INotification createNotification();
}