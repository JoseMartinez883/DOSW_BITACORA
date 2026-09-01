package dosw.semana_4.strategyChainOfResponsabilityEjercicio09;

import java.time.LocalDateTime;
import java.util.List;

public class AuthResult {

    private final boolean pass;
    private final String message;
    private final List<String> permissions;
    private final String location;
    private final LocalDateTime localDate;

    public AuthResult(boolean pass, String message,List<String> permissions, String location) {
        this.pass = pass;
        this.message = message;
        this.permissions = permissions;
        this.location = location;
        this.localDate = LocalDateTime.now();
    }

    public boolean isPass() {
        return pass;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getLocalDate() {
        return localDate;
    }


}
