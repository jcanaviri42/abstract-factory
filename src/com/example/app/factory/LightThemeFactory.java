package com.example.app.factory;

import com.example.app.product.button.Button;
import com.example.app.product.button.LightButton;
import com.example.app.product.textfield.LightTextField;
import com.example.app.product.textfield.TextField;

public class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }

    @Override
    public String getThemeName() {
        return "Light Theme";
    }
}
