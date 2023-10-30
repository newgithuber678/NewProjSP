public class L20231030 {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String lastName="Ivanov", firstName="Ivan", middleName="Ivanovich";
        String fullName=lastName+' '+firstName+' '+middleName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);
    }
    public static void task2() {
        System.out.println("Задача 2");
        String fullName="Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName="Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+
                (fullName.replace('ё','е')).replace('Ё','Е'));
    }
}