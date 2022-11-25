package bank.gestionarCliente;

import bank.classBank.Cliente;
import bank.classBank.Cuenta;
import bank.functions.funcionesBanco;
import bank.westbankinterface.Home;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionarCliente extends javax.swing.JFrame {
    List<Cliente> clienteBanco = new LinkedList<>();
           
    String rut = new String();
    String nombre = new String();
    String apellidoPaterno = new String();
    String apellidoMaterno = new String();
    String domicilio = new String();
    String comuna = new String();
    String telefono = new String();
    String numeroCuenta = new String();
    String tipoCuenta = new String();
    int saldo = 0;
    
    public GestionarCliente() {
        initComponents();
        setLocationRelativeTo(null);
        jp_registrar_cliente.setVisible(false);
        jp_ver_datos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btn_registrar_cliente_m = new javax.swing.JButton();
        btn_ver_datos_m = new javax.swing.JButton();
        btn_inicio_m = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jp_registrar_cliente = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_validar_rut = new javax.swing.JButton();
        txf_rut = new javax.swing.JTextField();
        jp_formulario_cliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txf_telefono = new javax.swing.JTextField();
        txf_comuna = new javax.swing.JTextField();
        txf_direccion = new javax.swing.JTextField();
        txf_apMaterno = new javax.swing.JTextField();
        txf_apPaterno = new javax.swing.JTextField();
        txf_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_crear_cliente = new javax.swing.JButton();
        btn_validar_datos = new javax.swing.JButton();
        jp_numero_cuenta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txf_numeroCuenta = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cb_cuenta = new javax.swing.JComboBox<>();
        jp_ver_datos = new javax.swing.JPanel();
        txf_rut_datos = new javax.swing.JTextField();
        btn_validar_rut1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jp_formulario_datos = new javax.swing.JPanel();
        btn_nueva_consulta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lb_rut = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_aPaterno = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_aMaterno = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_direccion = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lb_comuna = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lb_telefono = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        lb_numeroCuenta = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lb_saldo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lb_tipoCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 523));

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        btn_registrar_cliente_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/img/add_client.png"))); // NOI18N
        btn_registrar_cliente_m.setText("Registrar Cliente");
        btn_registrar_cliente_m.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar_cliente_m.setFocusable(false);
        btn_registrar_cliente_m.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_registrar_cliente_m.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_registrar_cliente_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_cliente_mActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_registrar_cliente_m);

        btn_ver_datos_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/img/client_data.png"))); // NOI18N
        btn_ver_datos_m.setText(" Ver datos cliente");
        btn_ver_datos_m.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ver_datos_m.setFocusable(false);
        btn_ver_datos_m.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ver_datos_m.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ver_datos_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_datos_mActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_ver_datos_m);

        btn_inicio_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/img/home.png"))); // NOI18N
        btn_inicio_m.setText("      Volver Inicio      ");
        btn_inicio_m.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inicio_m.setFocusable(false);
        btn_inicio_m.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_inicio_m.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_inicio_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_mActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_inicio_m);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/img/exit.png"))); // NOI18N
        btn_salir.setText("         Salir        ");
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setFocusable(false);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_salir);

        jp_registrar_cliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jp_registrar_cliente.setEnabled(false);

        jLabel9.setText("Ingrese rut de usuario sin punto ni guiones");

        btn_validar_rut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/img/search.png"))); // NOI18N
        btn_validar_rut.setText("Validar rut");
        btn_validar_rut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_validar_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validar_rutActionPerformed(evt);
            }
        });

        txf_rut.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txf_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_rutActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        txf_telefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txf_comuna.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txf_direccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txf_apMaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txf_apPaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txf_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        jLabel4.setText("Domicilio");

        jLabel5.setText("Comuna");

        jLabel6.setText("Telefono");

        btn_crear_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/img/salvar.png"))); // NOI18N
        btn_crear_cliente.setText("Crear Cliente");
        btn_crear_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crear_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_clienteActionPerformed(evt);
            }
        });

        btn_validar_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/img/finalizar.png"))); // NOI18N
        btn_validar_datos.setText("Validar datos");
        btn_validar_datos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_validar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validar_datosActionPerformed(evt);
            }
        });

        jp_numero_cuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Numero de Cuenta");

        txf_numeroCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel18.setText("Cuenta");

        cb_cuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo de cuenta", "Cuenta Corriente", "Cuenta Vista", "Cuenta Ahorro" }));
        cb_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_cuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_numero_cuentaLayout = new javax.swing.GroupLayout(jp_numero_cuenta);
        jp_numero_cuenta.setLayout(jp_numero_cuentaLayout);
        jp_numero_cuentaLayout.setHorizontalGroup(
            jp_numero_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_numero_cuentaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jp_numero_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jp_numero_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jp_numero_cuentaLayout.setVerticalGroup(
            jp_numero_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_numero_cuentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_numero_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_numero_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_formulario_clienteLayout = new javax.swing.GroupLayout(jp_formulario_cliente);
        jp_formulario_cliente.setLayout(jp_formulario_clienteLayout);
        jp_formulario_clienteLayout.setHorizontalGroup(
            jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_formulario_clienteLayout.createSequentialGroup()
                .addGap(0, 220, Short.MAX_VALUE)
                .addComponent(btn_validar_datos)
                .addGap(26, 26, 26)
                .addComponent(btn_crear_cliente)
                .addGap(108, 108, 108))
            .addGroup(jp_formulario_clienteLayout.createSequentialGroup()
                .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_formulario_clienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_apPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txf_telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(txf_comuna, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txf_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txf_apMaterno, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jp_formulario_clienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jp_numero_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_formulario_clienteLayout.setVerticalGroup(
            jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_formulario_clienteLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_apPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_apMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_numero_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_formulario_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_validar_datos)
                    .addComponent(btn_crear_cliente))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jp_registrar_clienteLayout = new javax.swing.GroupLayout(jp_registrar_cliente);
        jp_registrar_cliente.setLayout(jp_registrar_clienteLayout);
        jp_registrar_clienteLayout.setHorizontalGroup(
            jp_registrar_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_registrar_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_registrar_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_registrar_clienteLayout.createSequentialGroup()
                        .addComponent(txf_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_validar_rut)))
                .addContainerGap(209, Short.MAX_VALUE))
            .addComponent(jp_formulario_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_registrar_clienteLayout.setVerticalGroup(
            jp_registrar_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_registrar_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addGroup(jp_registrar_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_validar_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_formulario_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jp_ver_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txf_rut_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_rut_datosActionPerformed(evt);
            }
        });

        btn_validar_rut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/img/search.png"))); // NOI18N
        btn_validar_rut1.setText("Validar rut");
        btn_validar_rut1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_validar_rut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validar_rut1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Ingrese rut de usuario sin punto ni guiones");

        jp_formulario_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_nueva_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/img/novo.png"))); // NOI18N
        btn_nueva_consulta.setText("Nueva Consulta");
        btn_nueva_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueva_consultaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("Rut");

        jLabel8.setText("Nombre");

        jLabel11.setText("Apellido Paterno");

        jLabel12.setText("Apellido Materno");

        jLabel13.setText("Dirección");

        jLabel14.setText("Comuna");

        jLabel15.setText("Telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(lb_comuna, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_aMaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_aPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_rut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lb_rut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lb_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_aPaterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lb_aMaterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lb_direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lb_comuna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lb_telefono))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setText("Numero de Cuenta");

        jLabel17.setText("Saldo");

        jLabel19.setText("Tipo Cuenta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_tipoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_numeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lb_numeroCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lb_tipoCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lb_saldo))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_formulario_datosLayout = new javax.swing.GroupLayout(jp_formulario_datos);
        jp_formulario_datos.setLayout(jp_formulario_datosLayout);
        jp_formulario_datosLayout.setHorizontalGroup(
            jp_formulario_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_formulario_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_formulario_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_formulario_datosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jp_formulario_datosLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btn_nueva_consulta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jp_formulario_datosLayout.setVerticalGroup(
            jp_formulario_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_formulario_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_formulario_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_formulario_datosLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_nueva_consulta)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_ver_datosLayout = new javax.swing.GroupLayout(jp_ver_datos);
        jp_ver_datos.setLayout(jp_ver_datosLayout);
        jp_ver_datosLayout.setHorizontalGroup(
            jp_ver_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ver_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_ver_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_formulario_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_ver_datosLayout.createSequentialGroup()
                        .addGroup(jp_ver_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_ver_datosLayout.createSequentialGroup()
                                .addComponent(txf_rut_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btn_validar_rut1))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_ver_datosLayout.setVerticalGroup(
            jp_ver_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ver_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(8, 8, 8)
                .addGroup(jp_ver_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_rut_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_validar_rut1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_formulario_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_registrar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_ver_datos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_registrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_ver_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txf_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_rutActionPerformed
        if(txf_rut.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese rut para validación", "Advertencia", JOptionPane.OK_OPTION);
            txf_rut.setEnabled(true);
        }
        else{
            if(funcionesBanco.isNumeric(txf_rut.getText())){
                if(txf_rut.getText().length() < 8 || txf_rut.getText().length() > 9){
                    JOptionPane.showMessageDialog(null, "Ingresar rut valido sin puntos ni guiones", "Advertencia", JOptionPane.OK_OPTION);
                    txf_rut.setEnabled(true);
                }
                else{
                    rut = funcionesBanco.checkRut(txf_rut.getText());
                    jp_formulario_cliente.setVisible(true);
                    txf_rut.setEnabled(false);
                }   
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingresar valor numerico, recuerde que el rut debe ir sin puntos ni guiones", "Advertencia", JOptionPane.OK_OPTION);
                txf_rut.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txf_rutActionPerformed
       
    private void btn_validar_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validar_rutActionPerformed
        if(txf_rut.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese rut para validación", "Advertencia", JOptionPane.OK_OPTION);
            txf_rut.setEnabled(true);
        }
        else{
            if(funcionesBanco.isNumeric(txf_rut.getText())){
                if(txf_rut.getText().length() < 8 || txf_rut.getText().length() > 9){
                    JOptionPane.showMessageDialog(null, "Ingresar rut valido sin puntos ni guiones", "Advertencia", JOptionPane.OK_OPTION);
                    txf_rut.setEnabled(true);
                }
                else{
                    rut = funcionesBanco.checkRut(txf_rut.getText());
                    jp_formulario_cliente.setVisible(true);
                    txf_rut.setEnabled(false);
                }   
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingresar valor numerico, recuerde que el rut debe ir sin puntos ni guiones", "Advertencia", JOptionPane.OK_OPTION);
                txf_rut.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btn_validar_rutActionPerformed

    private void txf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nombreActionPerformed
        
    }//GEN-LAST:event_txf_nombreActionPerformed

    private void btn_crear_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_clienteActionPerformed
        if(txf_numeroCuenta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese numero de cuenta para crear cliente", "Advertencia", JOptionPane.OK_OPTION);
        }
        else{
            if(funcionesBanco.isNumeric(txf_numeroCuenta.getText())){
                if(txf_numeroCuenta.getText().length() < 9 || txf_numeroCuenta.getText().length() <= 0 || cb_cuenta.getSelectedItem().equals("Seleccione tipo de cuenta")){
                    JOptionPane.showMessageDialog(null, "Ingrese numero de cuenta valido o seleccione tipo de cuenta valido", "Advertencia", JOptionPane.OK_OPTION);
                }
                else{
                    Cliente cliente = new Cliente();
                    Cuenta cuenta = new Cuenta();
                    
                    tipoCuenta = cb_cuenta.getSelectedItem().toString();
                    numeroCuenta = txf_numeroCuenta.getText();
                    cliente.setRut(rut);
                    cliente.setNombre(nombre.toUpperCase());
                    cliente.setApellidoPaterno(apellidoPaterno.toUpperCase());
                    cliente.setApellidoMaterno(apellidoMaterno.toUpperCase());
                    cliente.setDomicilio(domicilio.toUpperCase());
                    cliente.setComuna(comuna.toUpperCase());
                    cliente.setTelefono(telefono);                    
                    cuenta.setNumeroCuenta(Integer.parseInt(numeroCuenta));
                    cuenta.setSaldo(saldo);
                    cuenta.setTipoCuenta(numeroCuenta);
                    cliente.setCuenta(cuenta);
                    clienteBanco.add(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente Creado exitosamente!", "Información", JOptionPane.INFORMATION_MESSAGE);
                    txf_rut.setText(""); txf_nombre.setText(""); txf_apPaterno.setText(""); txf_apMaterno.setText("");txf_direccion.setText(""); txf_comuna.setText(""); txf_telefono.setText(""); txf_numeroCuenta.setText("");
                    jp_formulario_cliente.setVisible(false);
                    jp_numero_cuenta.setVisible(false);
                    txf_rut.setEnabled(true);
                }                
            }
            else{
               JOptionPane.showMessageDialog(null, "Ingresar valor numerico", "Advertencia", JOptionPane.OK_OPTION); 
            }            
        }
    }//GEN-LAST:event_btn_crear_clienteActionPerformed
        
    private void btn_registrar_cliente_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_cliente_mActionPerformed
        txf_rut.setEnabled(true);
        jp_registrar_cliente.setVisible(true);
        jp_ver_datos.setVisible(false);
        jp_formulario_cliente.setVisible(false);
        jp_numero_cuenta.setVisible(false);
        txf_rut.setText(""); txf_nombre.setText(""); txf_apPaterno.setText(""); txf_apMaterno.setText("");txf_direccion.setText(""); txf_comuna.setText(""); txf_telefono.setText(""); txf_numeroCuenta.setText("");
    }//GEN-LAST:event_btn_registrar_cliente_mActionPerformed

    private void txf_rut_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_rut_datosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_rut_datosActionPerformed

    private void btn_validar_rut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validar_rut1ActionPerformed
        if(txf_rut_datos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese rut para validación", "Advertencia", JOptionPane.OK_OPTION);
            txf_rut_datos.setEnabled(true);
        }
        else{
            if(funcionesBanco.isNumeric(txf_rut_datos.getText())){
                if(txf_rut_datos.getText().length() < 8 || txf_rut_datos.getText().length() > 9){
                    JOptionPane.showMessageDialog(null, "Ingresar rut valido sin puntos ni guiones", "Advertencia", JOptionPane.OK_OPTION);
                    txf_rut_datos.setEnabled(true);
                }
                else{
                    rut = funcionesBanco.checkRut(txf_rut_datos.getText());
                    txf_rut_datos.setEnabled(false);
                    for(int i = 0;i<=clienteBanco.size();i++){
                        if(clienteBanco.size()>0){
                            if(clienteBanco.get(i).getRut().equals(rut)){
                                jp_formulario_datos.setVisible(true);
                                lb_rut.setText(": "+clienteBanco.get(i).getRut());
                                lb_nombre.setText(": "+clienteBanco.get(i).getNombre());
                                lb_aPaterno.setText(": "+clienteBanco.get(i).getApellidoPaterno());
                                lb_aMaterno.setText(": "+clienteBanco.get(i).getApellidoMaterno());
                                lb_direccion.setText(": "+clienteBanco.get(i).getDomicilio());
                                lb_comuna.setText(": "+clienteBanco.get(i).getComuna());
                                lb_telefono.setText(": "+clienteBanco.get(i).getTelefono());
                                lb_numeroCuenta.setText(": "+Integer.toString(clienteBanco.get(i).getCuenta().getNumeroCuenta()));
                                lb_tipoCuenta.setText(": "+clienteBanco.get(i).getCuenta().getTipoCuenta());
                                lb_saldo.setText(": "+Integer.toString(clienteBanco.get(i).getCuenta().getSaldo()));
                                break;
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Cliente no se registra en sistema", "Advertencia", JOptionPane.OK_OPTION);
                                txf_rut_datos.setEnabled(true);
                                break;
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Cliente no se registra en sistema", "Advertencia", JOptionPane.OK_OPTION);
                            txf_rut_datos.setEnabled(true);
                            break;
                        }
                    }                    
                }   
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingresar valor numerico, recuerde que el rut debe ir sin puntos ni guiones", "Advertencia", JOptionPane.OK_OPTION);
            }
        }
    }//GEN-LAST:event_btn_validar_rut1ActionPerformed

    private void btn_ver_datos_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_datos_mActionPerformed
        jp_registrar_cliente.setVisible(false);
        jp_ver_datos.setVisible(true);
        jp_formulario_datos.setVisible(false);
        txf_rut_datos.setEnabled(true);
    }//GEN-LAST:event_btn_ver_datos_mActionPerformed

    private void btn_inicio_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_mActionPerformed
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_inicio_mActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_validar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validar_datosActionPerformed
        if(txf_nombre.getText().isEmpty() || txf_apPaterno.getText().isEmpty() || 
        txf_apMaterno.getText().isEmpty() || txf_direccion.getText().isEmpty() ||txf_comuna.getText().isEmpty()|| txf_telefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellenar todos los campos para validación", "Advertencia", JOptionPane.OK_OPTION);
        }
        else{
            if(funcionesBanco.isNumeric(txf_telefono.getText())){
                int telefonoInt = Integer.parseInt(txf_telefono.getText());
                if(telefonoInt == 0 || txf_telefono.getText().isEmpty() || telefonoInt < 0){
                    JOptionPane.showMessageDialog(null, "Ingrese número de telefono mayor a 0", "Advertencia", JOptionPane.OK_OPTION);
                }
                else{
                    rut = funcionesBanco.checkRut(txf_rut.getText());
                    nombre = txf_nombre.getText();
                    apellidoPaterno = txf_apPaterno.getText();
                    apellidoMaterno = txf_apMaterno.getText();
                    domicilio = txf_direccion.getText();
                    comuna = txf_comuna.getText();
                    telefono = txf_telefono.getText();
                    jp_numero_cuenta.setVisible(true);
                    btn_validar_datos.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingrese numero de telefono valido, sin anteponer +56", "Advertencia", JOptionPane.OK_OPTION);
            }
        }
    }//GEN-LAST:event_btn_validar_datosActionPerformed

    private void btn_nueva_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueva_consultaActionPerformed
        jp_formulario_datos.setVisible(false);
        lb_rut.setText("");
        lb_nombre.setText("");
        lb_aPaterno.setText("");
        lb_aMaterno.setText("");
        lb_direccion.setText("");
        lb_comuna.setText("");
        lb_telefono.setText("");
        lb_numeroCuenta.setText("");
        lb_saldo.setText("");
        txf_rut_datos.setText("");
        txf_rut_datos.setEnabled(true);
    }//GEN-LAST:event_btn_nueva_consultaActionPerformed

    private void cb_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_cuentaActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear_cliente;
    private javax.swing.JButton btn_inicio_m;
    private javax.swing.JButton btn_nueva_consulta;
    private javax.swing.JButton btn_registrar_cliente_m;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_validar_datos;
    private javax.swing.JButton btn_validar_rut;
    private javax.swing.JButton btn_validar_rut1;
    private javax.swing.JButton btn_ver_datos_m;
    private javax.swing.JComboBox<String> cb_cuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel jp_formulario_cliente;
    private javax.swing.JPanel jp_formulario_datos;
    private javax.swing.JPanel jp_numero_cuenta;
    private javax.swing.JPanel jp_registrar_cliente;
    private javax.swing.JPanel jp_ver_datos;
    private javax.swing.JLabel lb_aMaterno;
    private javax.swing.JLabel lb_aPaterno;
    private javax.swing.JLabel lb_comuna;
    private javax.swing.JLabel lb_direccion;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_numeroCuenta;
    private javax.swing.JLabel lb_rut;
    private javax.swing.JLabel lb_saldo;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JLabel lb_tipoCuenta;
    private javax.swing.JTextField txf_apMaterno;
    private javax.swing.JTextField txf_apPaterno;
    private javax.swing.JTextField txf_comuna;
    private javax.swing.JTextField txf_direccion;
    private javax.swing.JTextField txf_nombre;
    private javax.swing.JTextField txf_numeroCuenta;
    private javax.swing.JTextField txf_rut;
    private javax.swing.JTextField txf_rut_datos;
    private javax.swing.JTextField txf_telefono;
    // End of variables declaration//GEN-END:variables
}
