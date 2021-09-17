package modelo;

import java.util.ArrayList;

public class Producto {
	private String nombre;
	private double valorUnitario;
	private ArrayList<Impuesto> impuestos;
	
	public Producto(String pNombre, double pValorUnitario) {
		nombre = pNombre;
		valorUnitario = pValorUnitario;
		impuestos = new ArrayList<Impuesto>();
	}
	
	public String obtenerNombre(){
		return nombre;
	}
	public double obtenerValor(){
		return valorUnitario;
	}
	public ArrayList<Impuesto> obtenerImpuestos(){
		return impuestos;
	}
	
	public void agregarImpuesto(Impuesto nuevoImpuesto) {
		impuestos.add(nuevoImpuesto);
	}
}