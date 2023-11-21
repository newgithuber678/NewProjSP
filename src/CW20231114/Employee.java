package CW20231114;

public class Employee {
    private String name;
    private String surname;
    private String otchestvo;
    private int otdel;
    private int earnMoney;
    public static int counterId = 1;
    private int id;

    public Employee(String name, String surname, String otchestvo, int otdel, int earnMoney) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.otdel = otdel;
        this.earnMoney = earnMoney;
        this.id = counterId;
        counterId++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public int getOtdel() {
        return otdel;
    }

    public int getEarnMoney() {
        return earnMoney;
    }

    public int getId() {
        return id;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setEarnMoney(int earnMoney) {
        this.earnMoney = earnMoney;
    }

    @Override
    public String toString() {
        return id + ". " + surname + " " + name + " " + otchestvo + " Отдел " + otdel + " з/п " + earnMoney;
    }
}
