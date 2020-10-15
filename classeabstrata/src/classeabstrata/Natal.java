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
public class Natal extends CartaoWeb {
    private String destinatario;
    private String remetente;


    public  Natal(String destinatario, String remetente){
    this.destinatario = destinatario;
    this.remetente = remetente;
    }
    
    public String Natal(){
        return destinatario;
    }

    @Override
    public void retornarMensagem(String rementente, String destinatario) {
    }
    
    @Override
    public void retornarMensagem() {
        System.out.println( destinatario + ",\n"
                + "Feliz Dia Natal!\n"
                + "Espero que se lembre do significado dessa data e saiba que ainda teremos muitos natais juntos! De todo meu coração, "+remetente+"\n");
    }
    

        
}

