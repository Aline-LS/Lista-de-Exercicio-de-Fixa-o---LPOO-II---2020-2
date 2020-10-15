package Interface;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aline
 */
public class Building implements CarbonFootprint {
	
    private double mediaMensalKwh; //consumação mensal de energia por hora
    private final int meses = 12;
    

    public Building( double consumoMensal ) {
        mediaMensalKwh = consumoMensal;
    }

    public void setMediaMensalKwh( double consumoMensal ) {
        mediaMensalKwh = consumoMensal;
    }

    public double getMediaMensalKwh() {
        return mediaMensalKwh;
    }
    

    
    @Override 
    public String toString() {
        return String.format("%s: %.2f", "Consumação mensal é ", getMediaMensalKwh() );
    }
    
    @Override
    public double getCarbonFootprint() {
        return getMediaMensalKwh() * meses;
    }
}
    

