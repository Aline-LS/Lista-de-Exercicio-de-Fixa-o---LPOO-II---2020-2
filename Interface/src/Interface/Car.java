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
import Interface.CarbonFootprint;


public class Car implements CarbonFootprint {

	private double milhasAnuais; //milhas anuais
	private double mediaMPG; //media de milhas por galão
	private final int kgCO2PorMilha = 9; //kilogramas de dioxido de carbono por milha

	
	public Car( double milhas, double MPG ) {
		milhasAnuais = milhas;
		mediaMPG = MPG;
	}

	public void setMilhasAnuais( double milhas ) {
		milhasAnuais = milhas;
	}

	
	public void setMediaMPG( double MPG ) {
		mediaMPG = MPG;
	}

	
	public double getMilhasAnuais() {
		return milhasAnuais;
	}

	
	public double getMediaMPG() {
		return mediaMPG;
	}

	
	@Override
	public String toString() {
		return String.format( "%s: %.2f \n%s: %.2f ",
				"Media anual de milhas ", getMilhasAnuais(),
				"Media MPG é ", getMediaMPG() );
	}

	
        @Override
	public double getCarbonFootprint() {
		return (( getMilhasAnuais() * getMediaMPG() ) * kgCO2PorMilha );
	}
}
