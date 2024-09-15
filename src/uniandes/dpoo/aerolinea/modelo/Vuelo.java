package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;;

import java.util.HashSet;
import java.util.Collection;

public class Vuelo {
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	public Collection<Tiquete> tiquetes = new HashSet<>();
	
	Vuelo(Ruta ruta, String fecha, Avion avion){
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
	}
	
	public Ruta getRuta() {
		return ruta;
	}
	
	public Avion getAvion() {
		return avion;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public Collection<Tiquete> getTiquetes(){
		return tiquetes;
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		int capacidadAvion = avion.getCapacidad();
		int vuelosVendidos = 0;
		if (cantidad > capacidadAvion) {
			return vuelosVendidos;
		}
		else {
		for (int i=0; i < cantidad; i++) {
			int tarifa = calculadora.calcularTarifa​(this, cliente);
			Tiquete tiquete = GeneradorTiquetes.generarTiquete(this, cliente,tarifa);
			tiquetes.add(tiquete);
			vuelosVendidos++;
			}
		}
		return vuelosVendidos;
			
		}
	
	public boolean equals(Object objeto) {
		if (  objeto.getClass() != getClass() || objeto == null) {
			return false;}
		
		if(this == objeto) {
			return true;}
		
		Vuelo vuelo = (Vuelo) objeto;
		if( ruta.equals(vuelo.ruta) && avion.equals(vuelo.avion) && fecha.equals(vuelo.fecha)) {
			return true;
		}else {
			return false;
		}
	}


}
