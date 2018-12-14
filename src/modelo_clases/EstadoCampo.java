package modelo_clases;

public class EstadoCampo {
    private String descripcion; 
    
    public EstadoCampo(String unaDescripcionEstado)
    {
        this.descripcion= unaDescripcionEstado; 
    }
    
    public String descripcion() 
    {
        return this.descripcion;
    }
    
    
    public void descripcion(String unaDescripcionEstado) 
    {
        this.descripcion= unaDescripcionEstado;
    }
    
    @Override
    public String toString() {
        return this.descripcion();
    }
    
}

