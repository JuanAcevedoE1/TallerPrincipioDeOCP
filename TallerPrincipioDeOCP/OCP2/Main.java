package TallerPrincipioDeOCP.OCP2;

public class Main {
    public static void main(String[] args) {
        String contenido = "Este es un documento de ejemplo.";

        Documento documentoPDF = new DocumentoPDF();
        documentoPDF.exportar(contenido);

        Documento documentoWord = new DocumentoWord();
        documentoWord.exportar(contenido);

        Documento documentoExcel = new DocumentoExcel();
        documentoExcel.exportar(contenido);
    }
}

