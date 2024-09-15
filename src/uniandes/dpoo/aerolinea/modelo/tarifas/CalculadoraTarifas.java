package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	public final double IMPUESTO = 0.28;
	
	protected int calcularDistanciaVuelo​(Ruta ruta) {
		return Aeropuerto.calcularDistancia(ruta.origen, ruta.destino);
	}
	public int	calcularTarifa​(Vuelo vuelo, Cliente cliente) {
		double porcentaje = calcularPorcentajeDescuento(cliente);
		int costoBase = calcularCostoBase(vuelo,cliente);
		return (int) (costoBase - (costoBase*porcentaje) + calcularValorImpuestos​(costoBase));
	}
	
	protected int calcularValorImpuestos​(int costoBase) {
		return (int)(IMPUESTO*costoBase);
	}
	protected abstract double calcularPorcentajeDescuento​(Cliente cliente);
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	}





	
	
	
	
}
