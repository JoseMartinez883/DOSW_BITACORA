package dosw.semana_4.strategyChainOfResponsabilityEjercicio09;

import java.nio.file.AccessDeniedException;

public class PermissionValidator implements HandlerAcces{

    private HandlerAcces nextValidatorAcces;

    @Override
    public void setNext(HandlerAcces handlerAcces) {
        nextValidatorAcces = handlerAcces;
    }

    @Override
    public void handleAcces(AuthResult authResult){
        try {
            if(!authResult.getPermissions().isEmpty()){
                if(nextValidatorAcces != null) nextValidatorAcces.handleAcces(authResult);
            } else throw new AccessDeniedException("hola");
        } catch (AccessDeniedException a){
            System.out.println("Tus permisos no son validos");
        }
    }
}
