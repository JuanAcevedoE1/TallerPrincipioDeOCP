package TallerPrincipioDeOCP.OCP2;

public class DocumentoPDF extends Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a PDF: " + contenido);
    }
}

