package L20231211;

public class ServiceStation {
    public void service(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем транспорт: " + transport.getModelName());
            transport.service();
        }
    }
}
