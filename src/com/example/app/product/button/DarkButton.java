package com.example.app.product.button;

import com.example.app.utils.ConsoleColors;

public class DarkButton implements Button {

    @Override
    public void render() {
        System.out.println(ConsoleColors.BG_BLACK + ConsoleColors.WHITE + " [Button] " + ConsoleColors.RESET);
    }

    @Override
    public void onClick() {
        System.out.println(ConsoleColors.BG_BLACK + ConsoleColors.WHITE + " [Button Clicked] " + ConsoleColors.RESET);
    }

}
