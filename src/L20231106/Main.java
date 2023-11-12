package L20231106;

public class Main {
    public static void main(String[] args) {
        Author a1=new Author("a1", "a2");
        Author a2=new Author("a3", "a4");
        Book book1=new Book("title1", 1000, a1);
        Book book2=new Book("title2", 2000, a2);

        book1.setYear(2023);
    }
}
