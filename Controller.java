package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtTime;
    @FXML

    private ListView personView;

    public void addList(){
        personView.getItems().add("Name : "+txtName.getText()+ " - ID :"+txtId.getText()+" - Time :"+txtTime.getText());
    }
    public  void clearList(){
        txtName.setText("");
        txtId.setText("");
        txtTime.setText("");
    }
    @FXML
    private void clickAdd(ActionEvent actionEvent) throws IOException {
        addList();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AnotherView.fxml"));
        Parent root = loader.load();
        ((AnotherViewController)loader.getController()).setPersons(personView.getItems());
        Stage stage = new Stage();
        stage.setTitle("Danh sach");
        stage.setScene(new Scene(root));
        stage.show();
        clearList();
    }
}
