/* Main para ejecutar formulario grafico .

 * Este proyecto abarca lo siguiente puntos reflejados en las consignas a resolver: 

* "#Implementar las clases de fabricación pura que se consideren necesarias para permitir que el usuario pueda
*  ejecutar la funcionalidad del escenario modelado del caso de uso. "

*/
package gui;

import java.util.List;

import modelo_clases.Cultivo;
import modelo_clases.EmpresaAdministradora;
import modelo_clases.Suelo;
import modelo_clases.Establecimiento;
import modelo_clases.Lote;
import dao.SueloDAO;
import dao.SueloDAOIMP;


/**
 * @author Ibarra Gustavo | ibarrags@gmail.com 
 */
public class ObjectMainGUI {
            
    private SueloDAO suelosDao;
    private EmpresaAdministradora empresa;
    private Establecimiento establecimiento;
    private Lote lote;
    private Lote unNuevoLote;
        

    public void run()
    {
        
        
        this.suelosDao= new SueloDAOIMP();
        List<Suelo> suelos = suelosDao.tiposDeSuelo();        
        
        /**
        * A modo de prueba se crea la instancia de la unica empresa administradora de Establecimientos
        * Se implementa el contrucstor de la Empresa con parametro:
         * Nombre.
        */      
        empresa= new EmpresaAdministradora("AGRO srl");    
        establecimiento= new Establecimiento();
        lote= new Lote();

                
        PantallaRegistrarCampos pantallaRegistrarCampos = new PantallaRegistrarCampos(suelos, empresa, establecimiento, lote);
        pantallaRegistrarCampos.setVisible(true);
    
    }
   
  
    
    /**
     * Crea una instancia de un cultivo cualquiera.
     * Se implementa el contrucstor del Cultivo con parametro:
     * Nombre del cultivo.
    */      
    Cultivo unCultivo= new Cultivo("soja");
        
        
            
}
