
public class Jugador extends Persona{
    private String nJugador;
    private double saldo;
    
    //CONSTRUCTORES
    public Jugador()
    {
        nJugador="";
        saldo=0.0;
    }
    public Jugador(String n,String a,String g,String nj,double s)
    {
        super(n,a,g);
        nJugador=nj;
        saldo=s;
    }
    
    //ENTRADA DE DATOS SET
        public void setNjugador(String nj)
        {
            nJugador=nj;
        }
        public void setSaldo(double s)
        {
            saldo=s;
        }
        
        //SALIDA DE DATOS GET
        public String getNjugador()
        {
            return nJugador;
        }
        public double getSaldo()
        {
            return saldo;
        }
        
        //OPERACIONES QUE REALIZA EL JUGADOR
        public void incrementarSaldo(double si, double cantidad)
        {
            saldo=si;
            saldo=saldo+cantidad;
        }
        public void restarSaldo(double si, double cantidad)
        {
            saldo=si-cantidad;
        }
        public boolean puedoRetirar(double cantidad) 
        {
            return (cantidad<=saldo);
        }
    
}
