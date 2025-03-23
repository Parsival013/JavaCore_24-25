package laba10.Exam4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class NewParser {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > tr:nth-child(3) > table > tbody > " +
                            "tr > tr:nth-child(1)");

            if (newsParent.isEmpty()) {
                System.out.println("Не найден родительский элемент новостей.");
                return;
            }

            List<Node> nodes = newsParent.get(0).childNodes();

            for (int i = 3; i < nodes.size() && i < 20; i++) { // Проверка на размер nodes
                if (i % 2 != 0) {
                    Node node = nodes.get(i);
                    if (node instanceof Element) {
                        Element element = (Element) node;

                        Elements titleElements = element.getElementsByClass("blocktitle");
                        Elements dateElements = element.getElementsByClass("blockdate");

                        if (!titleElements.isEmpty() && !dateElements.isEmpty()) {
                            String title = titleElements.get(0).text();
                            String date = dateElements.get(0).text();
                            System.out.println("Тема: " + title);
                            System.out.println("Дата: " + date + "\n");
                        } else {
                            System.out.println("Элемент " + i + " не содержит заголовка или даты.");
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
