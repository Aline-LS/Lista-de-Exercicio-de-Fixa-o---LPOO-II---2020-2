
package classeabstrata;

/**
 *
 * @author Aline
 */
public class Classeabstrata {
    public static void main(String[] args) {
    
    for(int cont=0; cont<=5; cont++){    
    DiaDosNamorados namorado = new DiaDosNamorados("Destinatario", "Remetente");
    namorado.retornarMensagem();
    Natal natal = new Natal("Destinatario", "Remetente");
    natal.retornarMensagem();
    Aniversario niver = new Aniversario("Destinatario", "Remetente");
    niver.retornarMensagem();
    }
    
    }
    
}
