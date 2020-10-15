package Interface;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aline
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cria um array de objetos do tipo CarbonFootprint
		ArrayList< CarbonFootprint > resultados = new ArrayList<  >();
		
		resultados.add( new Building( 5000.52 ));
		resultados.add( new Car( 3845.25, 10.5 ));
		System.out.println("Dados de cada objeto: ");

                resultados.forEach((currentObject) -> {
                    System.out.printf("\n%s: %s \n%s %s: %.2f\n",
                            "Detalhes sobre ", currentObject.getClass().getName(),
                            currentObject.toString(),
                            "\nCarbon footprint é ", currentObject.getCarbonFootprint());
        });
	}
}
    


    
