package com.example.app.product.button;

import com.example.app.utils.ConsoleColors;

public class HighContrastButton implements Button {
    @Override
    public void render() {
        System.out.println(ConsoleColors.BG_YELLOW + ConsoleColors.BLACK + ConsoleColors.BOLD + " [BUTTON] " + ConsoleColors.RESET);
    }

    @Override
    public void onClick() {
        System.out.println(ConsoleColors.BG_YELLOW + ConsoleColors.BLACK + ConsoleColors.BOLD + " [BUTTON CLICKED] " + ConsoleColors.RESET);
    }

}
