package dosw.semana_4.strategyFactoryMethodEjercicio01;

public class Checkout {

    private String country;
    private PaymentStrategy paymentStrategy;

    public Checkout(String country, PaymentStrategy paymentStrategy) {
        this.country = country;
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount){
        paymentStrategy.proccess(amount);
    }
}
