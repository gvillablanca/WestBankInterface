package com.bank.ui;

import com.bank.classBank.Cliente;
import com.bank.functions.FuncionesMenu;
import java.util.ArrayList;

public class Home extends javax.swing.JFrame {
    FuncionesMenu menu = new FuncionesMenu();
    ArrayList<Cliente> clienteBanco;
    
    public Home() {
        initComponents();
    }
    
    public Home(ArrayList<Cliente> clienteBanco) {
        this.clienteBanco = clienteBanco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_bienvenida = new java.awt.Label();
        bar_menu = new javax.swing.JToolBar();
        btn_gestionar_cliente = new javax.swing.JButton();
        btn_gestionar_cuenta = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_bienvenida.setAlignment(java.awt.Label.CENTER);
        lb_bienvenida.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        lb_bienvenida.setName(""); // NOI18N
        lb_bienvenida.setText("Bienvenido");

        bar_menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bar_menu.setRollover(true);

        btn_gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/gestionar_Cliente.png"))); // NOI18N
        btn_gestionar_cliente.setText("Gestionar Cliente   ");
        btn_gestionar_cliente.setToolTipText("");
        btn_gestionar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_gestionar_cliente.setRequestFocusEnabled(false);
        btn_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionar_clienteActionPerformed(evt);
            }
        });
        bar_menu.add(btn_gestionar_cliente);

        btn_gestionar_cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/gestionarcuenta.png"))); // NOI18N
        btn_gestionar_cuenta.setText("Gestionar Cuenta   ");
        btn_gestionar_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionar_cuentaActionPerformed(evt);
            }
        });
        bar_menu.add(btn_gestionar_cuenta);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/exit.png"))); // NOI18N
        btn_salir.setText("Salir   ");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        bar_menu.add(btn_salir);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/bank.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/title_a.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/title_b.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bar_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lb_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_clienteActionPerformed
        menu.gestionarCliente(clienteBanco);
        this.dispose();              
    }//GEN-LAST:event_btn_gestionar_clienteActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_gestionar_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_cuentaActionPerformed
        menu.gestionarCuenta(clienteBanco);
        this.dispose(); 
    }//GEN-LAST:event_btn_gestionar_cuentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar bar_menu;
    private javax.swing.JButton btn_gestionar_cliente;
    private javax.swing.JButton btn_gestionar_cuenta;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label lb_bienvenida;
    // End of variables declaration//GEN-END:variables
}
