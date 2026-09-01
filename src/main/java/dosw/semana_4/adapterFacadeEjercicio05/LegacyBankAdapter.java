package dosw.semana_4.adapterFacadeEjercicio05;

public class LegacyBankAdapter implements PaymentProcessor {

    private LegacyBankService legacy;
    private String accountCode;

    public LegacyBankAdapter(LegacyBankService legacy, String accountCode) {
        this.legacy = legacy;
        this.accountCode = accountCode;
    }

    @Override
    public void pay(double amount) {
        int cents = (int) (amount * 100);
        legacy.executeTransaction(accountCode, cents);
    }

    @Override
    public boolean verifyFunds(double amount) {
        int balanceCents = legacy.verifyBalance(accountCode);
        int amountCents = (int) (amount * 100);
        return balanceCents >= amountCents;
    }
}
