package co.edu.uniquindio.notificationproject.notificationapp.factory;

import co.edu.uniquindio.notificationproject.notificationapp.services.INotification;

public class SMS implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
