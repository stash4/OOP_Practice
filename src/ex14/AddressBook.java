package ex14;

import java.io.*;
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Address> book;

    public AddressBook() {
        book = new ArrayList<Address>();
    }

    public void add(Address address) {
        book.add(address);
    }

    public void showAddress() {
        for (Address address : book) {
            System.out.println(address.toString());
        }
    }

    public void open(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] array = line.split(",");
                Address address = new Address(array[0], array[1], array[2], array[3]);
                book.add(address);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void save(String filename) {
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            for (Address address : book) {
                writer.println(address.toString());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        System.out.println("ファイルから読み込む。");
        book.open("address.txt");
        System.out.println("一覧の表示。");
        book.showAddress();
        System.out.println("新規データの追加。");
        Address taroAddress = new Address("電大太郎", "東京都千代田区", "03-5280-XXXX", "taro@dendai.ac.jp");
        book.add(taroAddress);
        System.out.println("一覧の表示。");
        book.showAddress();
        System.out.println("ファイルに書き出す。");
        book.save("address2.txt");
    }
}
