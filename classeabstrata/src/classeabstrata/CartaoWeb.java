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
public abstract class CartaoWeb {
    protected String destinatario;

    public CartaoWeb(String destinatario){
        this.destinatario = destinatario;
    }
    public String getDestinatario(){
        return destinatario;
    }
    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    public abstract void retornarMensagem();

    public void retornarMensagem(String remetente, String Destinatario){
    }

    public CartaoWeb(){
    }

    

}
