
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


/**
* Al pulsar los botones de radio se habilitaran/deshabilitaran los correspondientes panales.
* Al pulsar "dar de alta" se crea en la base de datos un corredor con los datos correspondientes.
* 
 Añade una propiedad a la ventana que sea el Entity Manager.
 * En el constructor te conectas a la unidad de persistencia.
 * En el evento WindowCLosing se cierra la conexion con el EntityManager
 */
public class frmAltaCorredor extends javax.swing.JFrame {
    
    private EntityManager em;

    /**
     * Creates new form frmAltaCorredor
     */
    public frmAltaCorredor() {
        initComponents();
        setLocationRelativeTo(null);
      habilitarPanelAmateur();
      habilitarPanelProfesional();
        
    }
    
    private void habilitarPanelAmateur(){
        if(pnlAmateur.isEnabled() && txtExperiencia.isEnabled() && txtVelocidadMedia.isEnabled()){
            pnlAmateur.setEnabled(false);
            txtExperiencia.setEnabled(false);
            txtVelocidadMedia.setEnabled(false);
            lblExperiencia.setEnabled(false);
            lblVelocidadMedia.setEnabled(false);
        }
        
    }
    
    private void habilitarPanelProfesional(){
        if(pnlProfesional.isEnabled() && txtTrofeos.isEnabled() && txtClub.isEnabled()){
            pnlProfesional.setEnabled(false);
            txtTrofeos.setEnabled(false);
            txtClub.setEnabled(false);
            lblClub.setEnabled(false);
            lblNumeroTrofeos.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCorredor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        optAmateur = new javax.swing.JRadioButton();
        optProfesional = new javax.swing.JRadioButton();
        optSinEspecificar = new javax.swing.JRadioButton();
        pnlAmateur = new javax.swing.JPanel();
        lblVelocidadMedia = new javax.swing.JLabel();
        txtVelocidadMedia = new javax.swing.JTextField();
        lblExperiencia = new javax.swing.JLabel();
        txtExperiencia = new javax.swing.JTextField();
        pnlProfesional = new javax.swing.JPanel();
        lblNumeroTrofeos = new javax.swing.JLabel();
        txtTrofeos = new javax.swing.JTextField();
        lblClub = new javax.swing.JLabel();
        txtClub = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nombre del corredor: ");

        jLabel2.setText("Fecha de Nacimiento: ");

        jLabel3.setText("Tipo de corredor:");

        btnGrupo.add(optAmateur);
        optAmateur.setText("Amateur");
        optAmateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAmateurActionPerformed(evt);
            }
        });

        btnGrupo.add(optProfesional);
        optProfesional.setText("Profesional");
        optProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optProfesionalActionPerformed(evt);
            }
        });

        btnGrupo.add(optSinEspecificar);
        optSinEspecificar.setText("Sin especificar");
        optSinEspecificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optSinEspecificarActionPerformed(evt);
            }
        });

        pnlAmateur.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de corredor Amateur"));

        lblVelocidadMedia.setText("Velocidad media: ");

        lblExperiencia.setText("Años de experiencia");

        javax.swing.GroupLayout pnlAmateurLayout = new javax.swing.GroupLayout(pnlAmateur);
        pnlAmateur.setLayout(pnlAmateurLayout);
        pnlAmateurLayout.setHorizontalGroup(
            pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmateurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAmateurLayout.createSequentialGroup()
                        .addComponent(lblVelocidadMedia)
                        .addGap(18, 18, 18)
                        .addComponent(txtVelocidadMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAmateurLayout.createSequentialGroup()
                        .addComponent(lblExperiencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlAmateurLayout.setVerticalGroup(
            pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmateurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocidadMedia)
                    .addComponent(txtVelocidadMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExperiencia)
                    .addComponent(txtExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnlProfesional.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de corredor Profesional"));

        lblNumeroTrofeos.setText("Numero de trofeos: ");

        lblClub.setText("Club:");

        javax.swing.GroupLayout pnlProfesionalLayout = new javax.swing.GroupLayout(pnlProfesional);
        pnlProfesional.setLayout(pnlProfesionalLayout);
        pnlProfesionalLayout.setHorizontalGroup(
            pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfesionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNumeroTrofeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTrofeos)
                    .addComponent(txtClub, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlProfesionalLayout.setVerticalGroup(
            pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfesionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroTrofeos)
                    .addComponent(txtTrofeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClub)
                    .addComponent(txtClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAlta.setText("Dar de Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlAmateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optAmateur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(optProfesional)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(optSinEspecificar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtNombreCorredor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAlta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(optAmateur)
                    .addComponent(optProfesional)
                    .addComponent(optSinEspecificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAmateur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optAmateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAmateurActionPerformed
        // TODO add your handling code here:
        pnlAmateur.setEnabled(true);
        txtExperiencia.setEnabled(true);
        txtVelocidadMedia.setEnabled(true);
        lblExperiencia.setEnabled(true);
        lblVelocidadMedia.setEnabled(true);
        habilitarPanelProfesional();
    }//GEN-LAST:event_optAmateurActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

    private void optProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optProfesionalActionPerformed
        // TODO add your handling code here:
        pnlProfesional.setEnabled(true);
        txtTrofeos.setEnabled(true);
        txtClub.setEnabled(true);
        lblNumeroTrofeos.setEnabled(true);
        lblClub.setEnabled(true);
        
        habilitarPanelAmateur();
    }//GEN-LAST:event_optProfesionalActionPerformed

    private void optSinEspecificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optSinEspecificarActionPerformed
        // TODO add your handling code here:
        habilitarPanelAmateur();
        habilitarPanelProfesional();
    }//GEN-LAST:event_optSinEspecificarActionPerformed

    private void crearCorredorAmateur(){
              
            em = Persistence.createEntityManagerFactory("CORREDOR").createEntityManager();
            LocalDate fechaN = LocalDate.parse(txtFechaNac.getText());
            CorredorAmateur cA = new CorredorAmateur(txtNombreCorredor.getText(),fechaN,
                    Integer.parseInt(txtExperiencia.getText()), Integer.parseInt(txtExperiencia.getText()));
            em.getTransaction().begin();
            em.persist(cA);
            em.getTransaction().commit();
        
    }
    
    private void crearCorredorProfesional(){
            em = Persistence.createEntityManagerFactory("CORREDOR").createEntityManager();
            LocalDate fechaN = LocalDate.parse(txtFechaNac.getText());
            CorredorProfesional cP = new CorredorProfesional(txtNombreCorredor.getText(),fechaN,
                    Integer.parseInt(txtTrofeos.getText()),txtClub.getText());
            em.getTransaction().begin();
            em.persist(cP);
            em.getTransaction().commit();
    }
    private void crearCorredor(){
         em = Persistence.createEntityManagerFactory("CORREDOR").createEntityManager();
            LocalDate fechaN = LocalDate.parse(txtFechaNac.getText());
            Corredor c = new Corredor(txtNombreCorredor.getText(),fechaN);
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
    }
    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        // TODO add your handling code here:
         if(pnlAmateur.isEnabled()){
             crearCorredorAmateur();
         }else if(pnlProfesional.isEnabled()){
             crearCorredorProfesional();
         }else if(!pnlAmateur.isEnabled() && !pnlProfesional.isEnabled()){
             crearCorredor();
         }else{
             JOptionPane.showMessageDialog(this, "No has seleccionado un tipo de corredor",
                     "Tipo de corredor??",JOptionPane.ERROR_MESSAGE);
         }
 
    }//GEN-LAST:event_btnAltaActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmAltaCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAltaCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAltaCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAltaCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAltaCorredor().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblClub;
    private javax.swing.JLabel lblExperiencia;
    private javax.swing.JLabel lblNumeroTrofeos;
    private javax.swing.JLabel lblVelocidadMedia;
    private javax.swing.JRadioButton optAmateur;
    private javax.swing.JRadioButton optProfesional;
    private javax.swing.JRadioButton optSinEspecificar;
    private javax.swing.JPanel pnlAmateur;
    private javax.swing.JPanel pnlProfesional;
    private javax.swing.JTextField txtClub;
    private javax.swing.JTextField txtExperiencia;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombreCorredor;
    private javax.swing.JTextField txtTrofeos;
    private javax.swing.JTextField txtVelocidadMedia;
    // End of variables declaration//GEN-END:variables
}
