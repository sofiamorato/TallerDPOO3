package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	public List<Tiquete> tiquetesSinUsar = new ArrayList<Tiquete>();
	public List<Tiquete> tiquetesUsados = new ArrayList<Tiquete>();
	
	public Cliente() {
	}
	
	public abstract String getTipoCliente(); 
	
	
	public abstract String getIdentificador(); 
	
	
	public void agregarTiquete(Tiquete tiquetes) {
		tiquetesSinUsar.add(tiquetes);
		
	}
	public int calcularValorTotalClientes() {
		int contador = 0;
		for( Tiquete element : tiquetesUsados) {
			contador = contador + element.getTarifa();}
		for( Tiquete element : tiquetesSinUsar) {
			contador = contador + element.getTarifa();}
		return contador;
	}
	
	public void usarTiquete(Vuelo vuelo) {
		for(Tiquete tiquete: tiquetesSinUsar) {
			if(tiquete.getVuelo().equals(vuelo)) {
				tiquetesUsados.add(tiquete);
				tiquetesSinUsar.remove(tiquete);
			}
		}
	}
	
	

}
