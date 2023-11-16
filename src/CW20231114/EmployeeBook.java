package CW20231114;

public class EmployeeBook {
    private Employee[] spisok = new Employee[10];

    public void printAllEmployees(Employee[] spisok) {
        for (var element : spisok) {
            if (element == null) continue;
            System.out.println(element.toString());
        }
    }

    public void calculateAllEarnMoneysPerMonth(Employee[] spisok) {
        double sum = 0;
        for (var element : spisok) {
            if (element == null) continue;
            sum += element.getEarnMoney();
        }
        System.out.println("Затраты на зарплату в месяц: " + sum);
    }

    public void findMinEarnMoney(Employee[] spisok) {
        int minEarnMoney = 0, idMin = 0;
        boolean start = false;
        for (var element : spisok) {
            if (element == null) continue;
            if (!start || element.getEarnMoney() < minEarnMoney) {
                minEarnMoney = element.getEarnMoney();
                idMin = element.getId();
                if (!start) start = true;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " +
                (spisok != null ? spisok[idMin - 1].getSurname() + " " + spisok[idMin - 1].getName() +
                        " " + spisok[idMin - 1].getOtchestvo() : ""));
    }

    public void findMaxEarnMoney(Employee[] spisok) {
        int maxEarnMoney = 0, idMax = 1;
        boolean start = false;
        for (var element : spisok) {
            if (element == null) continue;
            if (!start || element.getEarnMoney() > maxEarnMoney) {
                maxEarnMoney = element.getEarnMoney();
                idMax = element.getId();
                if (!start) start = true;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " +
                (spisok != null ? spisok[idMax - 1].getSurname() + " " + spisok[idMax - 1].getName() +
                        " " + spisok[idMax - 1].getOtchestvo() : ""));
    }

    public void calculateAverageEarnMoney(Employee[] spisok) {
        double sum = 0;
        int numberOfElements = 0;
        for (var element : spisok) {
            if (element == null) continue;
            sum += element.getEarnMoney();
            numberOfElements++;
        }
        System.out.println("Средняя зарплата: " + (spisok != null ? sum / numberOfElements : ""));
    }

    public void printAllFIOs(Employee[] spisok) {
        for (var element : spisok) {
            if (element == null) continue;
            System.out.println(element.getSurname() + " " + element.getName() + " " + element.getOtchestvo());
        }
    }

    public void indexEarnMoneys(Employee[] spisok, int interest) {
        for (var element : spisok) {
            if (element == null) continue;
            element.setEarnMoney(element.getEarnMoney() + element.getEarnMoney() * interest / 100);
        }
    }

    //часть 2

    public void selectOtdel(Employee[] spisok, int otdel, Employee[] temp) { // выделить сотрудников отдела
        int employeesAmountInOtdel = 0;
        for (var element : spisok) {
            if (element == null) continue;
            if (element.getOtdel() == otdel) {
                temp[employeesAmountInOtdel] = element;
                employeesAmountInOtdel++;
            }
        }
    }

    public void calculateAllEarnMoneysPerMonthInOtdel(Employee[] spisok, int otdel) {
        Employee[] temp = new Employee[spisok.length];
        selectOtdel(spisok, otdel, temp);
        calculateAllEarnMoneysPerMonth(temp);
    }

    public void findMinEarnMoneyInOtdel(Employee[] spisok, int otdel) {
        Employee[] temp = new Employee[spisok.length];
        selectOtdel(spisok, otdel, temp);
        findMinEarnMoney(temp);
    }

    public void findMaxEarnMoneyInOtdel(Employee[] spisok, int otdel) {
        Employee[] temp = new Employee[spisok.length];
        selectOtdel(spisok, otdel, temp);
        findMaxEarnMoney(temp);
    }

    public void calculateAverageEarnMoneyInOtdel(Employee[] spisok, int otdel) {
        Employee[] temp = new Employee[spisok.length];
        selectOtdel(spisok, otdel, temp);
        calculateAverageEarnMoney(temp);
    }

    public void printAllFIOsInOtdel(Employee[] spisok, int otdel) {
        Employee[] temp = new Employee[spisok.length];
        selectOtdel(spisok, otdel, temp);
        printAllFIOs(temp);
    }

    public void indexEarnMoneysInOtdel(Employee[] spisok, int interest, int otdel) {
        Employee[] temp = new Employee[1];
        for (var element : spisok) {
            if (element == null) continue;
            if (element.getOtdel() == otdel) {
                temp[0] = element;
                indexEarnMoneys(temp, interest);
                element = temp[0];
            }
        }
    }

    public void printEmployeesWithEarnMoney(Employee[] spisok, boolean less0More1, int thanThisNumber) {
        for (var element : spisok) {
            if (element == null) continue;
            if (less0More1) {
                if (element.getEarnMoney() >= thanThisNumber) {
                    System.out.println(element.toString().replaceFirst(" Отдел [0-9]", ""));
                }
            } else if (element.getEarnMoney() < thanThisNumber) {
                System.out.println(element.toString().replaceFirst(" Отдел [0-9]", ""));
            }
        }
    }

    //часть 3

    public void addEmployee(String surname, String name, String otchestvo, int otdel, int earnMoney) {
        boolean foundEmptyPlace = false;
        int i = 0;
        for (i = 0; i < spisok.length; i++) {
            if (spisok[i] == null) {
                //если в ячейке вообще ничего нет
                foundEmptyPlace = true;
                break;
            } else if (spisok[i].getSurname().isEmpty() && spisok[i].getName().isEmpty()) {
                //если фамилия и имя содержат пустые символы
                foundEmptyPlace = true;
                break;
            }
        }
        if (foundEmptyPlace) {
            spisok[i] = new Employee(name, surname, otchestvo, otdel, earnMoney);
        } else {
            System.out.println("Невозможно добавить сотрудника " + surname + " " + name + " " + otchestvo + ", список сотрудников заполнен");
        }
    }

    public void deleteEmployee(String surname, String name, String otchestvo, int id) {
        boolean foundEmployee = false;
        for (int i = 0; i < spisok.length; i++) {
            if (spisok[i] == null) continue;
            if ((spisok[i].getSurname().equals(surname) && spisok[i].getName().equals(name) &&
                    spisok[i].getOtchestvo().equals(otchestvo)) || spisok[i].getId() == id) {
                //если совпадают Ф.И.О. или id
                foundEmployee = true;
                spisok[i] = null;
                break;
            }
        }
        if (!foundEmployee) {
            System.out.println("Сотрудник не найден");
        }
    }

    public void setEarnMoney(String surname, String name, String otchestvo, int newEarnMoney) {
        boolean foundEmployee = false;
        for (int i = 0; i < spisok.length; i++) {
            if (spisok[i] == null) continue;
            if (spisok[i].getSurname().equals(surname) && spisok[i].getName().equals(name) &&
                    spisok[i].getOtchestvo().equals(otchestvo)) {
                //если совпадают Ф.И.О. или id
                foundEmployee = true;
                spisok[i].setEarnMoney(newEarnMoney);
                break;
            }
        }
        if (!foundEmployee) {
            System.out.println("Сотрудник не найден");
        }
    }

    public void setOtdel(String surname, String name, String otchestvo, int newOtdel) {
        boolean foundEmployee = false;
        for (int i = 0; i < spisok.length; i++) {
            if (spisok[i] == null) continue;
            if (spisok[i].getSurname().equals(surname) && spisok[i].getName().equals(name) &&
                    spisok[i].getOtchestvo().equals(otchestvo)) {
                //если совпадают Ф.И.О. или id
                foundEmployee = true;
                spisok[i].setOtdel(newOtdel);
                break;
            }
        }
        if (!foundEmployee) {
            System.out.println("Сотрудник не найден");
        }
    }

    public void printAllOtdels() {
        for (int otdel = 1; otdel <= 5; otdel++) {
            System.out.println("Отдел " + otdel);
            for (int i = 0; i < spisok.length; i++) {
                if (spisok[i] == null) continue;
                if(spisok[i].getOtdel()==otdel)
                    System.out.println(spisok[i].getSurname()+" "+spisok[i].getName()+" "+spisok[i].getOtchestvo());

            }
        }

    }
}
