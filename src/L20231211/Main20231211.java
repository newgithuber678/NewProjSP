package L20231211;

public class Main20231211 {
    public static void main(String[] args) {
        ServiceStation serviceStation=new ServiceStation();
        Truck maz=new Truck("MAZ", 8);
        Car car=new Car("vaz",4);
        Bicycle bicycle=new Bicycle("bmx",2);
        serviceStation.service(maz);
        serviceStation.service(car);
        serviceStation.service(bicycle);
    }
    }
