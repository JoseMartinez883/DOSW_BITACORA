package dosw.semana_4.strategyChainOfResponsabilityEjercicio09;

import java.util.List;

public class Main {

    public static void main(String[] args){
        CredentialValidator credentialValidator = new CredentialValidator();
        PermissionValidator permissionValidator = new PermissionValidator();
        LocationValidator locationValidator = new LocationValidator();
        TimeValidator timeValidator = new TimeValidator();

        credentialValidator.setNext(permissionValidator);
        permissionValidator.setNext(locationValidator);
        locationValidator.setNext(timeValidator);

        //------------------------------------------------------------------
        Credentials credentials = new Credentials("Jose", List.of("administrator"), "google");

        AuthtService authtService = new AuthtService(new GoogleStrategy());
        AuthResult authResult = authtService.authentication(credentials);
        credentialValidator.handleAcces(authResult);

        authtService.setAuthStrategy(new BiometricStrategy());
        AuthResult authResult1 = authtService.authentication(credentials);
        credentialValidator.handleAcces(authResult1);
    }
}
