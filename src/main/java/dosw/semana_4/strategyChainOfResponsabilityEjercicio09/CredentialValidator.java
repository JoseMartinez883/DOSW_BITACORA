package dosw.semana_4.strategyChainOfResponsabilityEjercicio09;

import java.nio.file.AccessDeniedException;

public class CredentialValidator implements HandlerAcces{

    private HandlerAcces nextValidatorAcces;

    @Override
    public void setNext(HandlerAcces handlerAcces) {
        nextValidatorAcces = handlerAcces;
    }

    @Override
    public void handleAcces(AuthResult authResult){
        try {
            if(authResult.isPass()){
                if(nextValidatorAcces != null) nextValidatorAcces.handleAcces(authResult);
            } else throw new AccessDeniedException("hola");
        } catch (AccessDeniedException a){
            System.out.println("Tus credenciales no son validas");
        }
    }

}
