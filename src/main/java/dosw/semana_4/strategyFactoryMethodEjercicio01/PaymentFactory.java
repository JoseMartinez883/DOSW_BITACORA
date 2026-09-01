package dosw.semana_4.strategyFactoryMethodEjercicio01;

public interface PaymentFactory {

    PaymentStrategy create(String type);
}
