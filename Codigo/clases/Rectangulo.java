package clases;

/**
 * Clase Rectangulo
 *
 * Esta clase modela la figura de un rectángulo
 * Hereda de la clase Figura
 *
 * @version 0.0.1 31/01/2022
 * @author Programador
 * @see Figura
 */
public class Rectangulo extends Figura{

   /**
    * Base del rectangulo
    */ 
    private double base;

   /**
    * Altura del rectangulo
    */ 
    private double altura;

   /**
    * Este método calcula el area del rectangulo
    * @return area
    */ 
    public double CalcularArea() {        
        return this.area=(base*altura);
     }

   /**
    * Devuelve el valor de base (getter)
    * @return base
    */ 
    public double getBase() {
        return base;
    }

   /**
    * Configura el valor de base (setter)
    * @param base
    */ 
    public void setBase(double base) {
        this.base = base;
    }

   /**
    * Devuelve el valor de altura (getter)
    * @return altura
    */
    public double getAltura() {
        return altura;
    }

   /**
    * Configura el valor de altura (setter)
    * @param altura
    */  
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
