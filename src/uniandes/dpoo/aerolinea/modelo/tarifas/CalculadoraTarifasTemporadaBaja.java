package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	protected int	COSTO_POR_KM_CORPORATIVO = 900;
	protected int	COSTO_POR_KM_NATURAL = 600;
	protected double	DESCUENTO_GRANDES = 0.2;
	protected double	DESCUENTO_MEDIANAS = 0.1;
	protected double	DESCUENTO_PEQ = 0.02;
	
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		if(cliente.getTipoCliente().equals("Natural")) {
			return COSTO_POR_KM_NATURAL*calcularDistanciaVuelo​(vuelo.getRuta());
		}
		return COSTO_POR_KM_CORPORATIVO*calcularDistanciaVuelo​(vuelo.getRuta());
	}
	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		// TODO Auto-generated method stub
		double porcentaje = 0.0;
		if (cliente.getTipoCliente().equals( "Corporativo")) {
		}
			ClienteCorporativo clienteCorporativo;
			int tamanio = clienteCorporativo.getTamanoEmpresa();
			if (tamanio == 3) {
				porcentaje = DESCUENTO_PEQ;
			}else if(tamanio == 2) {
				porcentaje = DESCUENTO_MEDIANAS;
			}else if(tamanio == 1) {
				porcentaje = DESCUENTO_GRANDES;}
			return porcentaje;
			
			
	
}}
