/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab8p2_andrefloresgerardohasbum_;

import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author andre
 */
public class Principal extends javax.swing.JFrame {

    public static boolean logged = false;

    public Principal() {
        initComponents();
        setImageLabel(jLabel1, "src/Fotos/Logo_UNITEC.png");

    }

    public void setImageLabel(JLabel lnombre, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(lnombre.getWidth(), lnombre.getHeight(), Image.SCALE_DEFAULT));
        lnombre.setIcon(icon);
        this.repaint();
    }

    public static void escribirUsuarios(ArrayList<User> usuarios, String nombreArchivo) {
        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            OOS.writeObject(usuarios);
            System.out.println("usuario guardado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> leerUsuarios(String nombreArchivo) {
        ArrayList<User> usuarios = new ArrayList();
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            usuarios = (ArrayList<User>) OIS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public static void escribirTorneos(ArrayList<Torneo> torneos, String nombreArchivo) {
        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            OOS.writeObject(torneos);
            System.out.println("Torneo guardado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Torneo> leerTorneos(String nombreArchivo) {
        ArrayList<Torneo> torneos = new ArrayList();
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            torneos = (ArrayList<Torneo>) OIS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return torneos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Registrar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Tf_usernameRegistrar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tf_PasswordRegistrar = new javax.swing.JTextField();
        rb_Administrador = new javax.swing.JRadioButton();
        rb_Participante = new javax.swing.JRadioButton();
        Btn_crearUsuario = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        LoginAdmin = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_torneosadmin = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_personastorneoadmin = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btn_CrearTorneo = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        LoginParticipante = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_torneosdisp = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_torneoscerrados = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_torneosganados = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        CrearTorneo = new javax.swing.JDialog();
        jpaneltorneo = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_nombreTorneo = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        btn_TerminarCrearTorneo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LoginConfirm = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Tf_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tf_Password = new javax.swing.JTextField();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 570));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre de Usuario");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 180, 30));

        Tf_usernameRegistrar.setBackground(new java.awt.Color(153, 153, 153));
        Tf_usernameRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(Tf_usernameRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 210, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, 30));

        Tf_PasswordRegistrar.setBackground(new java.awt.Color(153, 153, 153));
        Tf_PasswordRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(Tf_PasswordRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 210, 50));

        buttonGroup1.add(rb_Administrador);
        rb_Administrador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rb_Administrador.setForeground(new java.awt.Color(0, 0, 0));
        rb_Administrador.setText("Administrador");
        jPanel3.add(rb_Administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        buttonGroup1.add(rb_Participante);
        rb_Participante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rb_Participante.setForeground(new java.awt.Color(0, 0, 0));
        rb_Participante.setText("Participante");
        jPanel3.add(rb_Participante, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        Btn_crearUsuario.setBackground(new java.awt.Color(255, 0, 0));
        Btn_crearUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_crearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Btn_crearUsuario.setText("Crear");
        Btn_crearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_crearUsuarioMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_crearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 483, 90, 60));

        javax.swing.GroupLayout jd_RegistrarLayout = new javax.swing.GroupLayout(jd_Registrar.getContentPane());
        jd_Registrar.getContentPane().setLayout(jd_RegistrarLayout);
        jd_RegistrarLayout.setHorizontalGroup(
            jd_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_RegistrarLayout.setVerticalGroup(
            jd_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 0, 51));

        jButton4.setBackground(new java.awt.Color(0, 51, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Salir");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton4)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 570));

        jl_torneosadmin.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_torneosadmin);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 180, 330));

        jl_personastorneoadmin.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_personastorneoadmin);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 180, 330));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Torneos");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Personas dentro del torneo");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Marcar Ganador");
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 120, 30));

        btn_CrearTorneo.setBackground(new java.awt.Color(0, 51, 204));
        btn_CrearTorneo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_CrearTorneo.setForeground(new java.awt.Color(255, 255, 255));
        btn_CrearTorneo.setText("Crear Torneo");
        btn_CrearTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CrearTorneoMouseClicked(evt);
            }
        });
        jPanel5.add(btn_CrearTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 120, 70));

        jButton7.setBackground(new java.awt.Color(0, 0, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cerrar Torneo");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 120, 30));

        javax.swing.GroupLayout LoginAdminLayout = new javax.swing.GroupLayout(LoginAdmin.getContentPane());
        LoginAdmin.getContentPane().setLayout(LoginAdminLayout);
        LoginAdminLayout.setHorizontalGroup(
            LoginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginAdminLayout.setVerticalGroup(
            LoginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 0, 51));

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton2)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 570));
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 160, 60));

        jl_torneosdisp.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_torneosdisp);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 120, 330));

        jl_torneoscerrados.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jl_torneoscerrados);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 110, 330));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Torneos Disponibles");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Torneos Ganados");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jl_torneosganados.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(jl_torneosganados);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 120, 330));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Torneos Cerrados");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 51, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Unirse al Torneo");
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        javax.swing.GroupLayout LoginParticipanteLayout = new javax.swing.GroupLayout(LoginParticipante.getContentPane());
        LoginParticipante.getContentPane().setLayout(LoginParticipanteLayout);
        LoginParticipanteLayout.setHorizontalGroup(
            LoginParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        LoginParticipanteLayout.setVerticalGroup(
            LoginParticipanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpaneltorneo.setBackground(new java.awt.Color(255, 255, 255));
        jpaneltorneo.setForeground(new java.awt.Color(0, 0, 0));
        jpaneltorneo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jpaneltorneo.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 570));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre del Torneo");
        jpaneltorneo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Rondas");
        jpaneltorneo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));
        jpaneltorneo.add(tf_nombreTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 140, 30));
        jpaneltorneo.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 120, 30));

        btn_TerminarCrearTorneo.setBackground(new java.awt.Color(0, 0, 204));
        btn_TerminarCrearTorneo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_TerminarCrearTorneo.setText("Crear Torneo");
        btn_TerminarCrearTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TerminarCrearTorneoMouseClicked(evt);
            }
        });
        jpaneltorneo.add(btn_TerminarCrearTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 130, 80));

        javax.swing.GroupLayout CrearTorneoLayout = new javax.swing.GroupLayout(CrearTorneo.getContentPane());
        CrearTorneo.getContentPane().setLayout(CrearTorneoLayout);
        CrearTorneoLayout.setHorizontalGroup(
            CrearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaneltorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CrearTorneoLayout.setVerticalGroup(
            CrearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaneltorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 570));

        LoginConfirm.setBackground(new java.awt.Color(204, 0, 0));
        LoginConfirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoginConfirm.setText("Iniciar sesion");
        LoginConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginConfirmMouseClicked(evt);
            }
        });
        jPanel1.add(LoginConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 150, 70));

        SignUpButton.setBackground(new java.awt.Color(0, 51, 204));
        SignUpButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SignUpButton.setText("Registrar");
        SignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseClicked(evt);
            }
        });
        jPanel1.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 150, 70));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 160, 60));

        Tf_username.setBackground(new java.awt.Color(153, 153, 153));
        Tf_username.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 210, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, 30));

        Tf_Password.setBackground(new java.awt.Color(153, 153, 153));
        Tf_Password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Tf_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginConfirmMouseClicked
        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista = (DefaultListModel) jl_torneosdisp.getModel();
        usuarios = leerUsuarios("usuarios.bin");
        torneos = leerTorneos("torneos.bin");
        DefaultListModel modeloListaAdmin = new DefaultListModel();
        modeloListaAdmin = (DefaultListModel) jl_torneosadmin.getModel();
        String nombreUsuario = Tf_username.getText();
        String contrasenia = Tf_Password.getText();

        for (User usuario : usuarios) {
            if (nombreUsuario.equals(usuario.getNombre()) && contrasenia.equals(usuario.getPassword())) {
                usuarioenUso = usuario;
                logged = true;
                break;
            }
        }

        if (logged) {
            if (usuarioenUso instanceof Participante) {
                this.setVisible(false);

                LoginParticipante.setVisible(true);
                LoginParticipante.pack();
                LoginParticipante.setResizable(false);
                torneos = leerTorneos("torneos.bin");
                for (Torneo torneo : torneos) {
                    if (torneo.isFlagAbierto()) {
                        modeloLista.addElement(torneo);
                    } else if (torneo.isFlagAbierto() == false) {
                        modeloLista.addElement(torneos);
                    }
                }
                jl_torneosdisp.setModel(modeloLista);
            } else if (usuarioenUso instanceof Admin) {

                this.setVisible(false);

                LoginAdmin.setVisible(true);
                LoginAdmin.pack();
                LoginAdmin.setResizable(false);

            }
            Tf_username.setText("");
            Tf_Password.setText("");

        }

    }//GEN-LAST:event_LoginConfirmMouseClicked

    private void SignUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpButtonMouseClicked
        this.setVisible(false);
        jd_Registrar.pack();
        jd_Registrar.setLocationRelativeTo(this);
        jd_Registrar.setVisible(true);
        jd_Registrar.setResizable(false);

    }//GEN-LAST:event_SignUpButtonMouseClicked

    private void Btn_crearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_crearUsuarioMouseClicked
        this.setVisible(false);
        jd_Registrar.setVisible(false);

        if (rb_Administrador.isSelected()) {
            usuarios.add(new Admin(Tf_usernameRegistrar.getText(), Tf_PasswordRegistrar.getText(), 0));

        } else if (rb_Participante.isSelected()) {
            usuarios.add(new Participante(Tf_usernameRegistrar.getText(), Tf_PasswordRegistrar.getText()));
        }
        this.setVisible(true);
        escribirUsuarios(usuarios, "usuarios.bin");

        JOptionPane.showMessageDialog(this, "Registro de Usuario terminado con exito");
    }//GEN-LAST:event_Btn_crearUsuarioMouseClicked

    private void btn_CrearTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearTorneoMouseClicked
        LoginAdmin.setVisible(false);

        CrearTorneo.setVisible(true);
        CrearTorneo.pack();
        CrearTorneo.setResizable(false);
    }//GEN-LAST:event_btn_CrearTorneoMouseClicked

    private void btn_TerminarCrearTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TerminarCrearTorneoMouseClicked
        torneos.add(new Torneo(tf_nombreTorneo.getText(), true, false, null));

        escribirTorneos(torneos, "torneos.bin");

        JOptionPane.showMessageDialog(this, "Registro de torneo terminado con exito");
        CrearTorneo.setVisible(false);
        LoginAdmin.setVisible(true);
        LoginAdmin.pack();
    }//GEN-LAST:event_btn_TerminarCrearTorneoMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        LoginParticipante.setVisible(false);
        this.setVisible(true);
        this.pack();
        this.setResizable(false);
        usuarioenUso = null;
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked


    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        LoginAdmin.setVisible(false);
        this.setVisible(true);
        this.pack();
        this.setResizable(false);
        usuarioenUso = null;
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void escribirTexto(ArrayList<Torneo> lista, String path) throws IOException {

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {

            fw = new FileWriter(path, false);
            bw = new BufferedWriter(fw);

            for (Torneo a : lista) {
                Torneo temp = (Torneo) a;
                bw.write("El participante " + temp.getGanador().getNombre() + " ha ganado el torneo " + temp.getNombre());
            }
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

        bw.close();
        fw.close();

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_crearUsuario;
    private javax.swing.JDialog CrearTorneo;
    private javax.swing.JDialog LoginAdmin;
    private javax.swing.JButton LoginConfirm;
    private javax.swing.JDialog LoginParticipante;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JTextField Tf_Password;
    private javax.swing.JTextField Tf_PasswordRegistrar;
    private javax.swing.JTextField Tf_username;
    private javax.swing.JTextField Tf_usernameRegistrar;
    private javax.swing.JButton btn_CrearTorneo;
    private javax.swing.JButton btn_TerminarCrearTorneo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JDialog jd_Registrar;
    private javax.swing.JList<String> jl_personastorneoadmin;
    private javax.swing.JList<String> jl_torneosadmin;
    private javax.swing.JList<String> jl_torneoscerrados;
    private javax.swing.JList<String> jl_torneosdisp;
    private javax.swing.JList<String> jl_torneosganados;
    private javax.swing.JPanel jpaneltorneo;
    private javax.swing.JRadioButton rb_Administrador;
    private javax.swing.JRadioButton rb_Participante;
    private javax.swing.JTextField tf_nombreTorneo;
    // End of variables declaration//GEN-END:variables
ArrayList<User> usuarios = new ArrayList();
    User usuarioenUso;
    ArrayList<Torneo> torneos = new ArrayList();
}
