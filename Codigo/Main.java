import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;
import clases.Triangulo;

/**
 * Esta clase proporciona la entrada de la aplicación y en ella se
 * crean varias figuras de las cuales se mostrará su área
 *
 * 
 * @version 0.0.1, 31/01/2022
 * @author Programador
 *
 * <br><br>
 * Se importan las clases:
 * @see Circulo
 * @see Figura
 * @see Rectangulo
 * @see Triangulo
 */
public class Main {

    /**
     * Este método es la entrada a la aplicación
     * Se instancian y se muestra por terminal las áreas calculadas 
     * de las figuras: Circulo, Rectangulo y Triangulo
     *
     * @param args argumentos de inicio de aplicación
     */
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        circulo.setRadio(44.55);
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        triangulo.setBase(50);
        triangulo.setAltura(60);
        
        System.out.println("Area del circulo "+calcularArea(circulo));
        System.out.println("Area del rectangulo "+calcularArea(rectangulo));
        System.out.println("Area del Triangulo "+calcularArea(triangulo));
       }
    

    /**
     * Este método realiza la llamada al método calcularArea de cada
     * figura.
     *
     * @param f una figura
     * @return double el área de la figura calculada
     */
    public static double calcularArea(Figura f){ // Ejemplo de uso de polimorfismo
        
        return f.CalcularArea();
    }
}
