public class L20231016 {
    public static void main(String[] args) {
        // задача 1
        System.out.println("Задача 1");
        for(int i=1;i<=10;i++)
            System.out.print(i+" ");
        System.out.print("\n");
        // задача 2
        System.out.println("Задача 2");
        for(int i=10;i>=1;i--)
            System.out.print(i+" ");
        System.out.print("\n");
        // задача 3
        System.out.println("Задача 3");
        for(int i=0;i<=17;i+=2)
            System.out.print(i+" ");
        System.out.print("\n");
        // задача 4
        System.out.println("Задача 4");
        for(int i=10;i>=-10;i--)
            System.out.print(i+" ");
        System.out.print("\n");
        // задача 5
        System.out.println("Задача 5");
        for(int i=1904;i<=2096;i+=4)
            System.out.println(i+" год является високосным");
        // задача 6
        System.out.println("Задача 6");
        for(int i=7;i<=98;i+=7)
            System.out.print(i+" ");
        System.out.print("\n");
        // задача 7
        System.out.println("Задача 7");
        for(int i=1;i<=512;i*=2)
            System.out.print(i+" ");
        System.out.print("\n");
        // задача 8
        int vklad=29000;
        double nakopleniya=0;
        System.out.println("Задача 8");
        for(int i=1;i<=12;i++) {
            nakopleniya+=vklad;
            System.out.println("Месяц "+i+", сумма накоплений равна "+nakopleniya+" рублей");
        }
        // задача 9
        nakopleniya=0;
        System.out.println("Задача 9");
        for(int i=1;i<=12;i++) {
            nakopleniya+=vklad;
            nakopleniya*=1.01;
            System.out.println("Месяц "+i+", сумма накоплений равна "+nakopleniya+" рублей");
        }
        // задача 10
        System.out.println("Задача 10");
        for(int i=1;i<=10;i++)
            System.out.println("2 * "+i+" = "+i*2);
    }
}
