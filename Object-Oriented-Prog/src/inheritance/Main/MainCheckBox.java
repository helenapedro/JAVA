package inheritance.Main;

import classes.TextBox;
import inheritance.CheckBox;
import inheritance.UIControl;

public class MainCheckBox {
    public static void main(String[] args) {
        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (var control : controls)
            control.render(); // polymorphism
    }
}
