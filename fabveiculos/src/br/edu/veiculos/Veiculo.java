package br.edu.veiculos;

public class Veiculo {
    protected String marca;
    protected double capacidadeTanque;
    
    public void buzinar() {
    	System.out.println("PI BI! saiii do mei! A");
    }
    public void acelerar() {
    	capacidadeTanque = capacidadeTanque - 20;
    }
    public void freiar() {
    	
    }
    
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
}
