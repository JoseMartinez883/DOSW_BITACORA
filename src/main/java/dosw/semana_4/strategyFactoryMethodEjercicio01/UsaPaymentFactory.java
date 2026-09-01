package dosw.semana_4.strategyFactoryMethodEjercicio01;

public class UsaPaymentFactory implements PaymentFactory{
    @Override
    public PaymentStrategy create(String type) {
        PaymentStrategy paymentStrategy = null;

        if(type.equalsIgnoreCase("stripe")){
            paymentStrategy = new StripeStrategy();
        } else if (type.equalsIgnoreCase("paypal")){
            paymentStrategy = new PayPalStrategy();
        }

        return paymentStrategy;
    }
}
