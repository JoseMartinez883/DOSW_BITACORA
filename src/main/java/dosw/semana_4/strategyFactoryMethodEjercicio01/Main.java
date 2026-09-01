package dosw.semana_4.strategyFactoryMethodEjercicio01;

public class Main {

    public static void main(String[] args){

        PaymentFactory paymentFactory = new ColombiaPaymentFactory();
        PaymentFactory paymentFactory1 = new UsaPaymentFactory();

        Checkout checkout = new Checkout("colombia",paymentFactory.create("nequi"));
        checkout.pay(50);

    }
}
