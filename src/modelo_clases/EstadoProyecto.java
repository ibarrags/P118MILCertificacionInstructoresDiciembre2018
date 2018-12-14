package modelo_clases;

public class EstadoProyecto {
    
    private String descripcion; 
    
    public EstadoProyecto(String unaDescripcionProyecto)
    {
        this.descripcion= unaDescripcionProyecto; 
    }
    
    public String descripcion() 
    {
        return this.descripcion;
    }
    
    
    public void descripcion(String unaDescripcionProyecto) 
    {
        this.descripcion= unaDescripcionProyecto;
    }
    
    @Override
    public String toString() {
        return this.descripcion();
    }
    
    
}
