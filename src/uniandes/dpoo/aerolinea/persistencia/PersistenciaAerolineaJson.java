package uniandes.dpoo.aerolinea.persistencia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

import org.json.JSONArray;
import org.json.JSONObject;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteTiqueteException;
import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.exceptions.AeropuertoDuplicadoException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public class PersistenciaAerolineaJson implements iPersistenciaAerolinea {
	
	
	@Override
	public void salvarTiquetes(String archivo, Aerolinea aerolinea) throws IOException {
		// TODO Auto-generated method stub
		JSONObject jobject = new JSONObject( );
        salvarAviones( aerolinea, jobject );
        salvarAeropuertos( aerolinea, jobject );
        salvarRutas( aerolinea, jobject );
        salvarVuelos( aerolinea, jobject );

        // Escribir la estructura JSON en un archivo
        PrintWriter pw = new PrintWriter( archivo );
        jobject.write( pw, 2, 0 );
        pw.close( );
		
	}

	private void salvarVuelos(Aerolinea aerolinea, JSONObject jobject) {
		// TODO Auto-generated method stub
		
	}

	private void salvarRutas(Aerolinea aerolinea, JSONObject jobject) {
		// TODO Auto-generated method stub
		
	}

	private void salvarAeropuertos(Aerolinea aerolinea, JSONObject jobject) {
		// TODO Auto-generated method stub
		
	}

	private void salvarAviones(Aerolinea aerolinea, JSONObject jobject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cargarAerolinea(String archivo, Aerolinea aerolinea)
			throws IOException, InformacionInconsistenteException {
		// TODO Auto-generated method stub
		String jsonCompleto = new String( Files.readAllBytes( new File( archivo ).toPath( ) ) );
        JSONObject raiz = new JSONObject( jsonCompleto );

        cargarAviones( aerolinea, raiz.getJSONArray( "aviones" ) );
        cargarAeropuertos( aerolinea, raiz.getJSONArray( "aeropuertos" ) );
        cargarRutas( aerolinea, raiz.getJSONArray( "rutas" ) );
        cargarVuelos( aerolinea, raiz.getJSONArray( "vuelos" ) );
    
    }

	private void cargarRutas(Aerolinea aerolinea, JSONArray jRutas) 
	{
		// TODO Auto-generated method stub
		int numRutas = jRutas.length( );
		for( int i = 0; i < numRutas; i++ ) {
			
		}
		
	}

	private void cargarAeropuertos(Aerolinea aerolinea, JSONArray jAeropuertos) throws AeropuertoDuplicadoException {
		// TODO Auto-generated method stub
		int numAeropuertos = jAeropuertos.length( );
		for( int i = 0; i < numAeropuertos; i++ ) {
			
		}
	}

	private void cargarVuelos(Aerolinea aerolinea, JSONArray jVuelos) throws VueloSobrevendidoException{
		// TODO Auto-generated method stub
		int numVuelos = jVuelos.length( );
		for( int i = 0; i < numVuelos; i++ ) {
			
		}
	}

	private void cargarAviones(Aerolinea aerolinea, JSONArray jAviones) {
		// TODO Auto-generated method stub
		int numAviones = jAviones.length( );
	}

		
	

}
