package modelo_clases;

public class Proyecto {
    
    private Cultivo cultivo;
    private EstadoProyecto estadoProyecto;
    private Laboreo laboreoActual;
    
    public Proyecto(Cultivo unCultivo, EstadoProyecto unEstadoProyecto)
    {
        this.cultivo(unCultivo);
        this.estadoProyecto(unEstadoProyecto); 
        this.laboreoActual(unCultivo.primerLaboreo());
//        this.cultivo.
    }
    
    private void estadoProyecto(EstadoProyecto unEstadoProyecto)
    {
        this.estadoProyecto= unEstadoProyecto;
    }
    
    private void cultivo(Cultivo unCultivo)
    {
        this.cultivo= unCultivo;
    }
    
    public void laboreoActual(Laboreo unLaboreo)
    {
        this.laboreoActual= unLaboreo;
    }
    
    public Laboreo laboreoActual()
    {
        return this.laboreoActual;
    }
    
}
