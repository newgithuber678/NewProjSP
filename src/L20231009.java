public class L20231009 {
    public static void main(String[] args) {
        // задача 1
        int age=16;
        System.out.println("Задача 1");
        System.out.print("Если возраст человека равен "+age+", то ");
        if(age>=18)
            System.out.println("он совершеннолетний");
        else
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        // задача 2
        int temperature=2;
        System.out.println("Задача 2");
        System.out.print("На улице "+temperature+" градусов, ");
        if(temperature>6)
            System.out.println("можно идти без шапки");
        else
            System.out.println("нужно надеть шапку");
        // задача 3
        int speed=59;
        System.out.println("Задача 3");
        System.out.print("Если скорость "+speed+", то ");
        if(speed>60)
            System.out.println("придется заплатить штраф");
        else
            System.out.println("можно ездить спокойно");
        // задача 4
        System.out.println("Задача 4");
        System.out.print("Если возраст человека равен "+age+", то ему нужно ходить ");
        if(age>=2 && age<=6)
            System.out.println("в детский сад");
        else if(age>=7 && age<=17)
            System.out.println("в школу");
        else if(age>=18 && age<=24)
            System.out.println("в университет");
        else if(age>24)
            System.out.println("на работу");
        // задача 5
        System.out.println("Задача 5");
        System.out.print("Если возраст ребенка равен "+age+", то ему ");
        if(age<=5)
            System.out.println("нельзя кататься на аттракционе");
        else if(age>5 && age<=14)
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        else if(age>14)
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        // задача 6
        System.out.println("Задача 6");
        byte kolvoSeatMest=60;
        byte kolvoStandMest=18;
        if(kolvoSeatMest+kolvoStandMest<102) {
            if (kolvoSeatMest < 60)
                System.out.println("Есть сидячее место");
            else
                System.out.println("Есть стоячее место");
        }
        else
            System.out.println("Вагон полностью забит");
        // задача 7
        System.out.println("Задача 7");
        int one=16;
        int two=32;
        int three=48;
        System.out.print("Самое большее число - ");
        if(one>=two && one>=three)
            System.out.println(one);
        else if(two>=one && two>=three)
            System.out.println(two);
        else
            System.out.println(three);
    }
}
