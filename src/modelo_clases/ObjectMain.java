/* Este "main" fue pensado para ejecutar y probar el modelo de clase sobre los requerimientos 
solicitados desde linea de comenado (terminal).

 * Este proyecto abarca lo siguiente puntos reflejados en las consignas a resolver: 
" #Crear cada una de clases según lo especificado en el diagrama de clases creado. Para cada clase deberá:
o Implementar sus atributos con su tipo de datos correspondiente.
o Definir un constructor para cada clase.
o Crear los métodos de acceso [método get() y método set()], para poder obtener y/o asignar el valor
de los atributos de los objetos de una clase. "

"#Considerando la funcionalidad descripta en el escenario del caso de uso, implementar los métodos necesarios
para que los objetos de las clases puedan implementar el comportamiento especificado. Considerar la
signatura completa del método, es decir: el modificador de acceso (public o private), el nombre del método,
el valor de retorno y los parámetros necesarios. "


 */

/**
 * @author Ibarra Gustavo | ibarrags@gmail.com 
 */

package modelo_clases;


/**
 * Proyecto NetBeans donde se resuelve el modelo de clase para el requerimiento
 * "Administración de Campos" y para el caso de uso: Registrar Campos.
 * Clase Main nombrada ObjectMain
*/

public class ObjectMain {
    private static EstadoCampo estadoCampoCreado;
    private static EstadoCampo estadoCampoDesuso;
    private static EstadoCampo estadoCampoParcialmentetrabajado;
    private static EstadoCampo estadoCampoCompletamenteTrabajado;
    
    private static EstadoProyecto estadoProyectoPreparando;
    private static EstadoProyecto estadoProyectoSembrando;
    private static EstadoProyecto estadoProyectoResembrando;
    private static EstadoProyecto estadoProyectoPostsiembra;
    private static EstadoProyecto estadoProyectoCosechado;
    private static EstadoProyecto estadoProyectoCancelado;
            
    private static Suelo tipoSuelo1;
    private static Suelo tipoSuelo2;
    private static Suelo tipoSuelo3;
    private static Suelo tipoSuelo4;
    private static Suelo tipoSuelo5;
    

    /**
    * Tipos de Suelo. Existen solo 5 tipos de suelo a nivel Pais
    * Metodo para crear los unicos mismos tipos de suelo para todo el proyecto.
    */    
    public static void crearTiposSuelo()
    {
        tipoSuelo1= new Suelo("Tipo Suelo 1");
        tipoSuelo2= new Suelo("Tipo Suelo 2");
        tipoSuelo3= new Suelo("Tipo Suelo 3");
        tipoSuelo4= new Suelo("Tipo Suelo 4");            
        tipoSuelo5= new Suelo("Tipo Suelo 5");            
    }
    /**
     * Los campos(Establecimiento, es mas acorde) tienen un único estado por momento 
     * Define la situación en la que se encuentra en función de la situación de sus lotes asignados.
     * Estados:creado, parcialmente trabajado, completamente trabajado, en desuso.
     * 
     *  Metodo para crear los unicos mismos estados de cada campo para todo el proyecto.
     */
    public static void crearEstadosCampo()
    {
        estadoCampoCreado= new EstadoCampo("Creado");
        estadoCampoDesuso= new EstadoCampo("Desuso");
        estadoCampoParcialmentetrabajado= new EstadoCampo("Parcialmente Trabajado");
        estadoCampoCompletamenteTrabajado= new EstadoCampo("Completamente Trabajado");            
    }
    
    /**
     * Proyecto(planteo de la campaña agrícola,seria mas apropiado) de cultivo tiene único estado
     * y dependen de los laboreos(tareas agricolas) que se realizan en cada lote.
     * Cada Proyecto inicia con la tarea agricoa Siembra("Preparando") y termina con la Cosecha.
     * Los posibles estados del Proyecto son: Preparando, resembrando, postsiembra, cosechado, cancelado
     * 
     *  Metodo para crear los unicos mismos estados de los proyectos agricolas por cada lote.
     */
    public static void crearEstadosProyectos()
    {        
        estadoProyectoPreparando= new EstadoProyecto("Preparando");
        estadoProyectoResembrando= new EstadoProyecto("Resembrando");
        estadoProyectoPostsiembra= new EstadoProyecto("Postsiembra");
        estadoProyectoCosechado= new EstadoProyecto("Cosechado");
        estadoProyectoCancelado= new EstadoProyecto("Cancelado");
    }
    
    
    public static void main(String[] args) {
        
        
         /**
        * Crea una instancia de un cultivo cualquiera.
        * Se implementa el contrucstor del Cultivo con parametro:
         * Nombre del cultivo.
        */      
        Cultivo unCultivo= new Cultivo("soja");
        unCultivo.listarLaboreos();
     
        /**
        * Crea la instancia de la unica empresa administradora de Establecimientos
        * Se implementa el contrucstor de la Empresa con parametro:
         * Nombre.
        */      
        EmpresaAdministradora empresa= new EmpresaAdministradora("AGRO srl");
        
        // Muetra datos de la empresa administradora
        empresa.datosEmpresa();       
        
        /**
         * Crea 3 instancia de 3 Establecimiento(campo) distintos repitiendo el nombre
         * de unos de los establecimientos para probar que no se repite nombre de
         * los establecimientos adminitrados.
         * Se implementa el construtor de cada Establecimiento con parametros:
         * Nombre, estado inicial y superficie (has)
         */
        Establecimiento establecimiento1= new Establecimiento("Nombre Establecimiento1",estadoCampoCreado, 1000);        
        Establecimiento establecimiento2= new Establecimiento("Nombre Establecimiento2",estadoCampoCreado, 2000);
        Establecimiento establecimiento3= new Establecimiento("Nombre Establecimiento2",estadoCampoCreado,1000);
        
        /**
         * Agrega establecimientos a la empresa administradora.
         */
        boolean resultado= empresa.agregarEstablecimiento(establecimiento1);        
        resultado= empresa.agregarEstablecimiento(establecimiento2);
        resultado= empresa.agregarEstablecimiento(establecimiento3);
        
        // Muestra datos de la empresa administradora
        empresa.datosEmpresa();
        
        /**
         * Se crean lotes.
         * Se implementa el constructor de cada Lote  con parametros:
         * Numero a referencia de nombre, superficie (ha) y tipo de suelo del lote correspondiente
         * Se reitera el numbero de unos de los lotes para probar el requerimiento de no repetir nombre 
         * de los lotes por de cada establecimiento.
         */
        Lote lote1= new Lote(1, 10,tipoSuelo1);
        Lote lote2= new Lote(2, 20,tipoSuelo2);
        Lote lote3= new Lote(1, 20,tipoSuelo3);
        
        // se agregan los lotes a un mismo establecimiento
        boolean resultadoAgregar = establecimiento1.agregarLote(lote1);
        resultadoAgregar = establecimiento1.agregarLote(lote2);
        resultadoAgregar = establecimiento1.agregarLote(lote3);
        
        // Muetra datos de los lotes asignados al establecimiento. 
        establecimiento1.datosLotes();
        
        /**
         * Se decide sembrar un cultivo en un lote entonces se crea un proyecto nuevo (Campaña Agrícola)
         *  Se implementa el construtor del Proyecto con parametros:
         * Cultivo, estado inicial del Proyecto
         */
        Proyecto proyecto1= new Proyecto(unCultivo,estadoProyectoPreparando);
//proyecto1.laboreo(unCultivo.laboreoActual());

        // se asgina nuevo proyecto al lote sembrado
        lote1.asignarProyecto(proyecto1);
        
        // a modo de prueba se cambia el estado del laboreo actual del proyecto
        // a la siguiente tarea agricola (laboreo) del cultivo para el lote en tratamiento.
        proyecto1.laboreoActual(unCultivo.siguienteLaboreo(proyecto1));
        
        // a modo de prueba se cambia el Estado de un Establecimiento administrado por la empresa.
        empresa.cambiarEstadoEstablecimiento(estadoCampoParcialmentetrabajado, establecimiento1);
        System.out.println ( "Cambio. Estado actual del establcimiento: " + establecimiento1.estadoActual()); ;
        
        
    }

    
}
