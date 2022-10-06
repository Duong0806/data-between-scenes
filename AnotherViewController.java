package sample;

import SwapWindow.Main;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class AnotherViewController  {
    private Button closeButton;
    @FXML
    private ListView<String> personView;
    private List<String> persons;
    public void setPersons(List<String> persons) {
        this.persons = persons;
        personView.getItems().addAll(persons);
    }

    public void goToAdd(ActionEvent actionEvent) throws Exception {
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
