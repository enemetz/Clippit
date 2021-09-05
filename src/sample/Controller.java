package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private Button copyButton;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    // will send what is in text field to database
    public void copyButtonPressed(javafx.event.ActionEvent actionEvent) {
        System.out.println("Copy button pressed");
        System.out.println(textField.getText());
        Network net = new Network();
        net.publishItems(textField.getText());
    }
}
