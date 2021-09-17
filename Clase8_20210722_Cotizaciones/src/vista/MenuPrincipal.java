package vista;

import java.util.ArrayList;
import java.util.Scanner;

import controlador.ProgramaCotizaciones;
import modelo.Descuento;

public class MenuPrincipal {
	public static final int CREAR_COTIZACION = 1;
	public static final String CREAR_COTIZACION_TEXTO = "1. Crear cotizacion";
	
	public static final int BUSCAR_COTIZACION = 2;
	public static final String BUSCAR_COTIZACION_TEXTO = "2. Buscar cotización";
	
	public static final int VER_DESCUENTOS = 3;
	public static final String VER_DESCUENTOS_TEXTO = "3. Ver descuentos";
	
	public static final int AGREGAR_DESCUENTO = 4;
	public static final String AGREGAR_DESCUENTO_TEXTO = "4. Agregar descuento";
	
	public static final int ELIMINAR_DESCUENTO = 5;
	public static final String ELIMINAR_DESCUENTO_TEXTO = "5. Borrar descuento";
	
	public static final int ACTUALIZAR_DESCUENTO = 6;
	public static final String ACTUALIZAR_DESCUENTO_TEXTO = "6. Actualizar descuento";
	
	public static final int VER_IMPUESTOS = 7;
	public static final int CREAR_IMPUESTO = 8;
	public static final int VER_PRODUCTOS = 9;
	public static final int AGREGAR_PRODUCTOS = 10;
	public static final int TERMINAR = 11;

	// Atributos
	private ProgramaCotizaciones controlador;
	
	// Constructor
	
	public MenuPrincipal(ProgramaCotizaciones pControlador) {
		controlador = pControlador;
	}
	
	// Métodos
	
	public void mostrarMenu() {
		int accion = 0;
		Scanner in = new Scanner(System.in);
		
		while(accion!=TERMINAR) {
			System.out.println(CREAR_COTIZACION_TEXTO);
			System.out.println(BUSCAR_COTIZACION_TEXTO);
			System.out.println(VER_DESCUENTOS_TEXTO);
			System.out.println(AGREGAR_DESCUENTO_TEXTO);
			System.out.println(ELIMINAR_DESCUENTO_TEXTO);
			System.out.println(ACTUALIZAR_DESCUENTO_TEXTO);
			
			accion = in.nextInt();
			System.out.println("-----");
			switch (accion) {
			case VER_DESCUENTOS:
				verDescuentos();
				break;
			case AGREGAR_DESCUENTO:
				agregarDescuento();
				break;
			case ELIMINAR_DESCUENTO:
				eliminarDescuento();
				break;
			case ACTUALIZAR_DESCUENTO:
				actualizarDescuento();
				break;
			case TERMINAR:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
			System.out.println("-----");
		}
	}
	
	public void verDescuentos(){
		ArrayList<Descuento> descuentos = controlador.obtenerDescuentos();
		for (int i = 0; i < descuentos.size(); i++) {
			Descuento actual = descuentos.get(i);
			System.out.println(i+". "+actual.obtenerNombre() + " - " + actual.obtenerPorcentaje() + "%");
		}
	}
	
	public void agregarDescuento() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa el nombre del descuento");
		String nombre = in.next();
		System.out.println("Ingresa el porcentaje del descuento");
		double porcentaje = in.nextDouble();
		controlador.agregarDescuento(nombre, porcentaje);
	}
	
	
	public void eliminarDescuento() {
		// Mostrar el listado de descuentos
		verDescuentos();
		System.out.println("Ingresa el número del descuento a eliminar");
		Scanner in = new Scanner(System.in);
		int pos = in.nextInt();
		ArrayList<Descuento> descuentos = controlador.obtenerDescuentos();
		Descuento descuentoBorrar = descuentos.get(pos);
		controlador.eliminarDescuento(descuentoBorrar);
	}
	
	public void actualizarDescuento() {
		
		String a = "aaaaa";
		if(a.equals("aaaaa")) {
			
		}
		
		// Mostrar el listado de descuentos
		verDescuentos();
		System.out.println("Ingresa el número del descuento a actualizar");
		Scanner in = new Scanner(System.in);
		int pos = in.nextInt();
		ArrayList<Descuento> descuentos = controlador.obtenerDescuentos();
		Descuento descuentoActualizar = descuentos.get(pos);
		
		System.out.println("Ingresa el nuevo nombre del descuento");
		String nombre = in.next();
		descuentoActualizar.actualizarNombre(nombre);
		
		System.out.println("Ingresa el nuevo porcentaje del descuento");
		double porcentaje = in.nextDouble();
		descuentoActualizar.actualizarPorcentaje(porcentaje);
		
	}
}
