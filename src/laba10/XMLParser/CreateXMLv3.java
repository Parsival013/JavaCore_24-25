package laba10.XMLParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import java.io.File;

public class CreateXMLv3 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();


            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("tasks");
            doc.appendChild(rootElement);

            Element task1 = doc.createElement("task");
            rootElement.appendChild(task1);

            Element task_Name1 = doc.createElement("task_Name");
            task_Name1.appendChild(doc.createTextNode("Тест"));
            task1.appendChild(task_Name1);

            Element task_Description1 = doc.createElement("task_Description");
            task_Description1.appendChild(doc.createTextNode("Пройти тестирование"));
            task1.appendChild(task_Description1);

            Element status1 = doc.createElement("status");
            status1.appendChild(doc.createTextNode("Завершено"));
            task1.appendChild(status1);

            // Добавление второй книги
            Element task2 = doc.createElement("task");
            rootElement.appendChild(task1);

            Element task_Name2 = doc.createElement("task_Name");
            task_Name2.appendChild(doc.createTextNode("Лекции"));
            task2.appendChild(task_Name2);

            Element task_Description2 = doc.createElement("task_Description");
            task_Description2.appendChild(doc.createTextNode("Посетить 3 лекции"));
            task2.appendChild(task_Description2);

            Element status2 = doc.createElement("status");
            status2.appendChild(doc.createTextNode("В процессе"));
            task2.appendChild(status2);

            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();

            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");

            javax.xml.transform.dom.DOMSource source = new DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("src/laba10/XMLParser/zadanie2_2.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception pce){
            pce.printStackTrace();
        }
    }
}
