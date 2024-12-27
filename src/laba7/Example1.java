package laba7;

class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "[Text] " + this.text;
    }
}

class Supertext extends Text {
    private String text;

    public Supertext(String text) {
        super("?");
        this.text = text;
    }

    public Supertext(String suptext, String subtext) {
        super(subtext);
        this.text = suptext;
    }

    @Override
    public String toString() {
        return "[Supertext] " + this.text + ", " + super.toString();
    }
}

public class Example1 {
    private static Supertext text1 = new Supertext("Anemone");
    private static Supertext text2 = new Supertext("Rose", "Amor");

    public static void main(String[] args) {
        System.out.println(text1);
        System.out.println(text2);
    }
}

