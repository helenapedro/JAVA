package classes.Main;

import classes.Browser;

public class MainBrowser {
    public static void main(String[] args) {
        // Reducing Coupling
        var browser = new Browser();
        browser.navigate("https://helenapedro.github.io");
    }
}

