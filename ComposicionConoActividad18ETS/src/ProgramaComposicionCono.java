//Comentario solo para prueba de actualizacion a github

// TODO: Auto-generated Javadoc
/**
 * The Class ProgramaComposicionCono.
 */
public class ProgramaComposicionCono {
	
	/**
	 * Imprimir.: no hace nada porque no se llama al procedimiento en ningun momento
	 *
	 * @param datos the datos
	 */
	private static void imprimir (Object datos) {
	 System.out.println(datos);
	}
	
	/**
	 * El método principal: imprime 5 conos generados con radios aleatorios
	 *
	 * @param args the arguments
	 */
	public static void main (String[] args) {
		java.util.Random aleatorio = new java.util.Random();
		for (int i=1; i<=5; i++) {
			int radio = aleatorio.nextInt(9)+1;
			Cono cono = new Cono(0, 0, radio, i, "Azul");
			cono.imprimir();
		}
	}
} 