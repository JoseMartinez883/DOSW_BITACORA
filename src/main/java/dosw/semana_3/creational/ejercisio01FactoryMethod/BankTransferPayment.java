package dosw.semana_3.creational.ejercisio01FactoryMethod;

public class BankTransferPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Procesando monto de $" + amount + " con banco transferencia");
    }
}
