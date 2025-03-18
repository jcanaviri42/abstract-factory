package com.example.app.factory;

import com.example.app.product.button.Button;
import com.example.app.product.button.DarkButton;
import com.example.app.product.textfield.DarkTextField;
import com.example.app.product.textfield.TextField;

public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }

    @Override
    public String getThemeName() {
        return "Dark Theme";
    }
}
