
package com.vendrellignacio.wordle.igu;

import com.vendrellignacio.wordle.logic.Controladora;
import com.vendrellignacio.wordle.logic.LetraAdivinar;
import com.vendrellignacio.wordle.logic.LetraIntento;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;


public class Principal extends javax.swing.JFrame {
    Controladora control;
    LetraAdivinar letras;
    LetraIntento letrasInt;
    String[] patron;
    boolean resultado;
    int intentos;
    public Principal(LetraAdivinar letras) {
        initComponents();
        this.letras = letras;
        this.control = new Controladora();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtA1 = new javax.swing.JTextField();
        txtA2 = new javax.swing.JTextField();
        txtA3 = new javax.swing.JTextField();
        txtA4 = new javax.swing.JTextField();
        txtA5 = new javax.swing.JTextField();
        txtB1 = new javax.swing.JTextField();
        txtB2 = new javax.swing.JTextField();
        txtB3 = new javax.swing.JTextField();
        txtB4 = new javax.swing.JTextField();
        txtB5 = new javax.swing.JTextField();
        txtC1 = new javax.swing.JTextField();
        txtC2 = new javax.swing.JTextField();
        txtC3 = new javax.swing.JTextField();
        txtC4 = new javax.swing.JTextField();
        txtC5 = new javax.swing.JTextField();
        txtD1 = new javax.swing.JTextField();
        txtD2 = new javax.swing.JTextField();
        txtD3 = new javax.swing.JTextField();
        txtD4 = new javax.swing.JTextField();
        txtD5 = new javax.swing.JTextField();
        txtE1 = new javax.swing.JTextField();
        txtE2 = new javax.swing.JTextField();
        txtE3 = new javax.swing.JTextField();
        txtE4 = new javax.swing.JTextField();
        txtE5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReglas = new javax.swing.JButton();

        jTextField10.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setText("WORDLE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        txtA1.setEditable(false);
        txtA1.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtA2.setEditable(false);
        txtA2.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtA2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtA3.setEditable(false);
        txtA3.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtA3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtA4.setEditable(false);
        txtA4.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtA4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtA5.setEditable(false);
        txtA5.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtA5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB1.setEditable(false);
        txtB1.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB2.setEditable(false);
        txtB2.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB3.setEditable(false);
        txtB3.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4.setEditable(false);
        txtB4.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB5.setEditable(false);
        txtB5.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtB5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtC1.setEditable(false);
        txtC1.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtC2.setEditable(false);
        txtC2.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtC3.setEditable(false);
        txtC3.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtC4.setEditable(false);
        txtC4.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtC4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4ActionPerformed(evt);
            }
        });

        txtC5.setEditable(false);
        txtC5.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtC5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtD1.setEditable(false);
        txtD1.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtD2.setEditable(false);
        txtD2.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtD3.setEditable(false);
        txtD3.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtD3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtD4.setEditable(false);
        txtD4.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtD4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtD5.setEditable(false);
        txtD5.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtD5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtE1.setEditable(false);
        txtE1.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtE1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtE2.setEditable(false);
        txtE2.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtE2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtE3.setEditable(false);
        txtE3.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtE3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtE4.setEditable(false);
        txtE4.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtE4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtE5.setEditable(false);
        txtE5.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        txtE5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel2.setText("WORDLE:");

        btnSubmit.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(new javax.swing.border.MatteBorder(null));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReglas.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnReglas.setText("?");
        btnReglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReglasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtD1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtD2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtE2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtA2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtE3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtE4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtD3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtD4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtC4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtA3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtA4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtA5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtC5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtD5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtE5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(85, 85, 85)
                                .addComponent(btnReglas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnReglas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtA2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtA3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtA4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtA5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtD1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtD2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtD3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtD4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtD5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtE2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtE3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtE4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtE5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // Convertir letras adivinadas a un array de caracteres
        char[] adiChar = control.letrasAdiToChar(letras);
        //convertirlo a String
        String palabra = new String(adiChar);
 
        //obtenemos la respuesta y la guardamos en una variable
        String respuesta = txtRespuesta.getText();
        //verificamos si tiene exactamente 5 caracteres
        if (respuesta.length() != 5) {
                    // Si el texto no tiene exactamente 5 caracteres, limpiar el JTextField
                    JOptionPane.showMessageDialog(null, "Debe ingresar exactamente 5 caracteres.");
                    txtRespuesta.setText("");  // Limpiar el JTextField
                } else {
        //comparamos ambas palabras para saber si son identicas
        /*if (respuesta.equals(palabra)) {
            
        }*/
        //lo convertimos en un array que almacena cada letra del string
        char[] caracteres = control.stringToChar(respuesta);
        System.out.println(caracteres);
        //creamos un OBJ para el tipo respuesta
        letrasInt = control.crearIntento(caracteres);
        
        //guardamos que se ha hecho un intento
        intentos += 1;
        switch (intentos) {
            case 1 -> {
                //seteamos a cada celda cada char
                txtA1.setText(String.valueOf(caracteres[0]));
                txtA2.setText(String.valueOf(caracteres[1]));
                txtA3.setText(String.valueOf(caracteres[2]));
                txtA4.setText(String.valueOf(caracteres[3]));
                txtA5.setText(String.valueOf(caracteres[4]));
                txtA1.setHorizontalAlignment(JTextField.CENTER);
                txtA2.setHorizontalAlignment(JTextField.CENTER);
                txtA3.setHorizontalAlignment(JTextField.CENTER);
                txtA4.setHorizontalAlignment(JTextField.CENTER);
                txtA5.setHorizontalAlignment(JTextField.CENTER);
                System.out.println(caracteres);
                //cambio colores de fondo
                patron = primerInt(letrasInt);
                setColorJTextField(patron, intentos);
                System.out.println(Arrays.toString(patron));
                //limpiar respuesta
                txtRespuesta.setText("");
                //actualizo el jPanel
                jPanel1.revalidate();
                jPanel1.repaint();
                //comparamos ambas palabras para saber si son identicas
                if (respuesta.equals(palabra)) {
                    mostrarMensaje("¡¡Felicitaciones!! Ha ACERTADO la PALABRA","info","EXCELENTE");
                    System.exit(0); // Finaliza el programa con éxito
                }
            }
            case 2 -> {
                //seteamos a cada celda cada char
                txtB1.setText(String.valueOf(caracteres[0]));
                txtB2.setText(String.valueOf(caracteres[1]));
                txtB3.setText(String.valueOf(caracteres[2]));
                txtB4.setText(String.valueOf(caracteres[3]));
                txtB5.setText(String.valueOf(caracteres[4]));
                txtB1.setHorizontalAlignment(JTextField.CENTER);
                txtB2.setHorizontalAlignment(JTextField.CENTER);
                txtB3.setHorizontalAlignment(JTextField.CENTER);
                txtB4.setHorizontalAlignment(JTextField.CENTER);
                txtB5.setHorizontalAlignment(JTextField.CENTER);
                System.out.println(caracteres);
                //cambio colores de fondo
                patron = primerInt(letrasInt);
                setColorJTextField(patron, intentos);
                System.out.println(Arrays.toString(patron));
                //limpiar respuesta
                txtRespuesta.setText("");
                //actualizo el jPanel
                jPanel1.revalidate();
                jPanel1.repaint();
                 //comparamos ambas palabras para saber si son identicas
                if (respuesta.equals(palabra)) {
                    mostrarMensaje("¡¡Felicitaciones!! Ha ACERTADO la PALABRA","info","EXCELENTE");
                    System.exit(0); // Finaliza el programa con éxito
                }
                 
            }
            case 3 -> {
                //seteamos a cada celda cada char
                txtC1.setText(String.valueOf(caracteres[0]));
                txtC2.setText(String.valueOf(caracteres[1]));
                txtC3.setText(String.valueOf(caracteres[2]));
                txtC4.setText(String.valueOf(caracteres[3]));
                txtC5.setText(String.valueOf(caracteres[4]));
                txtC1.setHorizontalAlignment(JTextField.CENTER);
                txtC2.setHorizontalAlignment(JTextField.CENTER);
                txtC3.setHorizontalAlignment(JTextField.CENTER);
                txtC4.setHorizontalAlignment(JTextField.CENTER);
                txtC5.setHorizontalAlignment(JTextField.CENTER);
                System.out.println(caracteres);
                //cambio colores de fondo
                patron = primerInt(letrasInt);
                setColorJTextField(patron, intentos);
                System.out.println(Arrays.toString(patron));
                //limpiar respuesta
                txtRespuesta.setText("");
                //actualizo el jPanel
                jPanel1.revalidate();
                jPanel1.repaint();
                 //comparamos ambas palabras para saber si son identicas
                if (respuesta.equals(palabra)) {
                    mostrarMensaje("¡¡Felicitaciones!! Ha ACERTADO la PALABRA","info","EXCELENTE");
                    System.exit(0); // Finaliza el programa con éxito
                }
            }
            case 4 -> {
                //seteamos a cada celda cada char
                txtD1.setText(String.valueOf(caracteres[0]));
                txtD2.setText(String.valueOf(caracteres[1]));
                txtD3.setText(String.valueOf(caracteres[2]));
                txtD4.setText(String.valueOf(caracteres[3]));
                txtD5.setText(String.valueOf(caracteres[4]));
                txtD1.setHorizontalAlignment(JTextField.CENTER);
                txtD2.setHorizontalAlignment(JTextField.CENTER);
                txtD3.setHorizontalAlignment(JTextField.CENTER);
                txtD4.setHorizontalAlignment(JTextField.CENTER);
                txtD5.setHorizontalAlignment(JTextField.CENTER);
                System.out.println(caracteres);
                //cambio colores de fondo
                patron = primerInt(letrasInt);
                setColorJTextField(patron, intentos);
                System.out.println(Arrays.toString(patron));
                //limpiar respuesta
                txtRespuesta.setText("");
                //actualizo el jPanel
                jPanel1.revalidate();
                jPanel1.repaint();
                 //comparamos ambas palabras para saber si son identicas
                if (respuesta.equals(palabra)) {
                    mostrarMensaje("¡¡Felicitaciones!! Ha ACERTADO la PALABRA","info","EXCELENTE");
                    System.exit(0); // Finaliza el programa con éxito
                }
            }
            case 5 -> {
                //seteamos a cada celda cada char
                txtE1.setText(String.valueOf(caracteres[0]));
                txtE2.setText(String.valueOf(caracteres[1]));
                txtE3.setText(String.valueOf(caracteres[2]));
                txtE4.setText(String.valueOf(caracteres[3]));
                txtE5.setText(String.valueOf(caracteres[4]));
                txtE1.setHorizontalAlignment(JTextField.CENTER);
                txtE2.setHorizontalAlignment(JTextField.CENTER);
                txtE3.setHorizontalAlignment(JTextField.CENTER);
                txtE4.setHorizontalAlignment(JTextField.CENTER);
                txtE5.setHorizontalAlignment(JTextField.CENTER);
                System.out.println(caracteres);
                //cambio colores de fondo
                patron = primerInt(letrasInt);
                setColorJTextField(patron, intentos);
                System.out.println(Arrays.toString(patron));
                //limpiar respuesta
                txtRespuesta.setText("");
                //actualizo el jPanel
                jPanel1.revalidate();
                jPanel1.repaint();
                 //comparamos ambas palabras para saber si son identicas
                if (respuesta.equals(palabra)) {
                    mostrarMensaje("¡¡Felicitaciones!! Ha ACERTADO la PALABRA","info","EXCELENTE");
                    System.exit(0); // Finaliza el programa con éxito
                }else{
                    mostrarMensaje("¡¡Mala Suerte!! No ha adivinado la palabra.","error","FALLO");
                    System.exit(0); // Finaliza el programa con éxito
                }
            }
        }
       }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void txtC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4ActionPerformed
        // 
    }//GEN-LAST:event_txtC4ActionPerformed

    private void btnReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReglasActionPerformed
        mostrarMensaje("""
                       Wordle es un juego de palabras donde el objetivo es adivinar una palabra de cinco letras en seis intentos o menos. Cada vez que introduces una palabra, el juego te da pistas:
                       
                       Las letras en verde est\u00e1n en la palabra y en la posici\u00f3n correcta.
                       Las letras en amarillo est\u00e1n en la palabra, pero en la posici\u00f3n incorrecta.
                       Las letras en gris no est\u00e1n en la palabra.
                       Usa las pistas para descubrir la palabra correcta dentro de los intentos permitidos.""","info","REGLAS");
    }//GEN-LAST:event_btnReglasActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReglas;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField txtA1;
    private javax.swing.JTextField txtA2;
    private javax.swing.JTextField txtA3;
    private javax.swing.JTextField txtA4;
    private javax.swing.JTextField txtA5;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB2;
    private javax.swing.JTextField txtB3;
    private javax.swing.JTextField txtB4;
    private javax.swing.JTextField txtB5;
    private javax.swing.JTextField txtC1;
    private javax.swing.JTextField txtC2;
    private javax.swing.JTextField txtC3;
    private javax.swing.JTextField txtC4;
    private javax.swing.JTextField txtC5;
    private javax.swing.JTextField txtD1;
    private javax.swing.JTextField txtD2;
    private javax.swing.JTextField txtD3;
    private javax.swing.JTextField txtD4;
    private javax.swing.JTextField txtD5;
    private javax.swing.JTextField txtE1;
    private javax.swing.JTextField txtE2;
    private javax.swing.JTextField txtE3;
    private javax.swing.JTextField txtE4;
    private javax.swing.JTextField txtE5;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables

    private String[] compararLetras(char[] intento) {
    // Inicializa el array patron
    patron = new String[5];
    
    // Convertir letras adivinadas a un array de caracteres
    char[] adiChar = control.letrasAdiToChar(letras);
    
    for (int i = 0; i < 5; i++) {
        // Inicializa cada valor de patron como "GRIS" por defecto
        patron[i] = "GRIS"; 
        
        // i será para letras a intento
        for (int j = 0; j < 5; j++) {
            // j será para letra del adivinar
            if (adiChar[j] == intento[i]) {
                // Si ambos caracteres son iguales
                if (j == i) {
                    // Si ambos caracteres están en la misma posición
                    patron[i] = "VERDE";
                    break;
                } else {
                    // Si ambos caracteres son iguales pero no en la misma posición
                    patron[i] = "AMARILLO";
                }
            }
        }
    }
    return patron;
}


    private String[] primerInt(LetraIntento letrasInt) {
        char[] intento = control.letrasToChar(letrasInt);
        patron = compararLetras(intento);
        return patron;
    }

    private void setColorJTextField(String[] patron, int intentos1) {
        int i = 0;
        for (String color : patron) {
            //i corresponde a el numero de celda que se está recorriendo
            i += 1;
            switch (color) {
                case "VERDE" -> {
                    //analizamos en que celda stamos. Si estamos en (A1,A2,A3, etc.)
                    switch (i) {
                        case 1 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA1.setBackground(Color.GREEN);
                            }
                                case 2 -> {
                                    txtB1.setBackground(Color.GREEN);
                            }
                                case 3 -> {
                                    txtC1.setBackground(Color.GREEN);
                            }
                                case 4 -> {
                                    txtD1.setBackground(Color.GREEN);
                            }
                                case 5 -> {
                                    txtE1.setBackground(Color.GREEN);
                            }
                            }
                            
                    }
                        case 2 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA2.setBackground(Color.GREEN);
                            }
                                case 2 -> {
                                    txtB2.setBackground(Color.GREEN);
                            }
                                case 3 -> {
                                    txtC2.setBackground(Color.GREEN);
                            }
                                case 4 -> {
                                    txtD2.setBackground(Color.GREEN);
                            }
                                case 5 -> {
                                    txtE2.setBackground(Color.GREEN);
                            }
                            }
                            
                    }
                        case 3 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA3.setBackground(Color.GREEN);
                            }
                                case 2 -> {
                                    txtB3.setBackground(Color.GREEN);
                            }
                                case 3 -> {
                                    txtC3.setBackground(Color.GREEN);
                            }
                                case 4 -> {
                                    txtD3.setBackground(Color.GREEN);
                            }
                                case 5 -> {
                                    txtE3.setBackground(Color.GREEN);
                            }
                            }
                            
                    }
                        case 4 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA4.setBackground(Color.GREEN);
                            }
                                case 2 -> {
                                    txtB4.setBackground(Color.GREEN);
                            }
                                case 3 -> {
                                    txtC4.setBackground(Color.GREEN);
                            }
                                case 4 -> {
                                    txtD4.setBackground(Color.GREEN);
                            }
                                case 5 -> {
                                    txtE4.setBackground(Color.GREEN);
                            }
                            }
                            
                    }
                        case 5 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA5.setBackground(Color.GREEN);
                            }
                                case 2 -> {
                                    txtB5.setBackground(Color.GREEN);
                            }
                                case 3 -> {
                                    txtC5.setBackground(Color.GREEN);
                            }
                                case 4 -> {
                                    txtD5.setBackground(Color.GREEN);
                            }
                                case 5 -> {
                                    txtE5.setBackground(Color.GREEN);
                            }
                            }
                            
                    }
                        
                    }
                }
                case "AMARILLO" -> {
                    //analizamos en que celda stamos. Si estamos en (A1,A2,A3, etc.)
                    switch (i) {
                        case 1 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA1.setBackground(Color.YELLOW);
                            }
                                case 2 -> {
                                    txtB1.setBackground(Color.YELLOW);
                            }
                                case 3 -> {
                                    txtC1.setBackground(Color.YELLOW);
                            }
                                case 4 -> {
                                    txtD1.setBackground(Color.YELLOW);
                            }
                                case 5 -> {
                                    txtE1.setBackground(Color.YELLOW);
                            }
                            }
                            
                    }
                        case 2 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA2.setBackground(Color.YELLOW);
                            }
                                case 2 -> {
                                    txtB2.setBackground(Color.YELLOW);
                            }
                                case 3 -> {
                                    txtC2.setBackground(Color.YELLOW);
                            }
                                case 4 -> {
                                    txtD2.setBackground(Color.YELLOW);
                            }
                                case 5 -> {
                                    txtE2.setBackground(Color.YELLOW);
                            }
                            }
                            
                    }
                        case 3 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA3.setBackground(Color.YELLOW);
                            }
                                case 2 -> {
                                    txtB3.setBackground(Color.YELLOW);
                            }
                                case 3 -> {
                                    txtC3.setBackground(Color.YELLOW);
                            }
                                case 4 -> {
                                    txtD3.setBackground(Color.YELLOW);
                            }
                                case 5 -> {
                                    txtE3.setBackground(Color.YELLOW);
                            }
                            }
                            
                    }
                        case 4 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA4.setBackground(Color.YELLOW);
                            }
                                case 2 -> {
                                    txtB4.setBackground(Color.YELLOW);
                            }
                                case 3 -> {
                                    txtC4.setBackground(Color.YELLOW);
                            }
                                case 4 -> {
                                    txtD4.setBackground(Color.YELLOW);
                            }
                                case 5 -> {
                                    txtE4.setBackground(Color.YELLOW);
                            }
                            }
                            
                    }
                        case 5 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA5.setBackground(Color.YELLOW);
                            }
                                case 2 -> {
                                    txtB5.setBackground(Color.YELLOW);
                            }
                                case 3 -> {
                                    txtC5.setBackground(Color.YELLOW);
                            }
                                case 4 -> {
                                    txtD5.setBackground(Color.YELLOW);
                            }
                                case 5 -> {
                                    txtE5.setBackground(Color.YELLOW);
                            }
                            }
                            
                    }
                        
                    }
                }
                case "GRIS" -> {
                    //analizamos en que celda stamos. Si estamos en (A1,A2,A3, etc.)
                    switch (i) {
                        case 1 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA1.setBackground(Color.GRAY);
                            }
                                case 2 -> {
                                    txtB1.setBackground(Color.GRAY);
                            }
                                case 3 -> {
                                    txtC1.setBackground(Color.GRAY);
                            }
                                case 4 -> {
                                    txtD1.setBackground(Color.GRAY);
                            }
                                case 5 -> {
                                    txtE1.setBackground(Color.GRAY);
                            }
                            }
                            
                    }
                        case 2 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA2.setBackground(Color.GRAY);
                            }
                                case 2 -> {
                                    txtB2.setBackground(Color.GRAY);
                            }
                                case 3 -> {
                                    txtC2.setBackground(Color.GRAY);
                            }
                                case 4 -> {
                                    txtD2.setBackground(Color.GRAY);
                            }
                                case 5 -> {
                                    txtE2.setBackground(Color.GRAY);
                            }
                            }
                            
                    }
                        case 3 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA3.setBackground(Color.GRAY);
                            }
                                case 2 -> {
                                    txtB3.setBackground(Color.GRAY);
                            }
                                case 3 -> {
                                    txtC3.setBackground(Color.GRAY);
                            }
                                case 4 -> {
                                    txtD3.setBackground(Color.GRAY);
                            }
                                case 5 -> {
                                    txtE3.setBackground(Color.GRAY);
                            }
                            }
                            
                    }
                        case 4 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA4.setBackground(Color.GRAY);
                            }
                                case 2 -> {
                                    txtB4.setBackground(Color.GRAY);
                            }
                                case 3 -> {
                                    txtC4.setBackground(Color.GRAY);
                            }
                                case 4 -> {
                                    txtD4.setBackground(Color.GRAY);
                            }
                                case 5 -> {
                                    txtE4.setBackground(Color.GRAY);
                            }
                            }
                            
                    }
                        case 5 -> {
                            //analizamos en que fila estamos. Si estamos en la celda uno (A1,B1,C1, etc.)
                            switch (intentos1) {
                                case 1 -> {
                                    txtA5.setBackground(Color.GRAY);
                            }
                                case 2 -> {
                                    txtB5.setBackground(Color.GRAY);
                            }
                                case 3 -> {
                                    txtC5.setBackground(Color.GRAY);
                            }
                                case 4 -> {
                                    txtD5.setBackground(Color.GRAY);
                            }
                                case 5 -> {
                                    txtE5.setBackground(Color.GRAY);
                            }
                            }
                            
                    }
                        
                    }
                }
                
            }
        }
        
    }
    public void mostrarMensaje (String mensaje, String tipo, String titulo){
	JOptionPane optionPane = new JOptionPane(mensaje);
	if(tipo.equals("info")){
		optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
	}else if(tipo.equals("error")) {
		optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
	}
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
}
    
}
