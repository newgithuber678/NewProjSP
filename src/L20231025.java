public class L20231025 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[ ] pays = generateRandomArray();
        double sum=0;
        System.out.println("Задача 1");
        for(int element : pays)
            sum+=element;
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }

    public static void task2() {
        int[] pays=generateRandomArray();
        int min=pays[0] ,max=pays[0];
        System.out.println("Задача 2");
        for(int element : pays){
            if(element<min)
                min=element;
            if(element>max)
                max=element;
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. " +
                "Максимальная сумма трат за день составила "+max+" рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] pays=generateRandomArray();
        double sred=0;
        for(int element:pays)
            sred+=element;
        sred/= pays.length;
        System.out.println("Средняя сумма трат за месяц составила "+sred+" рублей");
    }

    public static void task4() {
        int i=0;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("Задача 4");
        for (i=reverseFullName.length-1;i>=0;i--)
            System.out.print(reverseFullName[i]);
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
