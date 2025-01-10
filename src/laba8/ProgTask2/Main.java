package laba8.ProgTask2;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream rd = null;
        DataOutputStream wr1 = null;
        DataOutputStream wr2 = null;
        try {
            File f1 = new File("src/laba8/ProgTask2/text.txt");
            f1.createNewFile();

            Scanner sc = new Scanner(System.in, "cp1251");
            wr1 = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));

            System.out.println("Введите первую строку: ");
            String str1 = sc.nextLine();
            wr1.writeUTF(str1);

            System.out.println("Введите вторую строку: ");
            String str2 = sc.nextLine();
            wr1.writeUTF(str2);

            System.out.println("Введите 5 чисел типа double: ");
            for (int i = 0; i < 5; i++) {
                wr1.writeDouble(sc.nextDouble());
            }

            rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr2 = new DataOutputStream(new FileOutputStream("src/laba8/ProgTask2/text2.txt"));
            rd.readUTF();
            wr2.writeUTF(rd.readUTF());
            for (int i = 1; i <= 5; i++) {
                double num = rd.readDouble();
                if (num > 0) {
                    System.out.println(num);
                    wr2.writeDouble(num);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        } finally {
            wr1.flush();
            wr1.close();
            wr2.flush();
            wr2.close();
            rd.close();
        }
    }
}
