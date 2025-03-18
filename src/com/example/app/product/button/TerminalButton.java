package com.example.app.product.button;

import com.example.app.utils.ConsoleColors;

public class TerminalButton implements Button {
    @Override
    public void render() {
        System.out.println(ConsoleColors.BG_BLACK + ConsoleColors.GREEN + " [Button] " + ConsoleColors.RESET);
    }

    @Override
    public void onClick() {
        System.out.println(ConsoleColors.BG_BLACK + ConsoleColors.GREEN + " [Command Executed] " + ConsoleColors.RESET);
    }
}