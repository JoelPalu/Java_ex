public class Values extends Thread {
    private int value;

    private int s_total = 0;

    private String type;


    private static int total = 0;

    public Values(String type, int value) {
        this.value = value;
        this.type = type;
    }

    public void run() {
        try {

            for(int i = 1; i <= value; i++) {
                s_total++;
                total++;
            }

        } finally {
            System.out.println("type: " + type + " segment total: " + s_total);
            System.out.println("total: " + total);
        }
    }

    public static void main(String[] args) {
        new Values("first",20).start();
        new Values("second",40).start();
    }
}