package TallerPrincipioDeOCP.OCP3;

public class MensajeroPush extends Mensajero {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
    }
}