package sample;

import java.lang.*;
import java.math.BigInteger;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField resField;
    @FXML
    private TextField sourceNum;
    @FXML
    private ChoiceBox from;
    @FXML
    private ChoiceBox into;

    public void onClickButton() {
        String strNum = sourceNum.getText();
        BigInteger result = BigInteger.valueOf(0);

        int sourceType = Integer.parseInt((String) from.getValue());
        int postType = Integer.parseInt((String) into.getValue());
        try {
            result = new BigInteger(new BigInteger(strNum, sourceType).toString(postType));
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("Ошибка ввода числа!");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
        resField.setText(String.valueOf(result));
    }
}
