
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;


public class FrmPrincipal extends javax.swing.JFrame {

    static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    static AdministradorDeLista admin=new AdministradorDeLista(listaJugadores);
    static ManejoArchivoDeTexto archivo=new ManejoArchivoDeTexto("casino.txt");
    
    public FrmPrincipal() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        btgGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btIncrementarSaldo = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btJugar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtDado1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtDado2 = new javax.swing.JTextField();
        txtCantApostar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        AdminClientes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ListaClientess = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos generales del Cliente"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Género"));
        jPanel2.setEnabled(false);

        btgGenero.add(rbMasculino);
        rbMasculino.setText("Masculino");
        rbMasculino.setEnabled(false);
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        btgGenero.add(rbFemenino);
        rbFemenino.setText("Femenino");
        rbFemenino.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbFemenino))
        );

        jLabel3.setText("Saldo:");

        btIncrementarSaldo.setText("Incrementar Saldo");
        btIncrementarSaldo.setEnabled(false);
        btIncrementarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncrementarSaldoActionPerformed(evt);
            }
        });

        txtNombre.setEnabled(false);

        txtApellido.setEnabled(false);

        txtSaldo.setEnabled(false);
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        jLabel6.setText("Número de Cliente:");

        txtNumCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumClienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btIncrementarSaldo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumCliente)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btIncrementarSaldo)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Jugar")));

        jLabel4.setText("Cantidad a apostar:");

        btJugar.setText("JUGAR");
        btJugar.setEnabled(false);
        btJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJugarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dado #1"));

        txtDado1.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDado1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dado #2"));

        txtDado2.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDado2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtCantApostar.setEnabled(false);

        jLabel5.setText("Resultado:");

        txtResultado.setEnabled(false);

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btJugar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantApostar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btSalir))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantApostar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btJugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btSalir)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        AdminClientes.setText("Clientes");

        jMenuItem1.setText("Administrar Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem1KeyPressed(evt);
            }
        });
        AdminClientes.add(jMenuItem1);

        ListaClientess.setText("Lista de Clientes");
        ListaClientess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaClientessActionPerformed(evt);
            }
        });
        AdminClientes.add(ListaClientess);
        AdminClientes.add(jSeparator3);

        jMenuItem3.setText("Salir");
        AdminClientes.add(jMenuItem3);

        jMenuBar1.add(AdminClientes);

        MenuAyuda.setText("Ayuda");

        AcercaDe.setText("Acerca de...");
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });
        MenuAyuda.add(AcercaDe);

        jMenuBar1.add(MenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaClientessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaClientessActionPerformed
        FrmListaClientes ventanaListaClientes=new FrmListaClientes();
        ventanaListaClientes.setTitle("CASINO ~LA PEÑA~");
        ventanaListaClientes.setLocationRelativeTo(null);
        ventanaListaClientes.setVisible(true); 
        txtNumCliente.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        btgGenero.clearSelection();
        txtSaldo.setText("");
        txtCantApostar.setText("");
        txtDado1.setText("");
        txtDado2.setText("");
        txtResultado.setText("");
        txtNumCliente.requestFocus();
    }//GEN-LAST:event_ListaClientessActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeActionPerformed
        FrmAcercaDe ventanaAcercaDe=new FrmAcercaDe();
        ventanaAcercaDe.setTitle("CASINO ~LA PEÑA~");
        ventanaAcercaDe.setLocationRelativeTo(null);
        ventanaAcercaDe.setVisible(true);
        txtNumCliente.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        btgGenero.clearSelection();
        txtSaldo.setText("");
        txtCantApostar.setText("");
        txtDado1.setText("");
        txtDado2.setText("");
        txtResultado.setText("");
        txtNumCliente.requestFocus();
    }//GEN-LAST:event_AcercaDeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmAdminClientess ventanaAdmin=new FrmAdminClientess();
        ventanaAdmin.setTitle("CASINO ~LA PEÑA~");
        ventanaAdmin.setLocationRelativeTo(null);
        ventanaAdmin.setVisible(true);
        txtNumCliente.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        btgGenero.clearSelection();
        txtSaldo.setText("");
        txtCantApostar.setText("");
        txtDado1.setText("");
        txtDado2.setText("");
        txtResultado.setText("");
        txtNumCliente.requestFocus();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btIncrementarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncrementarSaldoActionPerformed
       
        Jugador newJugador=new Jugador();
        double si=Double.parseDouble(txtSaldo.getText());
        double incremento;
        incremento=Double.parseDouble(JOptionPane.showInputDialog("Cantidad a depositar:"));
        newJugador.incrementarSaldo(si, incremento);
        txtSaldo.setText(String.valueOf(newJugador.getSaldo()));
        double saldo=Double.parseDouble(txtSaldo.getText());
        int p=admin.posicionDelNombre(txtNumCliente.getText());
        Jugador personita=(Jugador)admin.regresaDatosJugador(p);
        personita.setSaldo(saldo);
    }//GEN-LAST:event_btIncrementarSaldoActionPerformed

    private void btJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJugarActionPerformed
       
        
        Jugador newJugador=new Jugador();
        int p;
        double saldo=0;
                Jugador otroJugador=new Jugador();
            double saldoInicial=Double.parseDouble(txtSaldo.getText());
            double apostar=apostar=Double.parseDouble(txtCantApostar.getText());
            double saldoActual=0;
            double apostarNvo=0;
            if(apostar<=0)
            {
                JOptionPane.showMessageDialog(null,"APUESTA INVÁLIDA\nINGRESE UNA CANTIDAD MAYOR A CERO");
            }
            else
            {
                Dados newDado1= new Dados();
                Dados newDado2= new Dados();
                txtDado1.setText(String.valueOf(newDado1.lanzarDado()));
                txtDado2.setText(String.valueOf(newDado2.lanzarDado()));
                int suma;
                int d1=Integer.parseInt(txtDado1.getText());
                int d2=Integer.parseInt(txtDado2.getText());
                suma=d1+d2;
                txtResultado.setText(String.valueOf(suma));

            if(saldoInicial>=apostar)
            {
                
                if(suma==7)
                {
                    saldoActual=saldoInicial-apostar;
                    apostarNvo=apostar*2;
                    otroJugador.incrementarSaldo(saldoActual, apostarNvo);
                    txtSaldo.setText(String.valueOf(otroJugador.getSaldo()));
                    saldo=Double.parseDouble(txtSaldo.getText());
                    p=admin.posicionDelNombre(txtNumCliente.getText());
                    Jugador personita=(Jugador)admin.regresaDatosJugador(p);
                    personita.setSaldo(saldo);
                    JOptionPane.showMessageDialog(null,"FELICIDADES GANASTE");
                }
                else
                {
                    otroJugador.restarSaldo(saldoInicial,apostar);
                    txtSaldo.setText(String.valueOf(otroJugador.getSaldo()));
                    saldo=Double.parseDouble(txtSaldo.getText());
                    p=admin.posicionDelNombre(txtNumCliente.getText());
                    Jugador personita=(Jugador)admin.regresaDatosJugador(p);
                    personita.setSaldo(saldo);
                    JOptionPane.showMessageDialog(null, "LO SENTIMOS PERDISTE :(");
                }
                txtCantApostar.setText("");
                txtCantApostar.requestFocus();
                
            }   
            else
            {
                //QUIERO INABILITAR EL BOTON
                JOptionPane.showMessageDialog(null,"LO SENTIMOS SU SALDO ES INSUFICIENTE\nFAVOR DE REALIZAR UN NUEVO DEPOSITO");
                txtCantApostar.setText("");
                txtCantApostar.requestFocus();
            }
            }
            
        
    }//GEN-LAST:event_btJugarActionPerformed

    private void txtNumClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumClienteKeyPressed
        txtNumCliente.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, java.util.Collections.EMPTY_SET);
        if(evt.getKeyCode()==KeyEvent.VK_TAB)
        {
            int p = admin.posicionDelNombre(txtNumCliente.getText());
        System.out.println(p);
        if(p==-1)
        {
            btIncrementarSaldo.setEnabled(false);
            txtCantApostar.setEnabled(false);
            btJugar.setEnabled(false);
            txtNumCliente.setText("");
            txtNumCliente.requestFocus();
            JOptionPane.showMessageDialog(null,"LA PERSONA NO ESTA DADA DE ALTA EN EL SISTEMA\nFAVOR DE INTENTAR CON OTRO ID");
        }
        else
        {
            btIncrementarSaldo.setEnabled(true);
            txtCantApostar.setEnabled(true);
            btJugar.setEnabled(true);
            Jugador personita=(Jugador)admin.regresaDatosJugador(p);
            txtNombre.setText(String.valueOf(personita.getNombre()));
            txtApellido.setText(String.valueOf(personita.getApellido()));
            if(personita.getGenero()=="Femenino")
            {
                rbFemenino.setSelected(true);
            }
            else
            {
                rbMasculino.setSelected(true);
            }
            txtSaldo.setText(String.valueOf(personita.getSaldo())); 
                      
        }
        }
    }//GEN-LAST:event_txtNumClienteKeyPressed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        String renglon;
        String almacenaLista="";
        for(int i=0; i<listaJugadores.size(); i++)
        {
            renglon=listaJugadores.get(i).getNombre()+"-"+listaJugadores.get(i).getApellido()+"-"+listaJugadores.get(i).getGenero()+"-"+listaJugadores.get(i).getNjugador()+"-"+listaJugadores.get(i).getSaldo()+"\n";
            almacenaLista=almacenaLista+renglon;
        }
        archivo.crearArchivo(almacenaLista);
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void jMenuItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1KeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String renglon;
        String almacenaLista="";
        for(int i=0; i<listaJugadores.size(); i++)
        {
            renglon=listaJugadores.get(i).getNombre()+"-"+listaJugadores.get(i).getApellido()+"-"+listaJugadores.get(i).getGenero()+"-"+listaJugadores.get(i).getNjugador()+"-"+listaJugadores.get(i).getSaldo()+"\n";
            almacenaLista=almacenaLista+renglon;
        }
        archivo.crearArchivo(almacenaLista);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String archivoActual=archivo.LeerArchivo();
        System.out.println("ESTADO ACTUAL DEL ARCHIVO\n"+archivoActual);
        //OBTENGO EL NUMERO DE RENGLONES DE MI ARCHIVO ACTUAL
        String [] separaRenglon=archivoActual.split("\n");
        //System.out.println("Num ren"+separaRenglon.length);
        String [] separaColumnas={};
        for(int i=0; i<separaRenglon.length; i++)
        {
            //SEPARO MIS COLUMNAS
            separaColumnas=separaRenglon[i].split("-");
            //PARSEO EL SALDO PARA PODER ACCEDER A EL
            double saldo=Double.parseDouble(separaColumnas[4]);
            //AGREGO LOS DATOS EXTRAIDOS A MI CLASE JUGADOR
            admin.agregaJugador(new Jugador(separaColumnas[0], separaColumnas[1], separaColumnas[2],separaColumnas[3], saldo));
            //System.out.println(Jugador(i));
        }
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrincipal ventanaPrincipal = new FrmPrincipal();//.setVisible(true);
                ventanaPrincipal.setTitle("CASINO ~LA PEÑA~");
                ventanaPrincipal.setLocationRelativeTo(null);
                ventanaPrincipal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AcercaDe;
    private javax.swing.JMenu AdminClientes;
    private javax.swing.JMenuItem ListaClientess;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JButton btIncrementarSaldo;
    private javax.swing.JButton btJugar;
    private javax.swing.JButton btSalir;
    private javax.swing.ButtonGroup btgGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCantApostar;
    private javax.swing.JTextField txtDado1;
    private javax.swing.JTextField txtDado2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCliente;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
