package com.example.app;

import com.example.app.client.Application;
import com.example.app.factory.DarkThemeFactory;
import com.example.app.factory.HighContrastThemeFactory;
import com.example.app.factory.LightThemeFactory;
import com.example.app.factory.TerminalThemeFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Create app with light theme
        Application lightApp = new Application(new LightThemeFactory());
        lightApp.render();

        // Create app with dark theme
        Application darkApp = new Application(new DarkThemeFactory());
        darkApp.render();

        // Create app with high contrast theme
        Application highContrastApp = new Application(new HighContrastThemeFactory());
        highContrastApp.render();

        // Create app with terminal theme
        Application terminalApp = new Application(new TerminalThemeFactory());
        terminalApp.render();
    }
}
