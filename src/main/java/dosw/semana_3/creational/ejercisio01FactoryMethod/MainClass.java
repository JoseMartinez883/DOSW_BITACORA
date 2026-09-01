package dosw.semana_3.creational.ejercisio01FactoryMethod;

public class MainClass {

    public static void main(String[] args){

        PaymentProcessor processor;

        processor = new CreditCardProccesor();
        processor.proccessPayment(100);

        processor = new PayPalProcessor();
        processor.proccessPayment(250);

        processor = new BankTransferProcessor();
        processor.proccessPayment(500);
    }
}
