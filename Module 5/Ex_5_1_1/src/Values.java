public class Values extends Thread {
    private int value;
    private String type;

    public Values(String type, int value) {
        this.value = value;
        this.type = type;
    }

    public void run() {
        for(int i = 1; i <= value; i++) {
            if (type.equals("odd") && i % 2 != 0) {
                System.out.println("Odd: " + i);
            } else if (type.equals("even") && i % 2 == 0) {
                System.out.println("Even: " + i);
            }

        }
    }

    public static void main(String[] args) {
        new Values("odd",20).start();
        new Values("even",20).start();
    }
}