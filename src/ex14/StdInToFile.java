package ex14;

import java.io.*;

public class StdInToFile {
    public static void main(String[] args) {
        String filename = "test.txt";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}