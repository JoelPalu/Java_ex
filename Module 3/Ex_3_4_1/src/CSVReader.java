import java.io.*;


public class CSVReader {

    //Piti laittaa tiedoston polun alkuun "Module 3/Ex_3_4_1/src/" jotta ohjelma toimisi. Kuin ohjelma etsii jonkun takia tiedostoa projekstin juuresta.
    private final static String FILENAME = "Module 3/Ex_3_4_1/src/temploki.csv";
    public static void main(String[] args) {

        FileReader file;
        BufferedReader bufferedstream = null;
        String line;
        String[] columnNames = new String[0];
        boolean header = true;

        int rows = 0;
        double sum = 0;

        try {
            file = new FileReader(FILENAME);
            bufferedstream = new BufferedReader(file);

            do {
                line = bufferedstream.readLine();
                if (line != null) {
                    if (header) {
                        // first row of the file contains names of columns
                        columnNames = line.split(";");
                        header = false;
                    } else {
                        // just print data lines with column names
                        String[] columns = line.split(";");
                        String dotfix = columns[1].replace(",", ".");
                        if (columns[0].split(" ")[0].equals("01.01.2023")){
                            System.out.println("Date: " + columns[0] + " Temperature: " + dotfix + "C");
                            if (!dotfix.equals("*")) {
                                rows++;
                                sum += Double.parseDouble(dotfix);
                            }
                        }
                    }
                }
            } while (line != null);
        } catch (IOException e) {
            // Error output, will print to console even in case of output redirection
            System.err.println(e);
        } finally {
            try {
                // we will close the stream only if we were able to open it
                if (bufferedstream != null)
                    bufferedstream.close();
                System.out.printf("Average temperature in Ulkotalo: %.1f C", (sum / rows));

            } catch (Exception e) {
                System.out.println("Error while closing the file " + FILENAME);
            }
        }
    }
}