package com.example.app.product.textfield;

import com.example.app.utils.ConsoleColors;

public class TerminalTextField implements TextField {
    @Override
    public void render() {
        System.out.println(ConsoleColors.BG_BLACK + ConsoleColors.GREEN + " [Input_Field] " + ConsoleColors.RESET);
    }

    @Override
    public void onType() {
        System.out.println(ConsoleColors.BG_BLACK + ConsoleColors.GREEN + " [Input_Processing...] " + ConsoleColors.RESET);
    }
}