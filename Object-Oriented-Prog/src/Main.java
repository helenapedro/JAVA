import classes.TextBox;

public class Main {
    // we use "static" only when we really want to call a
    // method from the main method.
    public static void main(String[] args) {
        // The main method is always declared as static to enable Java runtime
        // to directly call this method without having to create a new object.
        var textBox = new TextBox();
        textBox.setText("Hello World");
        System.out.println(textBox);
        //new UIControl(true);
    }
}

// Principles of Object-Oriented Programming:
// Encapsulation
// Abstraction

// In OOP a class can have two types of members:
// instance members and static members.
// Instance members belongs to instances or objects.
// Static or Class members are the fields and methods that belongs to a class.
// We use static fields in situations where a value is independent of objects.
// You're going to share it across all objects.