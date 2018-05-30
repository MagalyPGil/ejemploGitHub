
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class ManejoArchivoDeTexto {
    String nomArchivo;
    File archivo;
    //ESCRITURA DE DATOS
    FileWriter fw;
    //LECTURA DE DATOS
    FileReader fr;
    
    public ManejoArchivoDeTexto(String nom) {
        nomArchivo=nom;
        archivo= new File(nomArchivo);
    }
    //CREAR ARCHIVO DE TEXTO
    public void crearArchivo(String datos)
    {
        try {
            fw=new FileWriter(nomArchivo);
            PrintWriter pw=new PrintWriter(fw);
            pw.println(datos);
            pw.close();
        } catch (Exception e) {
            System.out.println("ERROR EN EL ARCHIVO"+e.getMessage());
        }
    }
    //LEER ARCHIVO
      public String LeerArchivo()
      {
          String texto="";
          try {
              fr=new FileReader(nomArchivo);
              BufferedReader br=new BufferedReader(fr);
              String leerLinea="";
              while((leerLinea=br.readLine())!=null)
              {
                  texto+=leerLinea+"\n";
              }
             
          } 
          catch (Exception e) {
              System.out.println("ERROR EN EL ARCHIVO"+e.getMessage());
          }
           return texto;
      }
      
      //AGREGAR DATOS AL ARCHIVO
      public void AgregarDatos(String nuevoTexto)
      {
          String archivoActual=LeerArchivo();
          String textoFinal=archivoActual+"\n"+nuevoTexto;
          crearArchivo(textoFinal);
      }
    
}
