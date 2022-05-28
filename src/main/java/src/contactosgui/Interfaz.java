/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.contactosgui;

import java.awt.GridLayout;
import javax.swing.JButton;
import src.datos.*;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;


/**
 *
 * @author dimel
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setHighlighter(null);
        jTextField1.setPreferredSize(new java.awt.Dimension(300, 25));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(10, 1));

        jButton1.setText("Crear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void crearPanelContacto(Contacto cont){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        JButton editar = new JButton("Editar");
        JButton eliminar = new JButton("Eliminar");
        JLabel nombre = new JLabel(cont.getNombre());
        
        // Eventos
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editarContacto(evt, cont);
            }
        });
        
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminarContacto(evt, cont);
            }
        });
        
        panel.add(nombre);
        panel.add(editar);
        panel.add(eliminar);
        jPanel1.add(panel);
        
        jPanel1.updateUI();
       
    }
                
    private void editarContacto(java.awt.event.MouseEvent evt, Contacto cont){
        new EditarContacto(cont).show();
    }
    
    private void eliminarContacto(java.awt.event.MouseEvent evt, Contacto cont){
        
        int r = -1;
        
        for (Contacto c : datos){
            if (c.getNombre().equals(cont.getNombre())){
                r = datos.indexOf(c);
            }
        }
        
        try {
            datos.remove(r);
        } catch(Exception e){
            
        }
        
        recargar();
        
        JOptionPane.showMessageDialog(this, "Contacto eliminado",
             "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
   
    public static void recargar(){
        jPanel1.removeAll();
        jPanel1.invalidate();
        jPanel1.validate();
        jPanel1.repaint();
        
        jTextField1.invalidate();
        jTextField1.validate();
        jTextField1.repaint();
        
        
    }
    
    private String substr = "";
    
    static private ArrayList<Contacto> datos = Ejemplo.contactos();
    
    public static void setNuevoContacto(Contacto cont){
        datos.add(cont);
    }
    
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        
        
        jPanel1.setVisible(true);
        jPanel1.removeAll();
        
        try {
            if(evt.getKeyCode() == 8) {
                substr = substr.substring(0,substr.length()-1);
                
            } else if(evt.isActionKey() || evt.getKeyCode() < 32){
                
            } else {
                substr += evt.getKeyChar();
            }
            
        } catch (Exception e){

        }
        
        for (Contacto cont: datos){
            if (cont.getNombre().toLowerCase().contains(substr.toLowerCase()) && !(substr.equals(""))){
                
                crearPanelContacto(cont);
            }
        }

        if (jPanel1.getComponentCount() == 0){
            jPanel1.setVisible(false);
        }
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        new CrearContacto().show();
        
    }//GEN-LAST:event_jButton1MousePressed

    
       
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
