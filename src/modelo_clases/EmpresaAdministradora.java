package modelo_clases;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 * @author Ibarra Gustavo | ibarrags@gmail.com 
 */
public class EmpresaAdministradora extends ObjectMain {
    
   private String razonSocial;
   private List establecimientos;    
   
   /**
   * Constructor atributos como parametros de la clase EmpresaAdministradora
   * @param unaRazonSocial 
   * El contructor crea: la Administradora que administrara establecimtos,
   * el estado de los campo que administra, estado del los proyectos que lleva adelante la empresa administradora
   */
   public EmpresaAdministradora(String unaRazonSocial) {
            super.crearEstadosCampo();
            super.crearEstadosProyectos();
            this.razonSocial(unaRazonSocial);         
            this.establecimientos = new ArrayList<Establecimiento>();   
            
   }

   public void razonSocial( String unaRazonSocial ) {
      this.razonSocial= unaRazonSocial;
   }

   public String razonSocial( ) {
      return this.razonSocial;
   }
   
   // metodo que permite cambiar el estado (instancia) del establecimiento(instancia)  
   public void cambiarEstadoEstablecimiento(EstadoCampo unEstado, Establecimiento unEstablecimiento)
   {
       int indiceEstablcimiento = this.establecimientos.indexOf(unEstablecimiento);
       Establecimiento establecimiento = (Establecimiento)this.establecimientos.get(indiceEstablcimiento);
       establecimiento.asignarEstado(unEstado);
   }
   
   // metodo que agrega el primer establecimiento(instancia de un Establecimiento)
   // administrado por la empresa.   
   private boolean agregarPrimerEstablecimiento(Establecimiento unEstablcimiento)
   {
       boolean agregoEstablecimiento=false;
       
           if( this.establecimientos.size() == 0 )
           {
               this.establecimientos.add(unEstablcimiento);         
               agregoEstablecimiento= true;
           }
           
        return agregoEstablecimiento;                  
   }
   
   // Agrega establecimiento y valida que el nombre del Establecimiento(Campo) 
   // no se repita para otro Establecimiento administrado
   public boolean agregarEstablecimiento(Establecimiento unEstablcimiento)
   {
       
       boolean agregoEstablecimiento=false;
       
       agregoEstablecimiento= this.agregarPrimerEstablecimiento(unEstablcimiento);
       
       if( !this.establecimientos.contains(unEstablcimiento) )
       {
            List<Establecimiento> resultadoBusueda = this.establecimientos().stream()
               .filter(establecimiento -> Objects.equals(establecimiento.nombre(), unEstablcimiento.nombre()))
               .collect(Collectors.toList());
               
            if (resultadoBusueda.size() == 0)
            {
              this.establecimientos.add(unEstablcimiento);
              agregoEstablecimiento=true;
            }
       }             
       
       return agregoEstablecimiento;    
       
   }   
        
   private List<Establecimiento> establecimientos() {
      return this.establecimientos;
   }
   
   // imprime datos de los establecimientos adminsitrado por la empresa
   private void datosEstablecimientos()
   {
        for (Establecimiento unEstablecimiento : this.establecimientos()) 
        {
            System.out.println("Nombre Establecimiento de la empresa: "+ unEstablecimiento.nombre());
            System.out.println("Lotes del Establecimiento: "+ unEstablecimiento.nombre());
            System.out.println ( "Estado actual del establcimiento: " + unEstablecimiento.estadoActual());
                       
            
        }
    }     
   
    public void datosEmpresa() {
      System.out.println("Razon Social empresa: "+ this.razonSocial );    
       this.datosEstablecimientos();    
      
   }

    
}
