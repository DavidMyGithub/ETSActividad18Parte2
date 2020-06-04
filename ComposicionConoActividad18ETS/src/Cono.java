

// TODO: Auto-generated Javadoc
/**
 * La clase Cono.
 */
public class Cono {
//	Atributos
	/** La base. */
	private Circulo base;
	 
 	/** La altura. */
 	private float altura;
	 
 	/** Elcolor. */
 	private String color;
	
	 /**
 	 * Constructor que crea e inicializa un objeto de la clase Cono a partir de los parámetros..
 	 *
 	 * @param x es la coordenada x del centro del cono a crear
 	 * @param y es la coordenada y del centro del cono a crear
 	 * @param radio es el radio del cono a crear
 	 * @param altura es la altura del cono a crear
 	 * @param color es el color del cono a crear
 	 */
 	public Cono (float x, float y, float radio, float altura, String color) { // constructor
	 this.base = new Circulo(x, y, radio);
	 this.altura = altura;
	 this.color = color;
	 }
	 
 	/**
 	 * Get de la base
 	 *
 	 * @return la base
 	 */
 	public Circulo getBase() {
	 return this.base;
	 }
	 
 	/**
 	 * Sets de la base.
 	 *
 	 * @param base la nueva base
 	 */
 	public void setBase(Circulo base) {
	 this.base = base;
	 }
	 
 	/**
 	 * Gets de la altura.
 	 *
 	 * @return la altura
 	 */
 	public float getAltura() {
	 return this.altura;
	 }
	 
 	/**
 	 * Sets de la altura.
 	 *
 	 * @param altura la nueva altura
 	 */
 	public void setAltura(float altura) {
	 this.altura = altura;
	 }
	 
 	/**
 	 * Gets del color.
 	 *
 	 * @return el color
 	 */
 	public String getColor() {
	 return this.color;
	 }
	 
 	/**
 	 * Sets del color.
 	 *
 	 * @param color el nuevo color
 	 */
 	public void setColor(String color) {
	 this.color = color;
	 }
	 
 	/**
 	 * Imprimir.; imprime la la altura y el color
 	 */
 	public void imprimir () {
	 this.base.imprimir();
	 System.out.println(" h=" + this.altura + " c=" + this.color);
	 }
	}
	
