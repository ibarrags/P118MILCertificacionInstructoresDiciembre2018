package modelo_clases;

public class Laboreo implements Comparable<Laboreo> {
    private String nombre;
    private Integer orden;
    private String momento;
  //  private String laboreoEnCurso;
    
    public Laboreo()
    {
    }
    
    public Laboreo(String unNombre, Integer unOrden)
    {
        this.nombre= unNombre;
        this.orden= unOrden;
    }
    
    public String nombre()
    {
        return this.nombre;
    }
    
    
    public Integer orden()
    {
        return this.orden;
    }
    
    
    // metedo para comparar los laboreos por el orden predefinidos 
    //durante la creacion de cada laboreo para cada cultivo    
    @Override
    public int compareTo(Laboreo unLaboreo) {
        return this.orden - unLaboreo.orden();
    }
    


}
