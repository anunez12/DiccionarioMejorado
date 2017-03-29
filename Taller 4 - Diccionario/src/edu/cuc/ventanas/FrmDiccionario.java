/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.ventanas;

import edu.cuc.palabras.Diccionario;
import edu.cuc.palabras.LongitudIncorrectaException;
import edu.cuc.palabras.Palabra;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alexisdelahoz
 */
public class FrmDiccionario extends javax.swing.JFrame {

    private Palabra palabraNueva;
    private Diccionario diccionarioActual = new Diccionario();
    
    /**
     * Creates new form FrmDiccionario
     */
    public FrmDiccionario() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        cmdIngresarPalabra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSignificado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPalabras = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Creacion De Palabra Con Su Significado");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Palabra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Ingrese palabra: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 38, -1, -1));

        txtPalabra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPalabra.setOpaque(false);
        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });
        txtPalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPalabraKeyTyped(evt);
            }
        });
        jPanel1.add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 476, -1));

        cmdIngresarPalabra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cuc/ventanas/1490809916_Close.png"))); // NOI18N
        cmdIngresarPalabra.setToolTipText("");
        cmdIngresarPalabra.setBorderPainted(false);
        cmdIngresarPalabra.setContentAreaFilled(false);
        cmdIngresarPalabra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdIngresarPalabraMouseMoved(evt);
            }
        });
        cmdIngresarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarPalabraActionPerformed(evt);
            }
        });
        jPanel1.add(cmdIngresarPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Ingrese significado: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 67, -1, -1));

        txtSignificado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSignificado.setOpaque(false);
        txtSignificado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSignificadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSignificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 64, 476, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 96));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbPalabras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Palabra", "Significado", "Cant. Sinonimos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPalabras.setOpaque(false);
        tbPalabras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPalabrasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPalabras);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 650, 320));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 687, 390));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cuc/ventanas/Library-indoor-close-up_1366x768.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        introducirPalabra();
    }//GEN-LAST:event_txtPalabraActionPerformed

    private void cmdIngresarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarPalabraActionPerformed
       if(txtPalabra.getText().trim().isEmpty()){ 
        JOptionPane.showMessageDialog(this,"Ingrese Palabra","Error",JOptionPane.ERROR_MESSAGE); 
        txtPalabra.requestFocusInWindow();
       }else if(txtSignificado.getText().trim().isEmpty()){ 
        JOptionPane.showMessageDialog(this,"Debe Ingresar El Significado De La Palabra Ingresada Para Poder Continuar","Error",JOptionPane.ERROR_MESSAGE);
        txtSignificado.requestFocusInWindow();
       }else{
        introducirPalabra(); 
       }  
    }//GEN-LAST:event_cmdIngresarPalabraActionPerformed

    private void tbPalabrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPalabrasMouseClicked
        // Edicion de Palabra
        int row = tbPalabras.rowAtPoint(evt.getPoint());
        int col = tbPalabras.columnAtPoint(evt.getPoint());
        String textoPalabra = (String) tbPalabras.getValueAt(row, 0);
        Palabra palabraSeleccionada = diccionarioActual.buscarPalabra(textoPalabra);
        FrmPalabrasDialogo diag = new FrmPalabrasDialogo(this, palabraSeleccionada, true);
        diag.setLocationRelativeTo(this);
        diag.setVisible(true);
        //Actualizar tabla
        tbPalabras.setModel(diccionarioActual.getListSinonimos());
    }//GEN-LAST:event_tbPalabrasMouseClicked

    private void cmdIngresarPalabraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdIngresarPalabraMouseMoved
       
        String Crear_Palabra = "Boton Para Agregar Palabra Nueva Con Su Significado"; 
        cmdIngresarPalabra.setToolTipText(Crear_Palabra);    
    }//GEN-LAST:event_cmdIngresarPalabraMouseMoved

    private void txtPalabraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPalabraKeyTyped
       
        char c = evt.getKeyChar(); 
        
        if(!Character.isLetter(c)){ 
          getToolkit();
          evt.consume();  
        }
    }//GEN-LAST:event_txtPalabraKeyTyped

    private void txtSignificadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSignificadoKeyTyped
         
        char c = evt.getKeyChar(); 
        
        if(!Character.isLetter(c)&&!Character.isSpaceChar(c)){ 
          getToolkit(); 
          evt.consume();  
        }
    }//GEN-LAST:event_txtSignificadoKeyTyped

    private void introducirPalabra() throws HeadlessException {
        try {
            //Crear palabra
            palabraNueva = new Palabra(txtPalabra.getText(), txtSignificado.getText());
            //Limpiar la caja
            txtPalabra.setText(null);
            txtSignificado.setText(null);
            // Adicionar palabra al diccionario
            diccionarioActual.adicionarPalabra(palabraNueva);
            //Actualizar tabla
            tbPalabras.setModel(diccionarioActual.getListSinonimos());
            JOptionPane.showMessageDialog(this,
                    "Palabra ingresada!",
                    "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (LongitudIncorrectaException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FrmPalabras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(FrmDiccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDiccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDiccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDiccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDiccionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdIngresarPalabra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPalabras;
    private javax.swing.JTextField txtPalabra;
    private javax.swing.JTextField txtSignificado;
    // End of variables declaration//GEN-END:variables
}