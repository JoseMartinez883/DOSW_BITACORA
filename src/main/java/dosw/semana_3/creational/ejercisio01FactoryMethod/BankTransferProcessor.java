package dosw.semana_3.creational.ejercisio01FactoryMethod;

public class BankTransferProcessor extends PaymentProcessor{
    @Override
    protected Payment createPayment() {
        return new BankTransferPayment();
    }
}
