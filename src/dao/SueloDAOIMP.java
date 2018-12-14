package dao;

import java.util.ArrayList;
import java.util.List;
import modelo_clases.Suelo;


/**
 * @author Ibarra Gustavo | ibarrags@gmail.com 
 */
public class SueloDAOIMP implements SueloDAO {
    
     private final List<Suelo> suelos;     

     /**
    * Tipos de Suelo. Existen solo 5 tipos de suelo a nivel Pais
    * Metodo para crear los unicos mismos tipos de suelo para todo el proyecto.
    */    
    public SueloDAOIMP() {
        this.suelos = new ArrayList<>();
        
        this.suelos.add(new Suelo("Tipo Suelo 1"));
        this.suelos.add(new Suelo("Tipo Suelo 2"));
        this.suelos.add(new Suelo("Tipo Suelo 3"));
    }

    @Override
    public List<Suelo> tiposDeSuelo() {
        return suelos;
    }
}
