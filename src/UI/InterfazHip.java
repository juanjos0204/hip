/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

/**
 *
 * @author 27
 */
public class InterfazHip extends javax.swing.JFrame {

    /**
     * Creates new form InterfazHip
     */
    public InterfazHip() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Boton_Exit = new javax.swing.JMenuItem();
        Modulos = new javax.swing.JMenu();
        Boton_Area_Circulo = new javax.swing.JMenuItem();
        Boton_Hipotenusa = new javax.swing.JMenuItem();
        Ver_Acerca = new javax.swing.JMenu();
        Boton_Acerca_de = new javax.swing.JMenuItem();

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane2.setViewportView(jTextArea4);

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENÚ PRINCIPAL");

        jLabel1.setText("Por favor ingrese a Ver Modulos para seleccionar una operación");

        jLabel2.setText("usted es un sopenco");

        Archivo.setText("Archivo");
        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        Boton_Exit.setText("Salir");
        Boton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ExitActionPerformed(evt);
            }
        });
        Archivo.add(Boton_Exit);

        jMenuBar1.add(Archivo);

        Modulos.setText("Ver Modulo");
        Modulos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ModulosItemStateChanged(evt);
            }
        });

        Boton_Area_Circulo.setText("Calcular Area Circulo");
        Modulos.add(Boton_Area_Circulo);

        Boton_Hipotenusa.setText("Calcular Hipotenusa");
        Boton_Hipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_HipotenusaActionPerformed(evt);
            }
        });
        Modulos.add(Boton_Hipotenusa);

        jMenuBar1.add(Modulos);

        Ver_Acerca.setText("Ver Acerca");

        Boton_Acerca_de.setText("Ver Acerca de");
        Ver_Acerca.add(Boton_Acerca_de);

        jMenuBar1.add(Ver_Acerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel2)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArchivoActionPerformed

    private void ModulosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ModulosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ModulosItemStateChanged

    private void Boton_HipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_HipotenusaActionPerformed
       Hipotenusa obj= new Hipotenusa();
       obj.setVisible(true);
        
    }//GEN-LAST:event_Boton_HipotenusaActionPerformed

    private void Boton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ExitActionPerformed
System.exit(0);
    }//GEN-LAST:event_Boton_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazHip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazHip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazHip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazHip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazHip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuItem Boton_Acerca_de;
    private javax.swing.JMenuItem Boton_Area_Circulo;
    private javax.swing.JMenuItem Boton_Exit;
    private javax.swing.JMenuItem Boton_Hipotenusa;
    private javax.swing.JMenu Modulos;
    private javax.swing.JMenu Ver_Acerca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
