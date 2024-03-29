/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2examen2_luisenriquez;

import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Luis Enriquez
 */
public class frameMain extends javax.swing.JFrame {

    /**
     * Creates new form frameMain
     */
    public frameMain() {
        initComponents();
        jProgressBar1.setMaximum(10);
        
        Barra b = new Barra(jProgressBar1);
        
        
        
        botonEnviar.setEnabled(false);
        aU.cargarArchivo();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_chats = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        elArbol = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_amigos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_mensajes = new javax.swing.JList<>();
        tf_mensaje = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_global = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_solis = new javax.swing.JList<>();
        botonEnviar = new javax.swing.JButton();
        l_sel = new javax.swing.JLabel();
        pop_amigos = new javax.swing.JPopupMenu();
        Mensaje = new javax.swing.JMenuItem();
        Grupo = new javax.swing.JMenuItem();
        pop_global = new javax.swing.JPopupMenu();
        solicitar = new javax.swing.JMenuItem();
        pop_solis = new javax.swing.JPopupMenu();
        Aceptar = new javax.swing.JMenuItem();
        jd_registro = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        tf_regisNombre = new javax.swing.JTextField();
        tf_regisUser = new javax.swing.JTextField();
        tf_regisApellido = new javax.swing.JTextField();
        tf_regisPass = new javax.swing.JTextField();
        tf_regisTel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_loginUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ps_loginPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Chats");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Privados");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Grupos");
        treeNode1.add(treeNode2);
        elArbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(elArbol);

        jl_amigos.setModel(new DefaultListModel());
        jl_amigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_amigosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_amigos);

        jl_mensajes.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_mensajes);

        jl_global.setModel(new DefaultListModel());
        jl_global.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_globalMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_global);

        jl_solis.setModel(new DefaultListModel());
        jl_solis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_solisMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jl_solis);

        botonEnviar.setText(">");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        l_sel.setText("No hay chat seleccionado!");

        javax.swing.GroupLayout jd_chatsLayout = new javax.swing.GroupLayout(jd_chats.getContentPane());
        jd_chats.getContentPane().setLayout(jd_chatsLayout);
        jd_chatsLayout.setHorizontalGroup(
            jd_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_chatsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jd_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane5))
                .addGap(39, 39, 39)
                .addGroup(jd_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_sel)
                    .addGroup(jd_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4)
                        .addGroup(jd_chatsLayout.createSequentialGroup()
                            .addComponent(tf_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jd_chatsLayout.setVerticalGroup(
            jd_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_chatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_sel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_chatsLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jd_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEnviar)))
                    .addGroup(jd_chatsLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(jd_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        Mensaje.setText("Crear chat");
        Mensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MensajeActionPerformed(evt);
            }
        });
        pop_amigos.add(Mensaje);

        Grupo.setText("Crear Grupo");
        Grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrupoActionPerformed(evt);
            }
        });
        pop_amigos.add(Grupo);

        solicitar.setText("Enviar solicitud");
        solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarActionPerformed(evt);
            }
        });
        pop_global.add(solicitar);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        pop_solis.add(Aceptar);

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tf_regisUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_regisUserActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Usuario:");

        jLabel5.setText("Password:");

        jLabel6.setText("Telefono:");

        javax.swing.GroupLayout jd_registroLayout = new javax.swing.GroupLayout(jd_registro.getContentPane());
        jd_registro.getContentPane().setLayout(jd_registroLayout);
        jd_registroLayout.setHorizontalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registroLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tf_regisPass, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_regisApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_regisUser, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_regisNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32))
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tf_regisTel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_registroLayout.setVerticalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registroLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_regisNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_regisApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(tf_regisUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_regisPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_regisTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(33, 33, 33))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Leogram");

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_loginUser)
                                .addComponent(ps_loginPass, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ps_loginPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Login Entrar
        boolean entro = false;
        aU.cargarArchivo();
        
        for (Usuario u : aU.usuarios) {
            if (u.getUser().equals(tf_loginUser.getText()) && u.getPass().equals(ps_loginPass.getText())) {
                entro = true;
                logeado = u;
                System.out.println("logeado es "+ u);
            }  
        }
        
        DefaultListModel mod_global = (DefaultListModel) jl_global.getModel();
        DefaultListModel mod_solis = (DefaultListModel) jl_solis.getModel();
        DefaultListModel mod_amigos = (DefaultListModel) jl_amigos.getModel();
        
        if (entro) {
            for (Usuario u : aU.usuarios) {
                
                mod_global.addElement(u);
            }
                
            for (Usuario u : logeado.getSolis()) {
                mod_solis.addElement(u);
            }
            
            for (Usuario u : logeado.getAmigos()) {
                mod_amigos.addElement(u);
            }
            
            jd_chats.setModal(true);
            jd_chats.pack();
            jd_chats.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Datos incorrectos!");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MensajeActionPerformed
        // TODO add your handling code here:
        botonEnviar.setEnabled(true);
        DefaultListModel mod = (DefaultListModel) jl_amigos.getModel();
        int pos = jl_amigos.getSelectedIndex();
        
        Usuario u = (Usuario) mod.getElementAt(pos);
        seleccionado = u;
        l_sel.setText("Chat con " + seleccionado);
              
        DefaultTreeModel arbol = (DefaultTreeModel) elArbol.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arbol.getRoot();
        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) raiz.getChildAt(0);
        DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(seleccionado);
        
        nodo.add(hijo);
        
        try {
            for (Privado c : logeado.getChats()) {
                if (c.getUsuario() == seleccionado) {
                    for (Mensaje m : c.getMensajes()) {
                        mod.addElement(m);
                    }
                }
            }
        }catch(Exception e) {
            
        }
    }//GEN-LAST:event_MensajeActionPerformed

    private void jl_amigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_amigosMouseClicked
        // Click derecho en amigos
        if (evt.isMetaDown()) {
            pop_amigos.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_amigosMouseClicked

    private void solicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarActionPerformed
        // TODO add your handling code here:
        DefaultListModel mod = (DefaultListModel) jl_global.getModel();
        int pos = jl_global.getSelectedIndex();
        if (pos > -1) {
            Usuario u = (Usuario) mod.getElementAt(pos);
            System.out.println(u);
            u.solis.add(logeado);
            System.out.println(logeado);
            System.out.println(u.solis.get(u.solis.size()-1));
            aU.escribirArchivo();
            
            JOptionPane.showMessageDialog(this, "Solicitud enviada!");
        }
    }//GEN-LAST:event_solicitarActionPerformed

    private void jl_globalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_globalMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            pop_global.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_globalMouseClicked

    private void jl_solisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_solisMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            pop_solis.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_solisMouseClicked

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        DefaultListModel mod = (DefaultListModel) jl_solis.getModel();
        int pos = jl_solis.getSelectedIndex();
        
        Usuario u = (Usuario) mod.getElementAt(pos);
        
        logeado.amigos.add(u);
        u.amigos.add(logeado);
        
        logeado.solis.remove(u);
        
        mod.removeElementAt(pos);
        
        
        aU.escribirArchivo();
    }//GEN-LAST:event_AceptarActionPerformed

    private void tf_regisUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_regisUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_regisUserActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Registrar usuario
        String user, pass, nombre, apellido, telefono;
        user = tf_regisUser.getText();
        pass = tf_regisPass.getText();
        nombre = tf_regisNombre.getText();
        apellido = tf_regisApellido.getText();
        telefono = tf_regisTel.getText();
        
        aU.usuarios.add(new Usuario(user,pass,nombre,apellido,telefono));
        aU.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Registrado con exito!");
        
        tf_regisUser.setText("");
        tf_regisPass.setText("");
        tf_regisNombre.setText("");
        tf_regisApellido.setText("");
        tf_regisTel.setText("");
        
        jd_registro.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jd_registro.setModal(true);
        jd_registro.pack();
        jd_registro.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        // TODO add your handling code here:
        Barra b = new Barra(jProgressBar1);
        Thread hilo = new Thread(b);
        hilo.start();
        try {
            Mensaje e = new Mensaje(logeado + " " + tf_mensaje.getText());
            DefaultListModel modelo = (DefaultListModel) jl_mensajes.getModel();      
            modelo.addElement(e);
            Privado p = null, r = null;

            for (Privado c : logeado.chats) {
                p = c;
            }
            for (Privado c : seleccionado.chats) {
                r = c;
            }

            p.mensajes.add(e);
            r.mensajes.add(e);


            tf_mensaje.setText("");

            aU.escribirArchivo();
        }catch(Exception e) {
            //JOptionPane.showMessageDialog(this, "Hubo un error!");
        }
        
    }//GEN-LAST:event_botonEnviarActionPerformed

    private void GrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrupoActionPerformed
        // TODO add your handling code here:
        DefaultListModel mod = (DefaultListModel) jl_amigos.getModel();
        int pos = jl_amigos.getSelectedIndex();
        
        String t = JOptionPane.showInputDialog(this, "Ingrese el nombre del grupo: ");
        
        
        DefaultTreeModel arbol = (DefaultTreeModel) elArbol.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arbol.getRoot();
        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) raiz.getChildAt(1);
        DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(t);
        
        nodo.add(hijo);
        
        JOptionPane.showMessageDialog(this, "Creado con exito!");
        
        
        
    }//GEN-LAST:event_GrupoActionPerformed

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
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aceptar;
    private javax.swing.JMenuItem Grupo;
    private javax.swing.JMenuItem Mensaje;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JTree elArbol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JDialog jd_chats;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JList<String> jl_amigos;
    private javax.swing.JList<String> jl_global;
    private javax.swing.JList<String> jl_mensajes;
    private javax.swing.JList<String> jl_solis;
    private javax.swing.JLabel l_sel;
    private javax.swing.JPopupMenu pop_amigos;
    private javax.swing.JPopupMenu pop_global;
    private javax.swing.JPopupMenu pop_solis;
    private javax.swing.JPasswordField ps_loginPass;
    private javax.swing.JMenuItem solicitar;
    private javax.swing.JTextField tf_loginUser;
    private javax.swing.JTextField tf_mensaje;
    private javax.swing.JTextField tf_regisApellido;
    private javax.swing.JTextField tf_regisNombre;
    private javax.swing.JTextField tf_regisPass;
    private javax.swing.JTextField tf_regisTel;
    private javax.swing.JTextField tf_regisUser;
    // End of variables declaration//GEN-END:variables
    adminUsers aU = new adminUsers("./Users.leo");
    Usuario logeado = null;
    Usuario seleccionado = null;
}
