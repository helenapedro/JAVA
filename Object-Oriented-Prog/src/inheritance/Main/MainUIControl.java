package inheritance.Main;

import classes.TextBox;
import inheritance.UIControl;

public class MainUIControl {
    // we use "static" only when we really want to call a method from the main method.
    public static void main(String[] args) {
        //var control = new UIControl(true);
        var textBox = new TextBox();
        show(textBox);
    }

    public static void show(UIControl control) {
        // downcasting
        if (control instanceof  TextBox){
            var textBox = (TextBox)control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
