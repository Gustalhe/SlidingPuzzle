/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quebracabeca;


import java.applet.Applet;
import static java.applet.Applet.newAudioClip;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author IFPR
 */
public class FormFirstMenu extends javax.swing.JFrame {

    public FormFirstMenu() throws ParseException {
        formMenu = new FormMenu(this);
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        painelInternoMenu.setBackground(Color.CYAN);
        getContentPane().setBackground(Color.DARK_GRAY);
        
        audio.loop();
    }   

        URL url = getClass().getResource("PuzzleBobble.wav");
        AudioClip audio = Applet.newAudioClip(url);
    
    public static String nomeUsuario;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInternoMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        soundOnBT = new javax.swing.JButton();
        soundOffBT = new javax.swing.JButton();
        salvarBT = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelInternoMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Press Start 2P", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontes/Logos-Registry-Editor-icon.png"))); // NOI18N
        jLabel1.setText(" Sliding Puzzle ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontes/Logos-Registry-Editor-icon.png"))); // NOI18N

        nomeTF.setFont(new java.awt.Font("Press Start 2P", 0, 10)); // NOI18N
        nomeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTFActionPerformed(evt);
            }
        });
        nomeTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeTFKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Press Start 2P", 0, 10)); // NOI18N
        jLabel3.setText("Nome/Apelido: ");

        jLabel4.setFont(new java.awt.Font("Press Start 2P", 0, 11)); // NOI18N
        jLabel4.setText("Opções de som:");

        soundOnBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontes/sound-icon.png"))); // NOI18N
        soundOnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundOnBTActionPerformed(evt);
            }
        });

        soundOffBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontes/sound-off-icon.png"))); // NOI18N
        soundOffBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundOffBTActionPerformed(evt);
            }
        });

        salvarBT.setFont(new java.awt.Font("Press Start 2P", 0, 11)); // NOI18N
        salvarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontes/Arrow-Forward-2-icon.png"))); // NOI18N
        salvarBT.setText("Salvar");
        salvarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInternoMenuLayout = new javax.swing.GroupLayout(painelInternoMenu);
        painelInternoMenu.setLayout(painelInternoMenuLayout);
        painelInternoMenuLayout.setHorizontalGroup(
            painelInternoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInternoMenuLayout.createSequentialGroup()
                .addGroup(painelInternoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInternoMenuLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel4))
                    .addGroup(painelInternoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelInternoMenuLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(soundOnBT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soundOffBT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelInternoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelInternoMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelInternoMenuLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(painelInternoMenuLayout.createSequentialGroup()
                .addGroup(painelInternoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInternoMenuLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel3))
                    .addGroup(painelInternoMenuLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(salvarBT)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelInternoMenuLayout.setVerticalGroup(
            painelInternoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInternoMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInternoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelInternoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soundOffBT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(soundOnBT, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33)
                .addComponent(salvarBT)
                .addGap(51, 51, 51))
        );

        painelInternoMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        painelInternoMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {salvarBT, soundOffBT, soundOnBT});

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Production by:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gustavo Moreira Lopes");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dominique Kellen Esteves da Silva");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cauã Gomes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelInternoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(painelInternoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void salvarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBTActionPerformed

        if (!nomeTF.getText().isEmpty()) {
            nomeUsuario = nomeTF.getText();
            formMenu.setVisible(true);
            nomeTF.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Insira um nickname para continuar!");
        }

    }//GEN-LAST:event_salvarBTActionPerformed

    private void nomeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTFActionPerformed
        nomeUsuario = nomeTF.getText();
    }//GEN-LAST:event_nomeTFActionPerformed

    private void nomeTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!nomeTF.getText().isEmpty()) {
                nomeUsuario = nomeTF.getText();
                formMenu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Insira um nickname para continuar!");
            }
        }
    }//GEN-LAST:event_nomeTFKeyPressed

    private void soundOnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundOnBTActionPerformed
       audio.loop();
    }//GEN-LAST:event_soundOnBTActionPerformed

    private void soundOffBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundOffBTActionPerformed
        audio.stop();
    }//GEN-LAST:event_soundOffBTActionPerformed

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
            java.util.logging.Logger.getLogger(FormFirstMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFirstMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFirstMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFirstMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormFirstMenu().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(FormFirstMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    private FormMenu formMenu;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JPanel painelInternoMenu;
    private javax.swing.JButton salvarBT;
    private javax.swing.JButton soundOffBT;
    private javax.swing.JButton soundOnBT;
    // End of variables declaration//GEN-END:variables
}
