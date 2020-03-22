
package tragamon;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Frmtragamon extends javax.swing.JFrame
{
    int inicio=0;
    int aleatorio;
    int aleatorio1;
    int aleatorio2;
    int contador=0;
    int manzana=1;
    int banana=2;
    int durazno=3;
    int frutilla=4;
    int kiwi=5;
    int mango=6;
    int manzanaverde=7;
    int pera=8;
    int sandia=9;
    int uvas=10;
    int saldo=100;
    int apuesta;
    String nombre;
    Timer temporizador;
    
    public Frmtragamon() 
    {
        this.temporizador = new Timer(100, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (saldo!=0)
                { 
                
                contador +=1;

                if (contador <= 40)
                {
                if (contador%5==0)
                {
                aleatorio = (int)(Math.random()*10+1);
                switch(aleatorio)
                {
                    case 1: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("manzana.png")));
                            break;
                    case 2: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("banano.jpg")));
                            break;
                    case 3: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("durazno.jpg")));
                            break;
                    case 4: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("frutilla.jpg")));
                            break;
                    case 5: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("kiwi.jpg")));
                            break;
                    case 6: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("mango.jpg")));
                            break;
                    case 7: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("manzana verde.jpg")));
                            break;
                    case 8: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("pera.jpg")));
                            break;
                    case 9: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("sandia.jpg")));
                            break;
                    case 10: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("uvas.jpg")));
                            break;
                        
                }
                }
                }
                
                
                if (contador <= 20)
                {
                if (contador%3==0)
                {
                aleatorio1 =(int)(Math.random()*10+1);
                
                switch(aleatorio1)
                {
                    case 1: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("manzana.png")));
                            break;
                    case 2: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("banano.jpg")));
                            break;
                    case 3: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("durazno.jpg")));
                            break;
                    case 4: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("frutilla.jpg")));
                            break;
                    case 5: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("kiwi.jpg")));
                            break;
                    case 6: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("mango.jpg")));
                            break;
                    case 7: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("manzana verde.jpg")));
                            break;
                    case 8: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("pera.jpg")));
                            break;
                    case 9: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("sandia.jpg")));
                            break;
                    case 10: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("uvas.jpg")));
                            break;
                        
                }
                }
                }
                
                
                if (contador <= 10)
        {   
                if(contador%2==0)
                {
                aleatorio2 =(int)(Math.random()*10+1);
                
                switch(aleatorio2)
                {
                    case 1: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("manzana.png")));
                            break;
                    case 2: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("banano.jpg")));
                            break;
                    case 3: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("durazno.jpg")));
                            break;
                    case 4: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("frutilla.jpg")));
                            break;
                    case 5: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("kiwi.jpg")));
                            break;
                    case 6: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("mango.jpg")));
                            break;
                    case 7: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("manzana verde.jpg")));
                            break;
                    case 8: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("pera.jpg")));
                            break;
                    case 9: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("sandia.jpg")));
                            break;
                    case 10: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("uvas.jpg")));
                            break;
                        
                }
                }
        }
                
                if (contador == 40)
                    {
                        temporizador.stop();
                        contador=0;
                        
                        if (aleatorio != aleatorio1 || aleatorio != aleatorio2)
                            {
                                saldo=saldo-apuesta;
                                txtSaldo.setText(String.valueOf(saldo));
                                
                            }
                        
                        if (aleatorio == aleatorio1 || aleatorio2 == manzana)
                            {
                                saldo=saldo+(apuesta);
                                txtSaldo.setText(String.valueOf(saldo));
                            }
                        
                        if (aleatorio1 == aleatorio2 || aleatorio == manzana )
                            {
                                saldo=saldo+(apuesta);
                                txtSaldo.setText(String.valueOf(saldo));
                            }
                        
                        if (aleatorio == aleatorio1 || aleatorio == aleatorio2)
                            {
                                saldo=saldo+(apuesta*2);
                                txtSaldo.setText(String.valueOf(saldo));
                            }
                        if (aleatorio == aleatorio1 || aleatorio == aleatorio2 || aleatorio == manzana)
                            {
                                saldo=saldo+(apuesta*3);
                                txtSaldo.setText(String.valueOf(saldo));
                            }
                        
                        
                    }
                    
                
                
            }
            }
        });
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        cbxApuesta = new javax.swing.JComboBox<String>();
        txtSaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btmjugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnJugar.setText("Perdiste todo?");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        cbxApuesta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "20", "50", "100" }));

        txtSaldo.setText("   100");
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        jLabel4.setText("    Apuesta");

        jLabel5.setText("     Saldo");

        jLabel1.setText("JUGADOR:");

        btmjugar.setText("Jugar");
        btmjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmjugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnJugar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btmjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImagen2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(lblImagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btmjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        lblNombre.setText(String.valueOf(nombre));
        saldo = 100;
        txtSaldo.setText(String.valueOf(saldo));
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/tragamon/Casino.wav"));
        sonido.play();
      
    }//GEN-LAST:event_btnJugarActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
       
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/tragamon/Casino.wav"));
        sonido.play();
        JOptionPane.showMessageDialog(null, "BIENVENIDO A CASINO QUITATODO");
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        lblNombre.setText(String.valueOf(nombre));
        aleatorio=(int)(Math.random()*10+1);
        System.out.print(aleatorio);
        
    }//GEN-LAST:event_formWindowOpened

    private void btmjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmjugarActionPerformed
        temporizador.start();
        apuesta=Integer.parseInt(cbxApuesta.getSelectedItem().toString());
        AudioClip sonido2;
        sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/tragamon/Maquina.wav"));
        sonido2.play();
        
    }//GEN-LAST:event_btmjugarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmtragamon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmtragamon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmtragamon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmtragamon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmtragamon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmjugar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JComboBox<String> cbxApuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
