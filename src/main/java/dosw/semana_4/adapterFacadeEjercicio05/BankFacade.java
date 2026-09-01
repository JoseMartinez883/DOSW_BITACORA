package dosw.semana_4.adapterFacadeEjercicio05;

public class BankFacade {

    private LegacyBankService legacyService;
    private LegacyBankAdapter adapter;

    public BankFacade() {
        this.legacyService = new LegacyBankService();
        this.adapter = new LegacyBankAdapter(legacyService, "ACC-001");
    }

    public void procesarPago(double monto) {
        System.out.println("\n--- Iniciando proceso de pago: $" + monto + " ---");

        // 8 pasos de inicializacion que el desarrollador no necesita conocer
        legacyService.openConnection();
        legacyService.startSession("SES-" + System.currentTimeMillis());
        legacyService.setTransactionContext("PAYMENT");
        legacyService.configureEncryption("AES-256");

        // Verificar fondos usando el Adapter
        if (adapter.verifyFunds(monto)) {
            System.out.println("Fondos verificados - suficiente saldo");
            adapter.pay(monto);
            System.out.println("Pago realizado exitosamente");
        } else {
            System.out.println("Fondos insuficientes - pago rechazado");
        }

        // Cerrar todo
        legacyService.closeSession();
        legacyService.closeConnection();
        System.out.println("--- Proceso finalizado ---");
    }
}
