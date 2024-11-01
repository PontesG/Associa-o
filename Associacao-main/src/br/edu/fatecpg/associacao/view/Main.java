package br.edu.fatecpg.associacao.view;

import br.edu.fatecpg.associacao.model.Empresa;

public class Main {
	
	public static void main (String[] args) {
		
		Empresa myEmpresa = new Empresa("Minha Empresa");
		myEmpresa.addFunc(0, "João", "Desenvolvedor", 5000.00);
		myEmpresa.addFunc(1, "Maria", "Designer", 4500.00);
		myEmpresa.calcFolhaSalarial();

		
	}

}
