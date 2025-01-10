package laba8.Ex6;
import java.io.*;
public class File_RW_byByte {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("src/laba8/Ex6/MyFile1.txt");
            out = new FileWriter("src/laba8/Ex6/MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.println((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!");
        } finally {
            in.close();
            out.close();
        }
    }
}
