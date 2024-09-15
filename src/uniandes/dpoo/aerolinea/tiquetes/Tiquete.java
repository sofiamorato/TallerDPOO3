package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete  {

	public int tarifa;
	private String codigo;
	private boolean usado;
	public Cliente clienteComprador;
	public Vuelo vuelo;

	Tiquete(String codigo, int tarifa, Cliente clienteComprador, Vuelo vuelo){
		this.tarifa = tarifa;
		this.codigo = codigo;
		this.usado = false;
		this.clienteComprador = clienteComprador;
		this.vuelo = vuelo;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}

	public boolean esUsado() {
		return usado;
	}
	public Cliente getCliente(){
		return clienteComprador;	
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public void marcarComoUsado() {
		usado = true;
		
	}
	
	

}
