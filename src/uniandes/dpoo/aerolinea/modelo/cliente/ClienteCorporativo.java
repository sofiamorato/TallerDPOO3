package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
    // TODO completar
	public final String CORPORATIVO = "Corporativo";
	public final int GRANDE = 1;
	public final int MEDIANA = 2;
	public final int PEQUENA = 3;
	private String nombreEmpresa;
	private int tamanoEmpresa;
	
	ClienteCorporativo(String nombreEmpresa, int tamanoEmpresa){
		this.nombreEmpresa = nombreEmpresa;
		this.tamanoEmpresa = tamanoEmpresa;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public int getTamanoEmpresa() {
		if(tamanoEmpresa == GRANDE) {
			return GRANDE;
		}else if (tamanoEmpresa == MEDIANA) {
			return MEDIANA;
		}else {
			return PEQUENA;
		}
	}
	
    


    /**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }

	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return CORPORATIVO;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return nombreEmpresa + "-" + tamanoEmpresa;
	}
}
