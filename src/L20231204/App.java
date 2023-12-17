package L20231204;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Gryffindor harry = new Gryffindor("Harry Potter", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Gryffindor hermiona = new Gryffindor("Hermiona", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Slytherin drako=new Slytherin("Drako",random.nextInt(101),random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        harry.compareHogwarts(drako);
        System.out.println(harry);
        System.out.println(hermiona);
        harry.compare(hermiona);

        Hogwarts dambdore=new Hogwarts("Albys",random.nextInt(101),random.nextInt(101));
        dambdore.compareHogwarts(harry);
    }
}
