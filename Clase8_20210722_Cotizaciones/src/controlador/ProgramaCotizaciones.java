package controlador;

import java.util.ArrayList;

import modelo.Cotizacion;
import modelo.Descuento;
import modelo.Impuesto;
import modelo.Producto;
import vista.MenuPrincipal;

public class ProgramaCotizaciones {
	private ArrayList<Cotizacion> cotizaciones;
	private ArrayList<Producto> productos;
	private ArrayList<Impuesto> impuestos;
	private ArrayList<Descuento> descuentos;
	private MenuPrincipal vista;
	
	public ProgramaCotizaciones() {
		cotizaciones = new ArrayList<Cotizacion>();
		productos = new ArrayList<Producto>();
		impuestos = new ArrayList<Impuesto>();
		descuentos = new ArrayList<Descuento>();
		vista = new MenuPrincipal(this);
		vista.mostrarMenu();
	}
	
	public static void main(String[] args) {
		new ProgramaCotizaciones();
	}
	
	public ArrayList<Descuento> obtenerDescuentos(){
		return descuentos;
	}
	
	public void agregarDescuento(String pNombre, double pPorcentaje) {
		Descuento nuevoDescuento = new Descuento(pNombre, pPorcentaje);
		descuentos.add(nuevoDescuento);
	}
	
	public void eliminarDescuento(Descuento descuentoBorrar) {
		descuentos.remove(descuentoBorrar);
	}	
}