package dosw.semana_4.strategyFactoryMethodEjercicio01;

public class PseStrategy implements PaymentStrategy{

    @Override
    public void proccess(double amount) {
        System.out.println("Pagando por pse");
    }
}
