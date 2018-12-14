package modelo_clases;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 * @author Ibarra Gustavo | ibarrags@gmail.com 
 */
public class Establecimiento{
    private String nombre;       
    private EstadoCampo estado; 
    private List lotes;
    private Integer superficieEstablecimiento;
   

    
   /**
   * Constructor y atributos como parametros de la clase Establecimiento
   * @param unNombre 
   * El contructor crea: establecimiento, su nombre   
   */    
    
    public Establecimiento(String unNombre) {
            this.nombre(unNombre);
            this.superficieEstablecimiento= 0;
            this.lotes = new ArrayList<Lote>();
   }
    
    public Establecimiento() {
            this.superficieEstablecimiento= 0;
            this.lotes = new ArrayList<Lote>();
   }
    
   /**
   * Constructor y atributos como parametros de la clase Establecimiento
   * @param unNombre 
   * @param unEstado
   * @param unaSuperficie
   * El contructor crea: establecimiento, su nombre, 
   * su estado superficie y los lotes que intengran el establecimiento
   */    
    public Establecimiento(String unNombre, EstadoCampo unEstado, Integer unaSuperficie) {
            this.nombre(unNombre);
            this.asignarEstado(unEstado);
            this.superficieEstablecimiento= unaSuperficie;
            this.lotes = new ArrayList<Lote>();
   }

   public void superficieEstablecimiento(Integer unaSuperficie)
   {
       this.superficieEstablecimiento=unaSuperficie;
   }
    
   
   public Integer superficieEstablecimiento()
   {
       return this.superficieEstablecimiento;
   }
    
   public void asignarEstado (EstadoCampo unEstado)
   {
       this.estado= unEstado;
   }

   public List<Lote> lotes()
   {
        
       return this.lotes;
   }
   
   public void nombre( String unNombre ) {
      this.nombre= unNombre;
   }

   public String nombre( ) {
      return this.nombre;
   }
   
   
   public String estadoActual()
   {
       return this.estado.descripcion();
   } 
   
   public void datosLotes()
   {
        for (Lote unLote : this.lotes()) 
        {
            System.out.println("Nombre Lote: "+ unLote.nombre());
            System.out.println("Lote superficie: "+ unLote.superficie());
            
        }
    } 
   
   // Agrega el primer lote que forma el establecimiento.
   private boolean agregarPrimerLote(Lote unLote)
   {
       boolean agregoLote=false;
       
           if( this.lotes.size() == 0 )
           {
               this.lotes.add(unLote);
              
               agregoLote= true;
           }
           
        return agregoLote;                  
   }
   
   
   
   // Agrega el primer lote que forma el establecimiento.
   private boolean agregarPrimerLote(Lote unLote, Integer unNombre, Integer unaSuperficie)
   {
        boolean agregoLote=false;
       
        if( this.lotes.isEmpty() == true )
        {
             if (this.esSuperfieLotesMenorficieEstablecimiento(unaSuperficie) == true)
                 {
                    unLote.nombre(unNombre);
                    this.lotes.add(unLote);
              
                    agregoLote= true;
                 }
                 else
                     agregoLote= false;
                
            
        }
           
        return agregoLote;                  
   }
   
   
   // Agrega establecimiento y "valida que el nombre del Campo no se repita para otro Campo ya registrado"
   public boolean agregarLote(Lote unLote)
   {
       
       boolean agregoLote=false;
   
              
       agregoLote= this.agregarPrimerLote(unLote);
               
       if (agregoLote == false)
       {
           
        if( !this.lotes.contains(unLote) )
        {
            
             List<Lote> resultadoBusueda = this.lotes().stream()
                .filter(lote -> Objects.equals(lote.nombre(), unLote.nombre()))
                .collect(Collectors.toList());

             if (resultadoBusueda.size() == 0)
             {
   
               this.lotes.add(unLote);

               agregoLote= true;
             }
        }             

        }
       
        return agregoLote;    
       
   }   
   
   // Agrega establecimiento y "valida que el nombre del Campo no se repita para otro Campo ya registrado"
   public boolean agregarLote(Lote unLote, Integer unNombre, Integer unaSuperficie)
   {
       
       boolean agregoLote=false;
              
       agregoLote= this.agregarPrimerLote(unLote, unNombre,unaSuperficie );
               
       if (agregoLote == false)
       {
           
      //  if( !this.lotes.contains(unLote) )
      //  {
            
             List<Lote> resultadoBusueda = this.lotes().stream()
                .filter(lote -> Objects.equals(lote.nombre(), unNombre))
                .collect(Collectors.toList());

             if (resultadoBusueda.size() == 0)
             {                     
                 if (this.esSuperfieLotesMenorficieEstablecimiento(unaSuperficie) == true)
                 {
                    this.lotes.add(new Lote(unNombre));
                    agregoLote= true;
                 }
                 else
                     agregoLote= false;
                 
             }
        //}             

        }
       
        return agregoLote;    
       
   }   
   
   private Integer superficieLotesAsignado(Integer unaSuperficie)
   {
       
       Integer sumatoria = 0;
       for(Lote unLote : this.lotes())
           sumatoria += unLote.superficie();
       return sumatoria + unaSuperficie;
       
   }
   
   private boolean esSuperfieLotesMenorficieEstablecimiento(Integer unaSuperficie)
   {
       if (this.superficieLotesAsignado(unaSuperficie)  <= this.superficieEstablecimiento)
           return true;
       
       return false; 
                   
   }
}
