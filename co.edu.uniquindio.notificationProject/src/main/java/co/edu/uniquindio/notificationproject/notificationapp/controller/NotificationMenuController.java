package co.edu.uniquindio.notificationproject.notificationapp.controller;

import co.edu.uniquindio.notificationproject.notificationapp.factory.EmailFactory;
import co.edu.uniquindio.notificationproject.notificationapp.factory.NotificationFactory;
import co.edu.uniquindio.notificationproject.notificationapp.factory.SMSFactory;
import co.edu.uniquindio.notificationproject.notificationapp.services.INotification;

public class NotificationMenuController {
    NotificationFactory factory;

    public void sendMessage(String type, String message){
        if (type.equalsIgnoreCase("Email")){
            factory = new EmailFactory();
        }
        else if (type.equalsIgnoreCase("SMS")){
            factory = new SMSFactory();
        }
        INotification notification = factory.createNotification();
        notification.send(message);
    }
}