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
        int people=12000000;
        int kolvoRozhd=0, kolvoSmer=0;
        System.out.println("Задача 3");
        i=0;
        while (i<10){
            kolvoRozhd=people/1000*17;
            kolvoSmer=people/1000*8;
            people=people+kolvoRozhd-kolvoSmer;
            i++;
            System.out.println("Год "+i+", численность населения составляет "+people);
        }
        // задача 4
        int sum=15000;
        months=0;
        System.out.println("Задача 4");
        while (sum<12000000){
            sum=sum+(sum/100*7);
            months++;
            System.out.println("Месяц "+months+", сумма накоплений равна "+sum+" рублей");
        }
        // задача 5
        sum=15000;
        months=0;
        System.out.println("Задача 5");
        while (sum<12000000){
            sum=sum+(sum/100*7);
            months++;
            if(months%6==0)
                System.out.println("Месяц "+months+", сумма накоплений равна "+sum+" рублей");
        }
        // задача 6
        sum=15000;
        System.out.println("Задача 6");
        for (months=1;months<12*9;months++){
            sum=sum+(sum/100*7);
            if(months%6==0)
                System.out.println("Месяц "+months+", сумма накоплений равна "+sum+" рублей");
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
