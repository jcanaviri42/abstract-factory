package com.example.app.factory;

import com.example.app.product.button.Button;
import com.example.app.product.textfield.TextField;

public interface UIFactory {

    Button createButton();

    TextField createTextField();

    String getThemeName();

}
