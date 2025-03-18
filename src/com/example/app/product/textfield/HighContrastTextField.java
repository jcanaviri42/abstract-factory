package com.example.app.product.textfield;

import com.example.app.utils.ConsoleColors;

public class HighContrastTextField implements TextField {
    @Override
    public void render() {
        System.out.println(ConsoleColors.BG_YELLOW + ConsoleColors.BLACK + ConsoleColors.BOLD + " [TEXT FIELD] " + ConsoleColors.RESET);
    }

    @Override
    public void onType() {
        System.out.println(ConsoleColors.BG_YELLOW + ConsoleColors.BLACK + ConsoleColors.BOLD + " [TYPING...] " + ConsoleColors.RESET);
    }
}
