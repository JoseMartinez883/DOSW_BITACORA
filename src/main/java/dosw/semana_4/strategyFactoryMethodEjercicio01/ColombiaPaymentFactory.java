package dosw.semana_4.strategyFactoryMethodEjercicio01;

public class ColombiaPaymentFactory implements PaymentFactory{
    @Override
    public PaymentStrategy create(String type) {
        PaymentStrategy paymentStrategy = null;

        if(type.equalsIgnoreCase("nequi")){
            paymentStrategy = new NequiStrategy();
        } else {
            paymentStrategy = new PseStrategy();
        }

        return paymentStrategy;
    }
}
