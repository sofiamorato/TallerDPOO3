package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	public Aeropuerto origen;
	public Aeropuerto destino;
	private String horaSalida;
	private String horaLlegada;
	private String codigoRuta;

	Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLlegada, String codigoRuta){
		this.origen = origen;
		this.destino = destino;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
	
	}

	/**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

	public String getHoraSalida() {
		return horaSalida;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}
	
	public Aeropuerto geOrigen() {
		return origen;
	}
	
	public Aeropuerto geDestino() {
		return destino;
	}

	public String getCodigoRuta() {
		return codigoRuta;
	}
	
	public int Duracion() {
		int salidaMinutos = getMinutos(this.horaLlegada);
		int salidaHoras = getHoras(this.horaLlegada)/60;
		int llegadaMinutos = getMinutos(this.horaLlegada);
		int llegadaHoras = getHoras(this.horaLlegada)/60;
		
		int salida = salidaMinutos + salidaHoras;
		int llegada = llegadaMinutos + llegadaHoras;
		
		int duracionHoras = Math.floorDiv((llegada - salida),60);
		int duracionMinutos = (llegada - salida) - duracionHoras*60;
		int duracionTotal = duracionHoras*100 + duracionMinutos;
		
		return duracionTotal;
		
	}
	

    
}
