package clases;

/**
 * Esta clase representa la abstracción de una figura
 *
 * Proporciona el método CalcularArea() a toda clase
 * que herede de ella
 *
 * @version 0.0.1 31/01/2022
 * @author Programador
 */
public abstract class Figura {    
    
   /**
    * Area de una figura
    */	
    double area;
    
    /**
     * Método abstracto para que sea implementado 
     * por cada clase que herede de esta
     */
    abstract public double CalcularArea();
    
}
