package dosw.semana_4.strategyChainOfResponsabilityEjercicio09;

public class AuthtService {

    private AuthStrategy authStrategy;

    public AuthtService(AuthStrategy authStrategy) {
        this.authStrategy = authStrategy;
    }

    public void setAuthStrategy(AuthStrategy authStrategy) {
        this.authStrategy = authStrategy;
    }

    public AuthResult authentication(Credentials c){
        return authStrategy.authenticate(c);
    }


}
