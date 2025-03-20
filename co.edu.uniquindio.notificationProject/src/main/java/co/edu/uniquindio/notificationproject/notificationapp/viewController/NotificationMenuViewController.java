package co.edu.uniquindio.notificationproject.notificationapp.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.notificationproject.notificationapp.App;
import co.edu.uniquindio.notificationproject.notificationapp.controller.NotificationMenuController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class NotificationMenuViewController {

    NotificationMenuController notificationMenuController;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txt_message;

    @FXML
    private Button bt_clean;

    @FXML
    private Label lb_message;

    @FXML
    private ComboBox<String> cb_typeNotification;

    @FXML
    private Button bt_sendMessage;

    @FXML
    private Pane pane;

    @FXML
    private Label lbl_notificationMenu;

    @FXML
    private Label lb_typeNotification;

    @FXML
    void onSendMessage() {
        if (verifyFilledFields()){
            notificationMenuController.sendMessage(cb_typeNotification.getSelectionModel().getSelectedItem(), txt_message.getText());
            onClean();
        }
    }

    @FXML
    void onClean() {
        cleanProjectFields();
    }

    private boolean verifyFilledFields(){
        boolean filled = false;
        if (!txt_message.getText().isEmpty() && !cb_typeNotification.getSelectionModel().isEmpty()){
            filled = true;
        }
        return  filled;
    }

    private void cleanProjectFields(){
        txt_message.clear();
        cb_typeNotification.getSelectionModel().clearSelection();
    }

    public void setApp(App app){
        this.app = app;
    }

    @FXML
    void initialize() {
        notificationMenuController = new NotificationMenuController();
        cb_typeNotification.getItems().addAll("Email", "SMS");
        assert txt_message != null : "fx:id=\"txt_message\" was not injected: check your FXML file 'notificationMenu.fxml'.";
        assert bt_clean != null : "fx:id=\"bt_clean\" was not injected: check your FXML file 'notificationMenu.fxml'.";
        assert lb_message != null : "fx:id=\"lb_message\" was not injected: check your FXML file 'notificationMenu.fxml'.";
        assert cb_typeNotification != null : "fx:id=\"cb_typeNotification\" was not injected: check your FXML file 'notificationMenu.fxml'.";
        assert bt_sendMessage != null : "fx:id=\"bt_sendMessage\" was not injected: check your FXML file 'notificationMenu.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'notificationMenu.fxml'.";
        assert lbl_notificationMenu != null : "fx:id=\"lbl_notificationMenu\" was not injected: check your FXML file 'notificationMenu.fxml'.";
        assert lb_typeNotification != null : "fx:id=\"lb_typeNotification\" was not injected: check your FXML file 'notificationMenu.fxml'.";

    }
}
