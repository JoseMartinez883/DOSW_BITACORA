package dosw.semana_4.strategyChainOfResponsabilityEjercicio09;

import java.util.List;

public class Credentials {
    private final String nameUser;
    private final List<String> permissions;
    private final String typeAuthentication;

    public Credentials(String nameUser, List<String> permissions, String typeAuthentication) {
        this.nameUser = nameUser;
        this.permissions = permissions;
        this.typeAuthentication = typeAuthentication;
    }

    public String getNameUser() {
        return nameUser;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public String getTypeAuthentication() {
        return typeAuthentication;
    }

}