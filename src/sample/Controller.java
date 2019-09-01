package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ImageView fpImage;

    @FXML
    private TextField leftCount;

    @FXML
    private TextField rightCount;

    @FXML
    private TextField patternType;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
