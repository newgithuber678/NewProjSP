package L20231211;

public class Bicycle extends WheeledTransport{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(){
        updateTyre();
    }
}
