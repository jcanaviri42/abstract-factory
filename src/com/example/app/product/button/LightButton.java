package com.example.app.product.button;

import com.example.app.utils.ConsoleColors;

public class LightButton implements Button {

    @Override
    public void render() {
        System.out.println(ConsoleColors.BG_WHITE + ConsoleColors.BLACK + " [Button] " + ConsoleColors.RESET);
    }

    @Override
    public void onClick() {
        System.out.println(ConsoleColors.BG_WHITE + ConsoleColors.BLACK + " [Button Clicked] " + ConsoleColors.RESET);
    }

}
