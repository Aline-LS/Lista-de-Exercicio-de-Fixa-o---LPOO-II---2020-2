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
public class Aniversario extends CartaoWeb {
    private String destinatario;
    private String remetente;



    public Aniversario(String destinatario, String remetente){
    this.destinatario = destinatario;
    this.remetente = remetente;
    }
    
    public String Aniversario(){
        return destinatario;
    }
    
    @Override
    public void retornarMensagem(String rementente, String destinatario) {
    }
     
    @Override
    public void retornarMensagem() {
        System.out.println("Parabén " + destinatario + ",\n"
                + "Feliz Aniversário!\n"
                + "Te desejo tudo de bom e muito mais, "+remetente+"\n");
    }

}
