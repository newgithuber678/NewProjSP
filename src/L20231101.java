import java.time.LocalDate;

public class L20231101 {
    public static void main(String[] args) {
        // задача 1
        int year=2021;
        System.out.println("Задача 1");
        checkYearVisokosnost(year);
        System.out.println();
        // задача 2
        boolean clientOS=false;
        int currentYear= LocalDate.now().getYear();
        System.out.println("Задача 2");
        suggestAppVersion(currentYear, clientOS);
        System.out.println();
        // задача 3
        int deliveryDistance=18;
        System.out.println("Задача 3");
        calcDelivTime(deliveryDistance);
        System.out.println();
    }
    public static void checkYearVisokosnost(int year){
        if( year%4==0 && ((year-1584)%100!=0 || (year-1584)%400==0) )
            System.out.println(year+" год является високосным");
        else
            System.out.println(year+" год не является високосным");
    }
    public static void suggestAppVersion(int clientDeviceYear, boolean clientOS){
        if(clientDeviceYear<2015 && clientOS)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else if(clientDeviceYear<2015 && !clientOS)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if(clientDeviceYear>=2015 && clientOS)
            System.out.println("Установите версию приложения для Android по ссылке");
        else if(clientDeviceYear>=2015 && !clientOS)
            System.out.println("Установите версию приложения для iOS по ссылке");
    }
    public static void calcDelivTime(int deliveryDistance){
        if(deliveryDistance>=0 && deliveryDistance<=20)
            System.out.println("Потребуется дней: 1");
        if(deliveryDistance>20 && deliveryDistance<=60)
            System.out.println("Потребуется дней: 2");
        if(deliveryDistance>60 && deliveryDistance<=100)
            System.out.println("Потребуется дней: 3");
        if(deliveryDistance>100)
            System.out.println("Доставка не выполняется");
    }
}
