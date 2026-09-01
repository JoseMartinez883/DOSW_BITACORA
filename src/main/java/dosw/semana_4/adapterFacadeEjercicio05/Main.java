package dosw.semana_4.adapterFacadeEjercicio05;

public class Main {

    public static void main(String[] args) {

        // El desarrollador solo usa la Facade — no conoce los detalles del banco legacy
        BankFacade bankFacade = new BankFacade();

        bankFacade.procesarPago(1500.00);
        bankFacade.procesarPago(7500.00);
    }
}
