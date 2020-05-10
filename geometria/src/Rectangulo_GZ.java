/**
 * 
 * @author Gabriela Zavala
 * @version 1.2
 *
 */
public class Rectangulo_GZ extends FiguraGeometrica_GZ {
	private double l1;
	private double l2;
/**
 * 	Explica cu�l es es el lado grande lG y cu�l es el lado peque�o lP. Se ddefinen las variables de cada lado.
 * @param tipoFigura
 * @param lG
 * @param lP
 */
	public Rectangulo_GZ(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
 * Este m�todo calcula el area del rect�ngulo, para ello multiplica sus lados.
 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Para calcular el per�metro multiplica cada lado por 2 y suma la cantidad. Se necsita saber lo que mide cada lado.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
