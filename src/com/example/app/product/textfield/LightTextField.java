package com.example.app.product.textfield;

import com.example.app.utils.ConsoleColors;

public class LightTextField implements TextField {

    @Override
    public void render() {
        System.out.println(ConsoleColors.BG_WHITE + ConsoleColors.BLACK + " [Text Field] " + ConsoleColors.RESET);
    }

    @Override
    public void onType() {
        System.out.println(ConsoleColors.BG_WHITE + ConsoleColors.BLACK + " [Typing...] " + ConsoleColors.RESET);
    }

}
