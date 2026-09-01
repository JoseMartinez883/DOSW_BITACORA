package dosw.semana_4.observerFactoryMethodEjercicio02;


public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Notificaciones Multicanal ---");

        Order order = new Order();

        // Suscribimos los canales que el usuario tiene activos
        order.suscribe(new EmailNotifier());
        order.suscribe(new SmsNotifier());
        order.suscribe(new PushNotifier());

        System.out.println("\nCambiando estado a: pendiente");
        order.setStateOrder(StateOrder.ENVIADO);

        System.out.println("\nCambiando estado a: enviado");
        order.setStateOrder(StateOrder.ENVIADO);

        System.out.println("\nCambiando estado a: entregado");
        order.setStateOrder(StateOrder.ENVIADO);
    }
}
