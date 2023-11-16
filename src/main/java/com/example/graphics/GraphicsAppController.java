package com.example.graphics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class GraphicsAppController {
    @FXML
    public TextField widthInput;
    @FXML
    public TextField heightInput;
    @FXML
    public Button compute;
    @FXML
    public Label circumference;
    @FXML
    public Label area;
    public double getWidth() {
        return Double.parseDouble(widthInput.getText());
    }
    public double getHight() {
        return Double.parseDouble(heightInput.getText());
    }
    public void setCircumference(double circumference) {
        this.circumference.setText(String.format("%.2f", circumference));
    }
    public void setArea(double area) {
        this.area.setText(String.format("%.2f", area));

    }
    public void doCompute(ActionEvent actionEvent) {
        try {
            Rectangular rect = new Rectangular(0, 0, getWidth(), getHight());
            setCircumference(rect.computeCircumference());
            setArea(rect.computeArea());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}