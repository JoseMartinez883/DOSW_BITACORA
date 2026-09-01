package dosw.semana_4.strategyObserverEjercicio06;

public class NotificationService implements PreferenceObserver {

    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("\n[Notifications] Enviando notificaciones actualizadas a " + user.getName());
        System.out.println("    -> Nuevas recomendaciones disponibles segun tus preferencias!");
    }
}
