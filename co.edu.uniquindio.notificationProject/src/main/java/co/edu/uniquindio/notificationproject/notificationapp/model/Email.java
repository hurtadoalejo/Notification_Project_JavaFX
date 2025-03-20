package co.edu.uniquindio.notificationproject.notificationapp.model;

import co.edu.uniquindio.notificationproject.notificationapp.services.INotification;

import javax.swing.*;

public class Email implements INotification {
    @Override
    public void send(String message) {
        JOptionPane.showMessageDialog(null, "Sending Email: " + message, "Message", JOptionPane.PLAIN_MESSAGE);
    }
}
