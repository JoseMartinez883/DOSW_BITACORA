package dosw.semana_4.adapterFacadeEjercicio05;

public class LegacyBankService {

    private boolean connected = false;
    private boolean sessionActive = false;

    public void openConnection() {
        connected = true;
        System.out.println("[Legacy] Conexion abierta con el banco");
    }

    public void startSession(String sessionId) {
        sessionActive = true;
        System.out.println("[Legacy] Sesion iniciada: " + sessionId);
    }

    public void setTransactionContext(String context) {
        System.out.println("[Legacy] Contexto de transaccion: " + context);
    }

    public void configureEncryption(String algorithm) {
        System.out.println("[Legacy] Encriptacion configurada: " + algorithm);
    }

    public int verifyBalance(String accountCode) {
        System.out.println("[Legacy] Verificando balance de cuenta: " + accountCode);
        return 500000; // centavos
    }

    public void executeTransaction(String accountCode, int amountInCents) {
        if (!connected || !sessionActive) {
            throw new RuntimeException("Conexion o sesion no iniciada");
        }
        System.out.println("[Legacy] Transaccion ejecutada: " + amountInCents + " centavos en cuenta " + accountCode);
    }

    public void closeSession() {
        sessionActive = false;
        System.out.println("[Legacy] Sesion cerrada");
    }

    public void closeConnection() {
        connected = false;
        System.out.println("[Legacy] Conexion cerrada");
    }
}
