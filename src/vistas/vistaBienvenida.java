/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import rmiservidor.Interfaz;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author arelm
 */
public class vistaBienvenida extends javax.swing.JFrame implements KeyListener{
    String nomUsu;
    Interfaz chat;
    List<String> usuarios = new ArrayList<>();
   
    //Crear nuevo formulario binevenida
    public vistaBienvenida(Interfaz chat) { //para mantener el paso del parámetro "chat"
        initComponents(); //Inicializa los componentes del jframe
        this.chat = chat;
        nomusuario.addKeyListener(this);
        setVisible(true);
        setLocationRelativeTo(null);
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
        nomusuario = new javax.swing.JTextField();
        botonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(224, 187, 228));

        jPanel1.setBackground(new java.awt.Color(224, 187, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Introduzca su nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 250, -1));

        nomusuario.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        nomusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(nomusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, 30));

        botonIniciar.setBackground(new java.awt.Color(149, 125, 173));
        botonIniciar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        botonIniciar.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciar.setText("Iniciar");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        iniciousuario();
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void nomusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomusuarioActionPerformed

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
            java.util.logging.Logger.getLogger(vistaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomusuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {  //evento clave en el textfield
            iniciousuario();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    private void iniciousuario() {
     nomUsu = nomusuario.getText();
        try {
            usuarios = chat.getTodosUsu();
        } catch (RemoteException ex) {
            Logger.getLogger(vistaBienvenida.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (usuarios.contains(nomUsu)) {
            JOptionPane.showMessageDialog(null, "Este usuario ya existe");
            System.exit(0);
        } else {
            try {
                new VistaChat(chat, nomUsu);   // pasar la referencia "chat" y el nombre del usuario registrado
            } catch (RemoteException ex) {      //y crearlo en VistaChat
                Logger.getLogger(vistaBienvenida.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
        }
    }
}
