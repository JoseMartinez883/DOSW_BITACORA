package dosw.semana_4.strategyChainOfResponsabilityEjercicio09;

import java.nio.file.AccessDeniedException;
import java.time.LocalDateTime;

public class TimeValidator implements HandlerAcces{

    private HandlerAcces nextValidatorAcces;

    @Override
    public void setNext(HandlerAcces handlerAcces) {
        nextValidatorAcces = handlerAcces;
    }

    @Override
    public void handleAcces(AuthResult authResult) {
        try {
            if(!authResult.getLocalDate().isAfter(LocalDateTime.now())){
                if(nextValidatorAcces != null) nextValidatorAcces.handleAcces(authResult);
                System.out.println("Entrando a la plataforma .....");
            } else throw new AccessDeniedException("hola");
        } catch (AccessDeniedException a){
            System.out.println("Tus tiempo de login no es valida");
        }
    }
}
