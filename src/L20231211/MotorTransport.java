package L20231211;

public abstract class MotorTransport extends WheeledTransport{
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine(){
        System.out.println("Обслуживаем двигатель!");
    }
}
