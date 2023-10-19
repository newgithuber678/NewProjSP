public class L20231018 {
    public static void main(String[] args) {
        // задача 1
        byte months=0;
        int vklad=15000;
        double nakopleniya=0;
        System.out.println("Задача 1");
        while (nakopleniya<2459000){
            nakopleniya+=vklad;
            nakopleniya*=1.01;
            months++;
            System.out.println("Месяц "+months+", сумма накоплений равна "+nakopleniya+" рублей");
        }
        // задача 2
        int i=0;
        System.out.println("Задача 2");
        while (i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for(;i>0;i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        // задача 3
        double people=12000000;
        int spRozhd=17000, spSmer=8000;
        System.out.println("Задача 3");
        i=0;
        while (i<10){
            people+=spRozhd;
            people-=spSmer;
            i++;
            System.out.println("Год "+i+", численность населения составляет "+people);
        }
        // задача 4
        nakopleniya=15000;
        months=0;
        System.out.println("Задача 4");
        while (nakopleniya<12000000){
            nakopleniya*=1.07;
            months++;
            System.out.println("Месяц "+months+", сумма накоплений равна "+nakopleniya+" рублей");
        }
        // задача 5
        nakopleniya=15000;
        months=0;
        System.out.println("Задача 5");
        while (nakopleniya<12000000){
            nakopleniya*=1.1449; // за 2 месяца
            nakopleniya*=1.1449;
            nakopleniya*=1.1449;
            months+=6;
            System.out.println("Месяц "+months+", сумма накоплений равна "+nakopleniya+" рублей");
        }
        // задача 6
        nakopleniya=15000;
        i=0;
        System.out.println("Задача 6");
        while (i<18){
            nakopleniya*=1.1449; // за 2 месяца
            nakopleniya*=1.1449;
            nakopleniya*=1.1449;
            i++;
            System.out.println("Полугодие "+i+", сумма накоплений равна "+nakopleniya+" рублей");
        }
        // задача 7
        int date=6;
        System.out.println("Задача 7");
        while (date<=31){
            System.out.println("Сегодня пятница, "+date+"-е число. Необходимо подготовить отчет");
            date+=7;
        }
        // задача 8
        int year=2023;
        System.out.println("Задача 8");
        if((year-200)%79!=0)
            date=year-200 + 79-((year-200)%79);
        else
            date=year-200;
        while(date<=year+100){
            System.out.println(date);
            date+=79;
        }
    }
}
