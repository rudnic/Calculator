package sample;

import java.lang.*;
import java.math.BigInteger;
import java.util.Locale;

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

    private void errorAlert(Exception e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(e.getClass().toString());
        alert.setContentText(e.getMessage());
        alert.showAndWait();
    }

    // Функция перевода числа в десятичную систему (для работы с 16ти-ричной системой
    private String transToDec(String strNum, int sourceType) {
        try {
            return String.valueOf(new BigInteger(new BigInteger(strNum, sourceType).toString(10)));
        } catch (Exception e) {
            errorAlert(e);
        }
        return "0";
    }

    protected String transformation(String strNum, int sourceType, int postType) {

        if (postType == 16) {
            String res = transToDec(strNum, sourceType);
            try {
                return Integer.toHexString(Integer.parseInt(res)).toUpperCase(Locale.ROOT);
            } catch (Exception e) {
                errorAlert(e);
            }
        }

        if (sourceType == 16) {
            try {
                int tempRes = Integer.parseInt(strNum, 16);
                BigInteger result = new BigInteger(new BigInteger(String.valueOf(tempRes), 10).toString(postType));
                return result.toString();
            } catch (NumberFormatException e) {
                errorAlert(e);
            }
        }

        BigInteger result = BigInteger.valueOf(0);
        try {
            result = new BigInteger(new BigInteger(strNum, sourceType).toString(postType));
        } catch (NumberFormatException e) {
            errorAlert(e);
        }
        return (String.valueOf(result));

    }

    public void onClickButton() {
        String strNum = sourceNum.getText();

        int sourceType = Integer.parseInt((String) from.getValue());
        int postType = Integer.parseInt((String) into.getValue());

        resField.setText(transformation(strNum, sourceType, postType));
    }
}
