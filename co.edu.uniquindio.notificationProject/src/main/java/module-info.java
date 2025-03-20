module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.desktop;
    requires java.management;

    opens co.edu.uniquindio.notificationproject.notificationapp to javafx.fxml;
    exports co.edu.uniquindio.notificationproject.notificationapp;
    exports co.edu.uniquindio.notificationproject.notificationapp.viewController;
    opens co.edu.uniquindio.notificationproject.notificationapp.viewController to javafx.fxml;
}