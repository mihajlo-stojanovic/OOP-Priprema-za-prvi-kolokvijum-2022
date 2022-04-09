package demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class Fajlovi {

    public static void ispisiUFajl(List<Object> objects) {
        Scanner sc = new Scanner(System.in);
        String imeFajla = sc.nextLine();
        sc.close();
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(imeFajla);
            pw = new PrintWriter(fw);
            for (Object object : objects) {
                pw.println(object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pw.close();
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

    }
}
