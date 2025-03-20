module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.desktop;

    opens co.edu.uniquindio.notificationproject.notificationapp to javafx.fxml;
    exports co.edu.uniquindio.notificationproject.notificationapp;
    exports co.edu.uniquindio.notificationproject.notificationapp.viewController;
    opens co.edu.uniquindio.notificationproject.viewController to javafx.fxml;
}