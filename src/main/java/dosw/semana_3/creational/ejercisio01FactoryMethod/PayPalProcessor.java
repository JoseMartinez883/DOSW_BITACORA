package dosw.semana_3.creational.ejercisio01FactoryMethod;

public class PayPalProcessor extends PaymentProcessor{
    @Override
    protected Payment createPayment() {
        return new PaypalPayment();
    }
}
