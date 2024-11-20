package TallerPrincipioDeOCP.OCP3;

public class Main {
    public static void main(String[] args) {
        String mensaje = "Esto es un mensaje de prueba.";

        // Enviar correo electrónico
        Mensajero mensajeroEmail = new MensajeroEmail();
        mensajeroEmail.enviar(mensaje);

        // Enviar SMS
        Mensajero mensajeroSMS = new MensajeroSMS();
        mensajeroSMS.enviar(mensaje);

        // Enviar notificación push
        Mensajero mensajeroPush = new MensajeroPush();
        mensajeroPush.enviar(mensaje);
    }
}