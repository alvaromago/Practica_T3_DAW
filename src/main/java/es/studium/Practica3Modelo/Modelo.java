package es.studium.Practica3Modelo;

import java.util.ArrayList;

public class Modelo {
	Modelo() {
		
	}

	public ArrayList<String> quitarEspacios(ArrayList<String> frases) {
		ArrayList<String> resultado = new ArrayList<>();
		for(int i = 0; i < frases.size(); i++) {
			String fraseOriginal = frases.get(i);
			String fraseFinal = fraseOriginal.trim();
			fraseFinal = fraseOriginal.replace(" ", "");
			resultado.add(i, fraseFinal);
		}
		return resultado;
	}
}
