public class Pen {

    private boolean isCapOn = true;
    private Color color;

    Pen(){
       this.color = Pen.Color.RED;
    }
    Pen(Color color){
        this.color = color;

    }


    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;

        Color(String color) {
            this.color = color; };
        @Override public String toString() { return color; }
    }

    // your code here
    public String draw() {
        if (isCapOn) {
            return "";
        }
        return "Drawing " + color.toString();

    }

    public void capOff() {
        isCapOn = false;
    }

    public void capOn() {
        isCapOn = true;
    }

    public void changeColor(Color color) {
        if (isCapOn) {
            this.color = color;
        }
    }
}