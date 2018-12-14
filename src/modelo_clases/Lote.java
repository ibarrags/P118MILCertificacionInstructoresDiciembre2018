package modelo_clases;

import java.util.ArrayList;

public class Lote {
    
    private Integer nombre;
    private Integer superficie;
    private Suelo suelo; // Un lote tiene un único tipo de suelo. 
    private Proyecto proyectoActual;
    private ArrayList historialProyectos= new ArrayList<Proyecto>();

    
   public Lote() {
            
   }
    
   public Lote(Integer unNombre) {
            this.nombre(unNombre);            
   }
 
   public Lote(Integer unNombre, Integer unaSuperficie, Suelo unSuelo) {
            this.nombre(unNombre);
            this.superficie(unaSuperficie);
            this.suelo(unSuelo);
   }
   
   

   public void asignarProyecto(Proyecto unProyecto)
   {
       this.proyectoActual= unProyecto;
       this.historialProyectos.add(unProyecto);
   }
   
   public void suelo(Suelo unSuelo)
   {
       this.suelo= unSuelo;
   }
   
   public Suelo suelo()
   {
       return this.suelo;
   }
   
   public String tipoSuelo()
   {
       return this.suelo().tipo();
   }
   
   public void superficie( Integer unaSuperficie ) {
      this.superficie= unaSuperficie;
   }

   public Integer superficie( ) {
      return this.superficie;
   }
    
   public void nombre( Integer unNombre ) {
      this.nombre= unNombre;
   }

   public Integer nombre( ) {
      return this.nombre;
   }
   
    public void datosLote() {
      System.out.println("Lote Nombre:"+ this.nombre  );    
   }

    
}
