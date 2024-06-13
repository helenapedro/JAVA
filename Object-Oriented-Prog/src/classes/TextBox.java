package classes;

import inheritance.UIControl;

public class TextBox extends UIControl {
    private String text = ""; // Field


        // Constructor
//    public TextBox() {
//        super(true);
//        //System.out.println("TextBox");;
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    // Methods
    public  void  setText(String text) {
        this.text = text;
    }
    public  void  clear() {
        text = "";
    }
}
