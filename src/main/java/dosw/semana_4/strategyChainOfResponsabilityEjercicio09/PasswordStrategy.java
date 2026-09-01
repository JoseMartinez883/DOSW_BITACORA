package dosw.semana_4.strategyChainOfResponsabilityEjercicio09;

public class PasswordStrategy implements AuthStrategy{

    @Override
    public AuthResult authenticate(Credentials c) {
        AuthResult authResult = new AuthResult(false,"Invalid Credentials",c.getPermissions(),"Colombia");

        if(c.getTypeAuthentication().equalsIgnoreCase("password")){
            authResult = new AuthResult(true,"Valid Credentials",c.getPermissions(),"Colombia");
        }

        return authResult;
    }
}
