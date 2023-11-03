package Keywords;

public class thiskeyword {
    String name;

    public thiskeyword(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("I am working in the company named as " + this.name);
    }

    public static void main(String[] args) {
        thiskeyword person = new thiskeyword("ABC");
        person.introduce();
    }
}

