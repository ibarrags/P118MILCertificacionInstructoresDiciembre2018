package modelo_clases;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;



/**
 * @author Ibarra Gustavo | ibarrags@gmail.com 
 */
public class Cultivo {
    private String nombre;
    private SortedSet<Laboreo> laboreos= new TreeSet<Laboreo>();
    
    public Cultivo(String unNombre)
    {
        this.nombre(unNombre);
        this.crearLaboreos();
    }
    
    private void nombre(String unNombre)
    {
        this.nombre= unNombre;
    }
    
    
    public String nombre()
    {
        return this.nombre;
    }
    // se crean las labores preasignadas y previamente ordenadas por cultivo
    private void crearLaboreos()
    {                
        
        this.laboreos.add(new Laboreo("Tarea de Laboreo orden 2", 2));
        this.laboreos.add(new Laboreo("Tarea de Laboreo orden 1", 1));
        this.laboreos.add(new Laboreo("Tarea de Laboreo orden 3", 3));
    }
    
    // listar las labores del cultivo
    public void listarLaboreos()
    {
          System.out.println("Labores/Orden del cultivo: " +  this.nombre );
          Iterator anInterator = laboreos.iterator();
          
          while (anInterator.hasNext())
          {
              Laboreo unLaboreo = (Laboreo) anInterator.next();
              System.out.println("Nombre Laboreo " + unLaboreo.nombre() + ", orden: " + unLaboreo.orden());

	   }
    }
    
    // responde cual es el primer laboreo del cultivo
    public Laboreo primerLaboreo()
    {
       return this.laboreos.first();
    }
    
    // responde cual es el siguiente laboreo al laboreo actual del proyecto.
    public Laboreo siguienteLaboreo(Proyecto proyecto)
    {
        Integer indice = 0;
        Integer ubicacionLaboreActual= proyecto.laboreoActual().orden();
        
        Iterator<Laboreo> iterator = laboreos.iterator();
        Laboreo laboreoTemporal= new Laboreo();
        
        
        while(iterator.hasNext() && indice <= ubicacionLaboreActual) {
            laboreoTemporal = iterator.next();
            indice++; 
        }
        
        return laboreoTemporal;
        
    }
    
    
}
