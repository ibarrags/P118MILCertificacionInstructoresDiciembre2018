
package gui;

import modelo_clases.Lote;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author gustavo
 */
public final class TablaLoteModel extends AbstractTableModel 
{
    
    private static final String[] columnasTabla = { "nro", "sup", "TSuelo"};
    
    private List<Lote> lotes;
    
    public TablaLoteModel (List<Lote> todosLoslotes) {
        super();
        this.lotes = todosLoslotes;
    }

    
    @Override
    public int getRowCount() {
        return this.lotes.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    public void setLotes(List<Lote> pedidos) {
        this.lotes = pedidos;
    }
    
    
    public Lote obtenerLotesEn (int fila) {
        return lotes.get(fila);
    }
    
    
    @Override
    public String getColumnName(int index) {
        return columnasTabla[index];
    }

    
    @Override
    public Object getValueAt(int unaFila, int unColumna) {
                           
        Lote lote = lotes.get(unaFila);
        Object object = null;
        
        switch (unColumna) {
            case 0:
                object = lote.nombre();
                break;
            case 1:
                object = lote.superficie();
                break;
            case 2:
                object = lote.tipoSuelo();
                break;
            
        }
        
        return object;
    }

    
}
