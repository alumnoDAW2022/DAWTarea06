package clases;

/**
 * Clase Triangulo
 *
 * Esta clase modela la figura de un triangulo
 * Hereda de la clase Figura
 *
 * @version 0.0.1 31/01/2022
 * @author Programador
 * @see Figura
 */
public class Triangulo extends Figura{
    
   /**
    * Base del triangulo
    */ 
    private double base;

   /**
    * Altura del triangulo
    */
    private double altura;

   /**
    * Este método calcula el area del triangulo
    * @return area
    */  
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
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
