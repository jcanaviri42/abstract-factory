package com.example.app.client;

import com.example.app.factory.UIFactory;
import com.example.app.product.button.Button;
import com.example.app.product.textfield.TextField;
import com.example.app.utils.ConsoleColors;


public class Application {
    private final Button button;
    private final TextField textField;
    private final String themeName;

    public Application(UIFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
        themeName = factory.getThemeName();
    }

    public void render() {
        System.out.println("\n" + ConsoleColors.BOLD + "=== " + themeName + " ===" + ConsoleColors.RESET);
        System.out.println("Rendering UI components:");
        button.render();
        textField.render();
        System.out.println("User interaction:");
        button.onClick();
        textField.onType();
    }
}
