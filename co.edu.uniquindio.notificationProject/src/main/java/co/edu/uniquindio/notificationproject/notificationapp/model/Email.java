package co.edu.uniquindio.notificationproject.notificationapp.factory;

import co.edu.uniquindio.notificationproject.notificationapp.services.INotification;

public class Email implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
