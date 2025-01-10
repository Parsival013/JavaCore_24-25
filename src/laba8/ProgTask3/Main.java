package laba8.ProgTask3;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String consonantsRussian = "йцкнгшщзхфвпрлджбтмсч";
        try {
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("src/laba8/ProgTask3/text.txt"), "UTF-8"));
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("src/laba8/ProgTask3/text2.txt"), "UTF-8"));

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String words[] = s.split(" ");
                int count = 0;
                for (String word : words) {
                    if (consonantsRussian.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
                        bw.write(word + " ");
                        count++;
                    }
                }
                if (count > 0) {
                    bw.write("- " + lineCount + " строка" + " - " + count + " слов");
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
