
import javax.swing.JOptionPane;

public class Dados  {
    int num=0;
   public int lanzarDado()
   {
        while((num==0) || (num>6))
        {
        num=(int)(Math.random()*10);
        //System.out.println("número:  " +num);
        }
    return num;
   }
}
