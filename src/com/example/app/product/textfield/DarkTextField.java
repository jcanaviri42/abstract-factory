package com.example.app.product.textfield;

import com.example.app.utils.ConsoleColors;

public class DarkTextField implements TextField {

    @Override
    public void render() {
        System.out.println(ConsoleColors.BG_BLACK + ConsoleColors.WHITE + " [Text Field] " + ConsoleColors.RESET);
    }

    @Override
    public void onType() {
        System.out.println(ConsoleColors.BG_BLACK + ConsoleColors.WHITE + " [Typing...] " + ConsoleColors.RESET);
    }

}
