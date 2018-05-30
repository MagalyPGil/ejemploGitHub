
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AdministradorDeLista {
    private ArrayList<Jugador>listaJugadores;
    
    //CONSTRUCTOR DE LA LISTA
    public AdministradorDeLista(ArrayList<Jugador> listaJ)
    {
        listaJugadores=listaJ;
    }
    
    //OBTENER EL NUMERO DE ELEMENTOS QUYE HAY EN LA LISTA
    public int tamanioLista()
    {
        return listaJugadores.size();
    }
    
    //AGREGAR UN NUEVO JUGADOR A LA LISTA
    public void agregaJugador(Jugador newJug)
    {
        listaJugadores.add(newJug);
    }
    
    //BUACAR UN ELEMNETO EN LA LISTA
    public int posicionDelNombre(String nomBuscar)
    {
        int posicion=-1;
        int vueltas=0;
        boolean encontro=false;
        while(encontro==false && vueltas<listaJugadores.size())
        {
            if(nomBuscar.equals(listaJugadores.get(vueltas).getNjugador()))
            {
                encontro=true;
                posicion=vueltas;
            }
            vueltas++;
        }
        return posicion;
    }
    
    //REGRESAR UN OBJETO DE LA LISTA
    public Object regresaDatosJugador(int posicion)
    {
        return listaJugadores.get(posicion);
    }
    
    //ELIMINAR A UN JUGADOR DE LA LISTA
    void eliminarJugador(String eliminar)
    {
        if(posicionDelNombre(eliminar)!=-1)
        {
            listaJugadores.remove(posicionDelNombre(eliminar));
            JOptionPane.showMessageDialog(null,"LA PERSONA HA SIDO ELIMINDA DEL SISTEMA");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"LA PERSONA NO ESTA DADA DE ALTA EN EL SISTEMA");
        }
    }
    
    //REGRESAR EN MENSAJE TODOS LOS DATOS DE UN OBJETO
    public String imprimeListaDeJugadores()
    {
        String resultado="";
        for(int i=0; i<listaJugadores.size(); i++)
        {
            resultado=resultado+listaJugadores.get(i).getNjugador()+" "+listaJugadores.get(i).getNombre()+"  "+listaJugadores.get(i).getApellido()+"  "+listaJugadores.get(i).getGenero()+listaJugadores.get(i).getSaldo()+"\n";
        }
        return resultado;
    }
    
    
}
