package dosw.semana_4.adapterFacadeEjercicio05;

public interface PaymentProcessor {

    void pay(double amount);
    boolean verifyFunds(double amount);
}
