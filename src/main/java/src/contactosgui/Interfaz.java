/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.contactosgui;

import src.datos.*;
import java.util.ArrayList;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 700));

        jPanel2.setBackground(new java.awt.Color(40, 48, 64));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 700));

        jButton1.setBackground(new java.awt.Color(163, 191, 217));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("Nuevo Contacto");
        jButton1.setActionCommand("crear");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(40, 48, 64));
        jPanel1.setLayout(new java.awt.GridLayout(7, 0, 0, 5));

        jTextField1.setBackground(new java.awt.Color(40, 48, 64));
        jTextField1.setForeground(new java.awt.Color(163, 191, 217));
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setHighlighter(null);
        jTextField1.setPreferredSize(new java.awt.Dimension(300, 30));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(163, 191, 217));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(163, 191, 217));
        jLabel1.setText("Bienvenido a tus contactos Ecomun");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(163, 191, 217));
        jLabel2.setText("Digite el nombre del contacto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Creando los paneles en donde se visualizan los contactos y las opciones de manejo (editar y borrar)
    private void crearPanelContacto(Contacto cont){
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(new java.awt.Color(163,191,217),1));
        
        Insets ins = new Insets(0,10,0,0);
        
        panel.setBackground(new java.awt.Color(40, 48, 64));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        
        JLabel nombre = new JLabel(cont.getNombre());
        nombre.setForeground(new java.awt.Color(163,191,217));
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = ins;
        c.anchor = GridBagConstraints.LINE_START;
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.add(nombre, c);
        
        
        
        JButton editar = new JButton();
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource(("/src/contactosgui/icons8-edit-24.png"))));
        c.weightx = 0.1;
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_END;
        editar.setBackground(Color.white);
        editar.setBorder(BorderFactory.createLineBorder((new java.awt.Color(40,48,64)),4));
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      
        panel.add(editar, c);
        
      
        
        JButton eliminar = new JButton();
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/contactosgui/icons8-delete-24.png")));
        c.weightx = 0.1;
        c.gridx = 2;
        c.gridy = 0;
       
        c.anchor = GridBagConstraints.LINE_END;
        eliminar.setBackground(Color.white);
        eliminar.setBorder(BorderFactory.createLineBorder((new java.awt.Color(40,48,64)),4));
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.add(eliminar, c);
        
        
        // Eventos
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                new VerContactos(cont).show();
            }
        });

        // Evento que crea una nueva pestaña que permite editar un contacto
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                new EditarContacto(cont).show();
            }
        });
        
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminarContacto(evt, cont);
            }
        });
        
        
        jPanel1.add(panel);
        
        jPanel1.updateUI();
       
    }


    // Evento que permite eliminar un contacto
    private void eliminarContacto(java.awt.event.MouseEvent evt, Contacto cont){

        Serializando.manejandoContacto(cont, "borrar");
        
        recargar();
        
        JOptionPane.showMessageDialog(this, "Contacto eliminado",
             "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
   
    public static void recargar(){
        // Recargando la interfaz principal, para poder actualizar los datos

        jPanel1.removeAll();
        jPanel1.invalidate();
        jPanel1.validate();
        jPanel1.repaint();
        
        jTextField1.invalidate();
        jTextField1.validate();
        jTextField1.repaint();
        
        
    }
    
    private String substr = "";
    
    // Sistema de busueda de contactos
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

        ArrayList<Contacto> contactosActuales = Serializando.cargandoContactos();

        
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
        
        for (Contacto cont: contactosActuales){
            if (cont.getNombre().toLowerCase().contains(substr.toLowerCase()) && !(substr.equals(""))){
                crearPanelContacto(cont);
            }
        }

        if (jPanel1.getComponentCount() == 0){
            jPanel1.setVisible(false);
        }
        
    }//GEN-LAST:event_jTextField1KeyPressed

    // Evento que crea una nueva pestaña que permite crear un nuevo contacto
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
