package L20231211;

public class Car extends MotorTransport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void service(){
        updateTyre();
        checkEngine();
    }
}
