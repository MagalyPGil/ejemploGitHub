
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel{

     ArrayList<Jugador> lista;
    String[] columnasTabla={"Número de Cliente", "Nombre", "Apellido", "Género","Saldo"};
    
    
    public ModeloTabla(ArrayList<Jugador> listaLocal)
    {
        lista=listaLocal;
    }
    
    @Override
    public String getColumnName(int c) {
        return columnasTabla[c]; 
    }
     @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return columnasTabla.length;
    }

    @Override
    public Object getValueAt(int r, int c) {
        switch(c)
        {
            case 0:
                return lista.get(r).getNjugador();
            case 1:
                return lista.get(r).getNombre();
            case 2:
                return lista.get(r).getApellido();
            case 3:
                return lista.get(r).getGenero();
            case 4:
                return lista.get(r).getSaldo();
        }
        return null;
    }
    
    
}
