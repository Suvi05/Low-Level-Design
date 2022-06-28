package Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme;

import Lectures.DesingPatterns.CreationalDP.Factory.FactoryMethod.Theme.Light.LightTheme;

public class Client {
    public static void main(String[] args) {
        Theme lightTheme = new LightTheme();//In case of Dark Theme just change LightTheme() to DarkTheme()
        ThemeComponentFactory componentFactory = lightTheme.createComponentFactory();

        Button button = componentFactory.createButton();
        Menu menu = componentFactory.createMenu();
    }
}
