public class L20231011 {
    public static void main(String[] args) {
        // задача 1
        boolean clientOS=false;
        System.out.println("Задача 1");
        if(clientOS)
            System.out.println("Установите версию приложения для Android по ссылке");
        else
            System.out.println("Установите версию приложения для iOS по ссылке");
        // задача 2
        int clientDeviceYear=2015;
        System.out.println("Задача 2");
        if(clientDeviceYear<2015 && clientOS)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if(clientDeviceYear<2015 && !clientOS)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if(clientDeviceYear>=2015 && clientOS)
            System.out.println("Установите версию приложения для Android по ссылке");
        if(clientDeviceYear>=2015 && !clientOS)
            System.out.println("Установите версию приложения для iOS по ссылке");
        // задача 3
        int year=2021;
        System.out.println("Задача 3");
        if( year%4==0 && ((year-1584)%100!=0 || (year-1584)%400==0) )
            System.out.println(year+" год является високосным");
        else
            System.out.println(year+" год не является високосным");
        // задача 4
        int deliveryDistance=18;
        System.out.println("Задача 4");
        if(deliveryDistance>=0 && deliveryDistance<=20)
            System.out.println("Потребуется дней: 1");
        if(deliveryDistance>20 && deliveryDistance<=60)
            System.out.println("Потребуется дней: 2");
        if(deliveryDistance>60 && deliveryDistance<=100)
            System.out.println("Потребуется дней: 3");
        if(deliveryDistance>100)
            System.out.println("Доставка не выполняется");
        // задача 5
        byte monthNumber=12;
        System.out.println("Задача 5");
        if(monthNumber>=1 && monthNumber<=12) {
            System.out.print(monthNumber + "-й месяц принадлежит сезону ");
            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println("зима");
                    break;
                case 3, 4, 5:
                    System.out.println("весна");
                    break;
                case 6, 7, 8:
                    System.out.println("лето");
                    break;
                case 9, 10, 11:
                    System.out.println("весна");
                    break;
            }
        }
    }
}
