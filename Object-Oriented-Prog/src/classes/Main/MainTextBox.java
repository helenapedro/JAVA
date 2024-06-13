package classes.Main;

import classes.TextBox;

public class MainTextBox {
    // Creating Objects
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        //System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        //System.out.println(textBox2.text.toUpperCase());

        // Memory Allocation Example
        var texBox3 = new TextBox();
        var texBox4 = texBox3;
        texBox4.setText("Hello World");
        //System.out.println(texBox3.text);
    }
}
