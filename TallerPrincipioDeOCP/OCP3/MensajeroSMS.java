package TallerPrincipioDeOCP.OCP3;

public class MensajeroSMS extends Mensajero {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}