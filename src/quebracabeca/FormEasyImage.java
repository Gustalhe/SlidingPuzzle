/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quebracabeca;

import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class FormEasyImage extends javax.swing.JFrame {

    int newX;
    int newY;
    private Timer timer;
    private TimerTask timerTask;

    /**
     * Creates new form NewJFrame
     */
    public FormEasyImage() {
        initComponents();

        timer = new Timer();
        timerTask = new Cronometro();
        timer.scheduleAtFixedRate(timerTask, 0, 1);

    }
    RankingDAO rankingDao = new RankingDAO();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelT1 = new javax.swing.JLabel();
        labelT2 = new javax.swing.JLabel();
        labelT3 = new javax.swing.JLabel();
        labelT4 = new javax.swing.JLabel();
        labelT5 = new javax.swing.JLabel();
        labelT6 = new javax.swing.JLabel();
        labelT7 = new javax.swing.JLabel();
        labelT8 = new javax.swing.JLabel();
        jEmpty = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelSegundos = new java.awt.Label();
        labelMiliseg = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        labelMinutos = new java.awt.Label();
        sairBT = new javax.swing.JButton();
        refazerBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        labelT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easy_difficult/2.png"))); // NOI18N
        labelT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelT1MouseClicked(evt);
            }
        });

        labelT2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelT2.setForeground(new java.awt.Color(255, 255, 255));
        labelT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easy_difficult/8.png"))); // NOI18N
        labelT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelT2MouseClicked(evt);
            }
        });

        labelT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easy_difficult/1.png"))); // NOI18N
        labelT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelT3MouseClicked(evt);
            }
        });

        labelT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easy_difficult/6.png"))); // NOI18N
        labelT4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelT4MouseClicked(evt);
            }
        });

        labelT5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easy_difficult/5.png"))); // NOI18N
        labelT5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelT5MouseClicked(evt);
            }
        });

        labelT6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easy_difficult/4.png"))); // NOI18N
        labelT6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelT6MouseClicked(evt);
            }
        });

        labelT7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easy_difficult/7.png"))); // NOI18N
        labelT7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelT7MouseClicked(evt);
            }
        });

        labelT8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easy_difficult/3.png"))); // NOI18N
        labelT8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelT8MouseClicked(evt);
            }
        });

        jEmpty.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jEmpty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmptyMouseClicked(evt);
            }
        });

        labelSegundos.setAlignment(java.awt.Label.CENTER);
        labelSegundos.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelSegundos.setName(""); // NOI18N
        labelSegundos.setText("00");

        labelMiliseg.setAlignment(java.awt.Label.CENTER);
        labelMiliseg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelMiliseg.setText("000");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText(":");

        labelMinutos.setAlignment(java.awt.Label.CENTER);
        labelMinutos.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelMinutos.setName(""); // NOI18N
        labelMinutos.setText("00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSegundos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMiliseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMiliseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sairBT.setFont(new java.awt.Font("Press Start 2P", 0, 11)); // NOI18N
        sairBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontes/Programming-Delete-Sign-icon.png"))); // NOI18N
        sairBT.setText("Sair");
        sairBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTActionPerformed(evt);
            }
        });

        refazerBT.setFont(new java.awt.Font("Press Start 2P", 0, 11)); // NOI18N
        refazerBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontes/Very-Basic-Reload-icon.png"))); // NOI18N
        refazerBT.setText("Restart");
        refazerBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refazerBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelT1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelT2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelT4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelT7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelT5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelT8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelT3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelT6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sairBT)
                .addGap(18, 18, 18)
                .addComponent(refazerBT))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {refazerBT, sairBT});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelT1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelT4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelT7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelT2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelT5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelT8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelT3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelT6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sairBT)
                            .addComponent(refazerBT)))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {refazerBT, sairBT});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void setTextoCronometroSegundos(String texto) {
        labelSegundos.setText(texto);
    }

    public static void setTextoCronometroMinutos(String texto) {
        labelMinutos.setText(texto);
    }

    public static void setTextoCronometroMilisegundos(String texto) {
        labelMiliseg.setText(texto);
    }


    private void labelT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelT1MouseClicked
        //direita empty
        if (getPos(jEmpty).equals(labelT1.getX() + 167 + "," + labelT1.getY())) {
            newX = labelT1.getX() + 167;
            jEmpty.setBounds(labelT1.getX(), labelT1.getY(), 167, 167);
            labelT1.setBounds(newX, labelT1.getY(), 167, 167);
        } //esquerda empty
        else if (getPos(jEmpty).equals(labelT1.getX() - 167 + "," + labelT1.getY())) {
            newX = labelT1.getX() - 167;
            jEmpty.setBounds(labelT1.getX(), labelT1.getY(), 167, 167);
            labelT1.setBounds(newX, labelT1.getY(), 167, 167);
        } //subir empty
        else if (getPos(jEmpty).equals(labelT1.getX() + "," + (labelT1.getY() + 167))) {
            newY = labelT1.getY() + 167;
            jEmpty.setBounds(labelT1.getX(), labelT1.getY(), 167, 167);
            labelT1.setBounds(labelT1.getX(), newY, 167, 167);
        } //descer empty
        else if (getPos(jEmpty).equals(labelT1.getX() + "," + (labelT1.getY() - 167))) {
            newY = labelT1.getY() - 167;
            jEmpty.setBounds(labelT1.getX(), labelT1.getY(), 167, 167);
            labelT1.setBounds(labelT1.getX(), newY, 167, 167);
        }
        if (winCondition()) {
            JOptionPane.showMessageDialog(null, "Parabéns, você venceu!");
            this.dispose();
        }
    }//GEN-LAST:event_labelT1MouseClicked

    private void labelT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelT2MouseClicked

        //direita empty
        if (getPos(jEmpty).equals(labelT2.getX() + 167 + "," + labelT2.getY())) {
            newX = labelT2.getX() + 167;
            jEmpty.setBounds(labelT2.getX(), labelT2.getY(), 167, 167);
            labelT2.setBounds(newX, labelT2.getY(), 167, 167);
        } //esquerda empty
        else if (getPos(jEmpty).equals(labelT2.getX() - 167 + "," + labelT2.getY())) {
            newX = labelT2.getX() - 167;
            jEmpty.setBounds(labelT2.getX(), labelT2.getY(), 167, 167);
            labelT2.setBounds(newX, labelT2.getY(), 167, 167);
        } //subir empty
        else if (getPos(jEmpty).equals(labelT2.getX() + "," + (labelT2.getY() + 167))) {
            newY = labelT2.getY() + 167;
            jEmpty.setBounds(labelT2.getX(), labelT2.getY(), 167, 167);
            labelT2.setBounds(labelT2.getX(), newY, 167, 167);
        } //descer empty
        else if (getPos(jEmpty).equals(labelT2.getX() + "," + (labelT2.getY() - 167))) {
            newY = labelT2.getY() - 167;
            jEmpty.setBounds(labelT2.getX(), labelT2.getY(), 167, 167);
            labelT2.setBounds(labelT2.getX(), newY, 167, 167);
        }
        if (winCondition()) {
            JOptionPane.showMessageDialog(null, "Parabéns, você venceu!");
            this.dispose();
        }
    }//GEN-LAST:event_labelT2MouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void jEmptyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmptyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmptyMouseClicked

    private void labelT3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelT3MouseClicked
        //direita empty
        if (getPos(jEmpty).equals(labelT3.getX() + 167 + "," + labelT3.getY())) {
            newX = labelT3.getX() + 167;
            jEmpty.setBounds(labelT3.getX(), labelT3.getY(), 167, 167);
            labelT3.setBounds(newX, labelT3.getY(), 167, 167);
        } //esquerda empty
        else if (getPos(jEmpty).equals(labelT3.getX() - 167 + "," + labelT3.getY())) {
            newX = labelT3.getX() - 167;
            jEmpty.setBounds(labelT3.getX(), labelT3.getY(), 167, 167);
            labelT3.setBounds(newX, labelT3.getY(), 167, 167);
        } //subir empty
        else if (getPos(jEmpty).equals(labelT3.getX() + "," + (labelT3.getY() + 167))) {
            newY = labelT3.getY() + 167;
            jEmpty.setBounds(labelT3.getX(), labelT3.getY(), 167, 167);
            labelT3.setBounds(labelT3.getX(), newY, 167, 167);
        } //descer empty
        else if (getPos(jEmpty).equals(labelT3.getX() + "," + (labelT3.getY() - 167))) {
            newY = labelT3.getY() - 167;
            jEmpty.setBounds(labelT3.getX(), labelT3.getY(), 167, 167);
            labelT3.setBounds(labelT3.getX(), newY, 167, 167);
        }
        if (winCondition()) {
            JOptionPane.showMessageDialog(null, "Parabéns, ocê venceu!");
            this.dispose();
        }
    }//GEN-LAST:event_labelT3MouseClicked

    private void labelT4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelT4MouseClicked
        //direita empty
        if (getPos(jEmpty).equals(labelT4.getX() + 167 + "," + labelT4.getY())) {
            newX = labelT4.getX() + 167;
            jEmpty.setBounds(labelT4.getX(), labelT4.getY(), 167, 167);
            labelT4.setBounds(newX, labelT4.getY(), 167, 167);
        } //esquerda empty
        else if (getPos(jEmpty).equals(labelT4.getX() - 167 + "," + labelT4.getY())) {
            newX = labelT4.getX() - 167;
            jEmpty.setBounds(labelT4.getX(), labelT4.getY(), 167, 167);
            labelT4.setBounds(newX, labelT4.getY(), 167, 167);
        } //subir empty
        else if (getPos(jEmpty).equals(labelT4.getX() + "," + (labelT4.getY() + 167))) {
            newY = labelT4.getY() + 167;
            jEmpty.setBounds(labelT4.getX(), labelT4.getY(), 167, 167);
            labelT4.setBounds(labelT4.getX(), newY, 167, 167);
        } //descer empty
        else if (getPos(jEmpty).equals(labelT4.getX() + "," + (labelT4.getY() - 167))) {
            newY = labelT4.getY() - 167;
            jEmpty.setBounds(labelT4.getX(), labelT4.getY(), 167, 167);
            labelT4.setBounds(labelT4.getX(), newY, 167, 167);
        }
        if (winCondition()) {
            JOptionPane.showMessageDialog(null, "Parabéns, você venceu!");
            this.dispose();
        }
    }//GEN-LAST:event_labelT4MouseClicked

    private void labelT5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelT5MouseClicked
        //direita empty
        if (getPos(jEmpty).equals(labelT5.getX() + 167 + "," + labelT5.getY())) {
            newX = labelT5.getX() + 167;
            jEmpty.setBounds(labelT5.getX(), labelT5.getY(), 167, 167);
            labelT5.setBounds(newX, labelT5.getY(), 167, 167);
        } //esquerda empty
        else if (getPos(jEmpty).equals(labelT5.getX() - 167 + "," + labelT5.getY())) {
            newX = labelT5.getX() - 167;
            jEmpty.setBounds(labelT5.getX(), labelT5.getY(), 167, 167);
            labelT5.setBounds(newX, labelT5.getY(), 167, 167);
        } //subir empty
        else if (getPos(jEmpty).equals(labelT5.getX() + "," + (labelT5.getY() + 167))) {
            newY = labelT5.getY() + 167;
            jEmpty.setBounds(labelT5.getX(), labelT5.getY(), 167, 167);
            labelT5.setBounds(labelT5.getX(), newY, 167, 167);
        } //descer empty
        else if (getPos(jEmpty).equals(labelT5.getX() + "," + (labelT5.getY() - 167))) {
            newY = labelT5.getY() - 167;
            jEmpty.setBounds(labelT5.getX(), labelT5.getY(), 167, 167);
            labelT5.setBounds(labelT5.getX(), newY, 167, 167);
        }
        if (winCondition()) {
            JOptionPane.showMessageDialog(null, "Parabéns, você venceu!");
            this.dispose();
        }
    }//GEN-LAST:event_labelT5MouseClicked

    private void labelT6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelT6MouseClicked
        //direita empty
        if (getPos(jEmpty).equals(labelT6.getX() + 167 + "," + labelT6.getY())) {
            newX = labelT6.getX() + 167;
            jEmpty.setBounds(labelT6.getX(), labelT6.getY(), 167, 167);
            labelT6.setBounds(newX, labelT6.getY(), 167, 167);
        } //esquerda empty
        else if (getPos(jEmpty).equals(labelT6.getX() - 167 + "," + labelT6.getY())) {
            newX = labelT6.getX() - 167;
            jEmpty.setBounds(labelT6.getX(), labelT6.getY(), 167, 167);
            labelT6.setBounds(newX, labelT6.getY(), 167, 167);
        } //subir empty
        else if (getPos(jEmpty).equals(labelT6.getX() + "," + (labelT6.getY() + 167))) {
            newY = labelT6.getY() + 167;
            jEmpty.setBounds(labelT6.getX(), labelT6.getY(), 167, 167);
            labelT6.setBounds(labelT6.getX(), newY, 167, 167);
        } //descer empty
        else if (getPos(jEmpty).equals(labelT6.getX() + "," + (labelT6.getY() - 167))) {
            newY = labelT6.getY() - 167;
            jEmpty.setBounds(labelT6.getX(), labelT6.getY(), 167, 167);
            labelT6.setBounds(labelT6.getX(), newY, 167, 167);
        }
        if (winCondition()) {
            JOptionPane.showMessageDialog(null, "Parabéns, você venceu!");
            this.dispose();
        }
    }//GEN-LAST:event_labelT6MouseClicked

    private void labelT7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelT7MouseClicked
        //direita empty
        if (getPos(jEmpty).equals(labelT7.getX() + 167 + "," + labelT7.getY())) {
            newX = labelT7.getX() + 167;
            jEmpty.setBounds(labelT7.getX(), labelT7.getY(), 167, 167);
            labelT7.setBounds(newX, labelT7.getY(), 167, 167);
        } //esquerda empty
        else if (getPos(jEmpty).equals(labelT7.getX() - 167 + "," + labelT7.getY())) {
            newX = labelT7.getX() - 167;
            jEmpty.setBounds(labelT7.getX(), labelT7.getY(), 167, 167);
            labelT7.setBounds(newX, labelT7.getY(), 167, 167);
        } //subir empty
        else if (getPos(jEmpty).equals(labelT7.getX() + "," + (labelT7.getY() + 167))) {
            newY = labelT7.getY() + 167;
            jEmpty.setBounds(labelT7.getX(), labelT7.getY(), 167, 167);
            labelT7.setBounds(labelT7.getX(), newY, 167, 167);
        } //descer empty
        else if (getPos(jEmpty).equals(labelT7.getX() + "," + (labelT7.getY() - 167))) {
            newY = labelT7.getY() - 167;
            jEmpty.setBounds(labelT7.getX(), labelT7.getY(), 167, 167);
            labelT7.setBounds(labelT7.getX(), newY, 167, 167);
        }
        if (winCondition()) {
            JOptionPane.showMessageDialog(null, "Parabéns, você venceu!");
            this.dispose();
        }
    }//GEN-LAST:event_labelT7MouseClicked

    private void labelT8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelT8MouseClicked
        //direita empty
        if (getPos(jEmpty).equals(labelT8.getX() + 167 + "," + labelT8.getY())) {
            newX = labelT8.getX() + 167;
            jEmpty.setBounds(labelT8.getX(), labelT8.getY(), 167, 167);
            labelT8.setBounds(newX, labelT8.getY(), 167, 167);
        } //esquerda empty
        else if (getPos(jEmpty).equals(labelT8.getX() - 167 + "," + labelT8.getY())) {
            newX = labelT8.getX() - 167;
            jEmpty.setBounds(labelT8.getX(), labelT8.getY(), 167, 167);
            labelT8.setBounds(newX, labelT8.getY(), 167, 167);
        } //subir empty
        else if (getPos(jEmpty).equals(labelT8.getX() + "," + (labelT8.getY() + 167))) {
            newY = labelT8.getY() + 167;
            jEmpty.setBounds(labelT8.getX(), labelT8.getY(), 167, 167);
            labelT8.setBounds(labelT8.getX(), newY, 167, 167);
        } //descer empty
        else if (getPos(jEmpty).equals(labelT8.getX() + "," + (labelT8.getY() - 167))) {
            newY = labelT8.getY() - 167;
            jEmpty.setBounds(labelT8.getX(), labelT8.getY(), 167, 167);
            labelT8.setBounds(labelT8.getX(), newY, 167, 167);
        }
        if (winCondition()) {
            JOptionPane.showMessageDialog(null, "Parabéns, você venceu!");
            this.dispose();
        }
    }//GEN-LAST:event_labelT8MouseClicked

    private void sairBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTActionPerformed
        dispose();
    }//GEN-LAST:event_sairBTActionPerformed

    private void refazerBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refazerBTActionPerformed
        labelT1.setBounds(0, 0, 167, 167);
        labelT2.setBounds(167, 0, 167, 167);
        labelT3.setBounds(334, 0, 167, 167);

        labelT4.setBounds(0, 167, 167, 167);
        labelT5.setBounds(167, 167, 167, 167);
        labelT6.setBounds(334, 167, 167, 167);

        labelT7.setBounds(0, 334, 167, 167);
        labelT8.setBounds(167, 334, 167, 167);
        jEmpty.setBounds(334, 334, 167, 167);
        
        labelMiliseg.setText("000");
        labelMinutos.setText("00");
        labelSegundos.setText("00");
        
        timer.cancel();

        timer = new Timer();
        timerTask = new Cronometro();
        timer.scheduleAtFixedRate(timerTask, 0, 1);
    }//GEN-LAST:event_refazerBTActionPerformed

    public String getPos(JLabel label) {
        String pos = label.getX() + "," + label.getY();
        return pos;
    }

    public boolean winCondition() {

        if (getPos(labelT3).equals("0,0")
                && getPos(labelT1).equals("167,0")
                && getPos(labelT8).equals("334,0")
                && getPos(labelT6).equals("0,167")
                && getPos(labelT5).equals("167,167")
                && getPos(labelT4).equals("334,167")
                && getPos(labelT7).equals("0,334")
                && getPos(labelT2).equals("167,334")) {

            timer.cancel();
            rankingDao.imagemEasy();

            return true;
        }

        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jEmpty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private static java.awt.Label labelMiliseg;
    private static java.awt.Label labelMinutos;
    private static java.awt.Label labelSegundos;
    private javax.swing.JLabel labelT1;
    private javax.swing.JLabel labelT2;
    private javax.swing.JLabel labelT3;
    private javax.swing.JLabel labelT4;
    private javax.swing.JLabel labelT5;
    private javax.swing.JLabel labelT6;
    private javax.swing.JLabel labelT7;
    private javax.swing.JLabel labelT8;
    private javax.swing.JButton refazerBT;
    private javax.swing.JButton sairBT;
    // End of variables declaration//GEN-END:variables

}
