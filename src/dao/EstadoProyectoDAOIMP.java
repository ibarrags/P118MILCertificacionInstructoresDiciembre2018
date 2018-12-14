
package dao;

import modelo_clases.EstadoProyecto;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Ibarra Gustavo | ibarrags@gmail.com 
 */
public class EstadoProyectoDAOIMP implements EstadoProyectoDAO {
    
      private final List<EstadoProyecto> tiposEstado;     
     
      
        
    /**
     * Proyecto(planteo de la campaña agrícola,seria mas apropiado) de cultivo tiene único estado
     * y dependen de los laboreos(tareas agricolas) que se realizan en cada lote.
     * Cada Proyecto inicia con la tarea agricoa Siembra("Preparando") y termina con la Cosecha.
     * Los posibles estados del Proyecto son: Preparando, resembrando, postsiembra, cosechado, cancelado
     * 
     *  Metodo para crear los unicos mismos estados de los proyectos agricolas por cada lote.
     */  
      public EstadoProyectoDAOIMP() {
        this.tiposEstado = new ArrayList<>();
        
        this.tiposEstado.add(new EstadoProyecto("Preparando"));
        this.tiposEstado.add(new EstadoProyecto("Resembrando"));
        this.tiposEstado.add(new EstadoProyecto("Postsiembra"));
        this.tiposEstado.add(new EstadoProyecto("Cosechado"));
        this.tiposEstado.add(new EstadoProyecto("Cancelado"));
        
    }

    @Override
    public List<EstadoProyecto> tiposEstado() {
        return tiposEstado;
    }
    
}
