package modelo_clases;

public class Suelo {
    private String tipo;
    
    public Suelo(String unTipoDeSuelo)
    {
        this.tipo= unTipoDeSuelo;
    }
    
    public void tipo(String unTipoDeSuelo)
    {
        this.tipo=unTipoDeSuelo;
    }
    
    
    public String tipo()
    {
        return this.tipo;
    }
    
    
    @Override
    public String toString() {
        return this.tipo();
    }
    
}
