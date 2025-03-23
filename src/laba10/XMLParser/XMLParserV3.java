package laba10.XMLParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XMLParserV3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            File inputFile = new File("src/laba10/XMLParser/zadanie2_2.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("Хотите внести данные новой задачи? (y/n)");
            String yOrN = in.next();
            in.nextLine();

            if (yOrN.equals("y")){

                AddTask(in, doc);
            }

            System.out.println("Хотите выполнить поиск задачи? (y/n)");
            yOrN = in.next();
            in.nextLine();

            if (yOrN.equals("y")){

                SearchTasks(in, doc);
            }

            System.out.println("Хотите удалить задачу? (y/n)");
            yOrN = in.next();
            in.nextLine();

            if (yOrN.equals("y")){

                DeleteTask(in, doc);
            }

            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("task");
            for(int i = 0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());

                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Название задачи: " +
                            element.getElementsByTagName("task_Name").item(0).getTextContent());
                    System.out.println("описание: " +
                            element.getElementsByTagName("task_Description").item(0).getTextContent());
                    System.out.println("Статус: " +
                            element.getElementsByTagName("status").item(0).getTextContent());
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void AddTask(Scanner in, Document _doc) throws TransformerException {
        Element rootElement = _doc.getDocumentElement();

        System.out.println("Введите название задачи:");
        in.nextLine();
        String taskName = in.nextLine();
        System.out.println("Введите описание задачи:");
        String taskDescription = in.nextLine();
        System.out.println("Введите статус:");
        String status = in.nextLine();

        Element employee = _doc.createElement("employee");
        rootElement.appendChild(employee);

        Element task_Name = _doc.createElement("task_Name");
        task_Name.appendChild(_doc.createTextNode(taskName));
        employee.appendChild(task_Name);

        Element task_Description = _doc.createElement("task_Description");
        task_Description.appendChild(_doc.createTextNode(taskDescription));
        employee.appendChild(task_Description);

        Element status1 = _doc.createElement("status");
        status1.appendChild(_doc.createTextNode(status));
        employee.appendChild(status1);

        SaveDoc(_doc);

        System.out.println("Сотрудник добавлен!");
    }

    private static void SaveDoc(Document doc) throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("src/laba10/XMLParser/zadanie2_2.xml"));
        transformer.transform(source, result);
    }

    private static void SearchTasks(Scanner in, Document doc) throws Exception {
        System.out.println("Найти по названию - 1\nНайти по статусу - 2");
        int searchMethod = in.nextInt();
        in.nextLine();

        NodeList taskList = doc.getElementsByTagName("task");
        String searchValue = "";

        if (searchMethod == 1) {
            System.out.println("Введите название задачи: ");
            searchValue = in.nextLine();
        } else if (searchMethod == 2) {
            System.out.println("Введите статус: ");
            searchValue = in.nextLine();
        } else {
            System.out.println("Некоррекнтый выбор");
        }

        List<Element> foundTasks = new ArrayList<>();
        for(int i = 0; i < taskList.getLength(); i++){
            Element employee = (Element) taskList.item(i);
            String currentValue;
            if (searchMethod == 1){
                currentValue = employee.getElementsByTagName("task_Name").item(0).getTextContent();
            } else {
                currentValue = employee.getElementsByTagName("status").item(0).getTextContent();
            }

            if(currentValue.equalsIgnoreCase(searchValue)){
                foundTasks.add(employee);
            }
        }

        if (foundTasks.isEmpty()){
            System.out.println("Задачи не найдены");
        } else {
            System.out.println("Найденные задачи: ");
            for (Element task : foundTasks){
                String task_Name = task.getElementsByTagName("task_Name").item(0).getTextContent();
                String task_Description = task.getElementsByTagName("task_Description").item(0).getTextContent();
                String status1 = task.getElementsByTagName("status").item(0).getTextContent();
                System.out.printf("ФИО: %s, Дата рождения: %s, Должность: %s\n", task_Name, task_Description, status1);
            }
        }
    }

    public static void DeleteTask(Scanner in, Document doc){
        NodeList taskList = doc.getElementsByTagName("task");
        System.out.println("Введите задачу для удаления: ");
        String employeeToDelete = in.nextLine();


        for(int i = 0; i < taskList.getLength(); i++){
            Element task = (Element) taskList.item(i);
            String task_Name = task.getElementsByTagName("task_Name").item(0).getTextContent();

            if(task_Name.equals(employeeToDelete)){
                Node parentNode = task.getParentNode();
                parentNode.removeChild(task);

                break;
            }
        }
    }
}
