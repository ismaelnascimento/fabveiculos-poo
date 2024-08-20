package br.edu.principal;

import br.edu.veiculos.*;

public class Principal {

	public static void main(String[] args) {
		Jipe c1 = new Jipe();
		c1.buzinar();
		CarroDePasseio c2 = new CarroDePasseio();
		c2.buzinar();
		Utilitario c3 = new Utilitario();
		c3.buzinar();
	}

}
