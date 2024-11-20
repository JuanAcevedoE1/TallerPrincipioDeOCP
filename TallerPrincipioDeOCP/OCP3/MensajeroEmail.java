package TallerPrincipioDeOCP.OCP3;

public class MensajeroEmail extends Mensajero {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
}
