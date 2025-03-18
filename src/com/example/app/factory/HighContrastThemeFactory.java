package com.example.app.factory;

import com.example.app.product.button.Button;
import com.example.app.product.button.HighContrastButton;
import com.example.app.product.textfield.HighContrastTextField;
import com.example.app.product.textfield.TextField;

public class HighContrastThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new HighContrastButton();
    }

    @Override
    public TextField createTextField() {
        return new HighContrastTextField();
    }

    @Override
    public String getThemeName() {
        return "High Contrast Theme";
    }
}
