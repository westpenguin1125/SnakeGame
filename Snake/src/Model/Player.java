package Model;

import java.util.ArrayList;
import java.util.List;

/*
 * 2 maneras de implementarlo:
 * 	1. Snake compuesto por cuadrados. Cuando crece se le añade un cuadrado a la cola
 * 	2. No está dividido, es un todo. Para girar se tienen en cuenta las coordenadas de giro o algo?
 * 
 * -> Procedo a utilizar la primera implementación
 * Esta implementación puede derivar en mecanicas curiosas, como que cada cuadrado de la serpiente se comporte 
 * de forma distinta. Rollo dispara proyectiles a los lados, o es traspasable y no tiene colisión... etc.
 */

public class Player {
	private static final int CUBOS_INI = 5;
	
	List<CuboCuerpo> cuerpo;
	
	
	public Player(int cubosIni) {
		
		cuerpo = new ArrayList<>();
		for (int i = 0; i < cubosIni; i++) {
			cuerpo.add(new CuboNormal(0, 0));
		}
	}
	
	public Player() {
		new Player(CUBOS_INI); //not sure
	}
	
	
	
}
