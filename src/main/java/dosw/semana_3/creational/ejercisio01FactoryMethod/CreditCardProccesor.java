package dosw.semana_3.creational.ejercisio01FactoryMethod;

public class CreditCardProccesor extends PaymentProcessor{
    @Override
    protected Payment createPayment() {
        return new CreditCardPayment();
    }
}
