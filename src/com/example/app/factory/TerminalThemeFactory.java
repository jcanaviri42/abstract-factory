package com.example.app.factory;

import com.example.app.product.button.Button;
import com.example.app.product.button.TerminalButton;
import com.example.app.product.textfield.TerminalTextField;
import com.example.app.product.textfield.TextField;

public class TerminalThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new TerminalButton();
    }

    @Override
    public TextField createTextField() {
        return new TerminalTextField();
    }

    @Override
    public String getThemeName() {
        return "Terminal Theme";
    }
}
