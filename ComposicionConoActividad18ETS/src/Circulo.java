

// TODO: Auto-generated Javadoc
/**
 * La Clase Circulo.
 */
public class Circulo {
//	 Atributos
 	/** La x e y. */
 	private float x, y;
	 
 	/** El radio. */
 	private float radio;

	 /**
 	 * Constructor que inicializa un objeto de la clase Circulo a partir de los parámetros.
 	 *
 	 * @param x coordenada x del centro del circulo a crear
 	 * @param y coordenada y del centro del circulo a crear
 	 * @param radio del circulo a crear
 	 */
 	public Circulo (float x, float y, float radio) { // constructor
	 this.x = x;
	 this.y = y;
	 this.radio = radio;
	 }
	 
 	/**
 	 * Gets de la x.
 	 *
 	 * @return la x
 	 */
 	public float getX() { return this.x; }
	 
 	/**
 	 * Sets de la x.
 	 *
 	 * @param x la nueva x
 	 */
 	public void setX(float x) { this.x = x; }
	 
 	/**
 	 * Gets la y.
 	 *
 	 * @return la y
 	 */
 	public float getY() { return this.y; }
	 
 	/**
 	 * Sets la y.
 	 *
 	 * @param y la nueva y
 	 */
 	public void setY(float y) { this.y = y; }
	 
 	/**
 	 * Gets el radio.
 	 *
 	 * @return el radio
 	 */
 	public float getRadio() { return this.radio; }
	 
 	/**
 	 * Sets el radio.
 	 *
 	 * @param radio el nuevo radio
 	 */
 	public void setRadio(float radio) { this.radio = radio; }
	 
 	/**
 	 * Area.
 	 *
 	 * @return el float del area
 	 */
 	public float area() { return (float)Math.PI*this.radio*this.radio; }

	 /**
 	 * Imprimir.: imprime x, y, radio y area del mismo cono
 	 */
 	public void imprimir () {
	 System.out.print(" x=" + this.x);
	 System.out.print(" y=" + this.y);
	 System.out.print(" r=" + this.radio);
	 System.out.print(" A=" + this.area());
	 }
	} 