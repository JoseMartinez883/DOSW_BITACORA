package dosw.semana_3.creational.ejercisio01FactoryMethod;

public abstract class PaymentProcessor {

    protected abstract Payment createPayment();

    public void proccessPayment(double amount){
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
