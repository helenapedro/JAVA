package inheritance;

public abstract class UIControl {
    private boolean isEnabled = true; // field

            // Constructor
//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        //System.out.println("UI Control");
//    }

    public abstract void render(); // abstract method
    public void enable() {
        isEnabled = true;
    } // method

    public void disable() {
        isEnabled = false;
    } // method

    public boolean isEnabled() {
        return isEnabled;
    } // getter
}
