package dao;

import java.util.ArrayList;
import java.util.List;
import modelo_clases.EstadoCampo;

/**
 *
 * @author gustavo
 */
public class EstadoCampoDAOIMP implements EstadoCampoDAO {
    
    private final List<EstadoCampo> tiposDeSuelo;     
  
    
    /**
     * Los campos(Establecimiento, es mas acorde) tienen un único estado por momento 
     * Define la situación en la que se encuentra en función de la situación de sus lotes asignados.
     * Estados:creado, parcialmente trabajado, completamente trabajado, en desuso.
     * 
     *  Metodo para crear los unicos mismos estados de cada campo para todo el proyecto.
     */ 
    public EstadoCampoDAOIMP() {
        this.tiposDeSuelo = new ArrayList<>();        
            
        this.tiposDeSuelo.add(new EstadoCampo("Campo Creado"));
        this.tiposDeSuelo.add(new EstadoCampo("Campo Desuso"));
        this.tiposDeSuelo.add(new EstadoCampo("Campo Parcialmente Trabajado"));
        this.tiposDeSuelo.add(new EstadoCampo("Campo Completamente Trabajado"));
    }
    
}
