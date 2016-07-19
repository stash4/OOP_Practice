package ex14;

import java.io.*;

public class PrintDic {
    public static void main(String[] args) {
        String filename = "dic.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] array = line.split(",");
                System.out.println("英単語[" + array[0] + "]は、日本語の[" + array[1] + "]という意味です。");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}