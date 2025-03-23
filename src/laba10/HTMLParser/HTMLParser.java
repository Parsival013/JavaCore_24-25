package laba10.HTMLParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;
public class HTMLParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            StringBuilder output = new StringBuilder();
            for (Element link : links) {
                String absUrl = link.absUrl("href");
                output.append(absUrl).append("\n");
            }
            // Сохранение ссылок в файл
            try (FileWriter writer = new FileWriter("src/lr10/zadanie_HTMLParser/links.txt")) {
                writer.write(output.toString());
                System.out.println("Ссылки сохранены в файл links.txt.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при подключении к сайту: " + e.getMessage());
        }
    }
}
