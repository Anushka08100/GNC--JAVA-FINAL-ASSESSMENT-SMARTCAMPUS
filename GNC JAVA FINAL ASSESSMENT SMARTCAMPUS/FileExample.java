import java.io.*;

public class FileExample {
    public static void main(String[] args) {

        try {
            // Writing data to file
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello Student\nWelcome to Java File Handling");
            fw.close();

            System.out.println("Data saved successfully!");

            // Reading data from file
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            System.out.println("\nReading Data:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error occurred");
        }
    }
}