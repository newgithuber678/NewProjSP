public class L20231002 {
    public static void main(String[] args) {
        // задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);
        // задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2");
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);
        System.out.println("Можно ли использовать оператор \"+=\" в будущих задачах?");
        // задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3");
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);
        // задача 4
        var friend=19;
        System.out.println("Задача 4");
        System.out.println("friend = "+friend);
        friend = friend + 2;
        System.out.println("friend = "+friend);
        friend = friend / 7;
        System.out.println("friend = "+friend);
        // задача 5
        var frog=3.5;
        System.out.println("Задача 5");
        System.out.println("frog = "+frog);
        frog = frog * 10;
        System.out.println("frog = "+frog);
        frog = frog / 3.5;
        System.out.println("frog = "+frog);
        frog = frog + 4;
        System.out.println("frog = "+frog);
        // задача 6
        var massOfBoxer1=78.2;
        var massOfBoxer2=82.7;
        System.out.println("Задача 6");
        System.out.println("Total mass = "+(massOfBoxer1+massOfBoxer2));
        System.out.println("Difference in mass = "+(massOfBoxer2-massOfBoxer1));
        // задача 7
        System.out.println("Задача 7");
        System.out.println("Mass2 - Mass1 = "+(massOfBoxer2-massOfBoxer1));
        System.out.println("Mass2 % Mass1 = "+(massOfBoxer2%massOfBoxer1));
        // задача 8
        var kolvoChasovObshhee=640;
        var kolvoChasovNaSotr=8;
        System.out.println("Задача 8");
        System.out.println("Всего работников в компании — "+(kolvoChasovObshhee/kolvoChasovNaSotr)+" человек");
        System.out.println("Если в компании работает "+(kolvoChasovObshhee/kolvoChasovNaSotr + 94)+" человек, то" +
                " всего "+(kolvoChasovObshhee/ (kolvoChasovObshhee/kolvoChasovNaSotr+94) )+" часов работы может быть поделено между сотрудниками");
    }
}
