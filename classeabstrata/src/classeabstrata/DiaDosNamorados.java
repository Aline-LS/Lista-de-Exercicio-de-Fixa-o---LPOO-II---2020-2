/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeabstrata;

/**
 *
 * @author Aline
 */
public class DiaDosNamorados extends CartaoWeb {

    private String destinatario;
    private String remetente;

    public DiaDosNamorados(String destinatario, String remetente) {
        this.destinatario = destinatario;
        this.remetente = remetente;
    }

    public String DiaDosNamorados() {
        return destinatario;
    }

    @Override
    public void retornarMensagem(String rementente, String destinatario) {
    }

    @Override
    public void retornarMensagem() {
        System.out.println(destinatario + ",\n"
                + "Feliz Dia dos Namorados!\n"
                + "Te amo, espero passar uma vida inteira com você! De todo meu coração, "+remetente+"\n");
    }

}