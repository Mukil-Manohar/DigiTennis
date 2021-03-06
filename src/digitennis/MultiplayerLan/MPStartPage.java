package digitennis.MultiplayerLan;

import digitennis.Utils.Constants;
import digitennis.Utils.LANUtils;

/**
 *
 * @author bayasys
 */
public class MPStartPage extends javax.swing.JFrame {

    /**
     * Creates new form MPStartPage
     */
    public MPStartPage() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_platerAName = new javax.swing.JTextField();
        txt_platerBName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_winScore = new javax.swing.JTextField();
        btn_Start = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_MyIP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Port = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtp_out = new javax.swing.JTextPane();
        btn_StartServer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_ServerIP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ServerPort = new javax.swing.JTextField();
        btn_ConnectServer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Player A ");

        jLabel2.setText("Player B");

        txt_platerAName.setText("Player A");
        txt_platerAName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_platerANameActionPerformed(evt);
            }
        });

        txt_platerBName.setText("Player B");

        jLabel3.setText("Score To Win");

        txt_winScore.setText("5");
        txt_winScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_winScoreActionPerformed(evt);
            }
        });

        btn_Start.setText("START");
        btn_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_winScore))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(txt_platerAName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(txt_platerBName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(btn_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txt_platerAName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_platerBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_winScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(btn_Start)
                .addGap(69, 69, 69))
        );

        jTabbedPane1.addTab("Single Computer", jPanel1);

        jLabel4.setText("My IP");

        txt_MyIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MyIPActionPerformed(evt);
            }
        });

        jLabel5.setText("Port");

        txt_Port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PortActionPerformed(evt);
            }
        });

        txtp_out.setEditable(false);
        jScrollPane1.setViewportView(txtp_out);

        btn_StartServer.setText("Start Server");
        btn_StartServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartServerActionPerformed(evt);
            }
        });

        jLabel6.setText("Server IP");

        txt_ServerIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ServerIPActionPerformed(evt);
            }
        });

        jLabel7.setText("Port");

        txt_ServerPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ServerPortActionPerformed(evt);
            }
        });

        btn_ConnectServer.setText("Connect To Server");
        btn_ConnectServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConnectServerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_MyIP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_StartServer)
                                    .addComponent(txt_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_ConnectServer)
                                    .addComponent(txt_ServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(76, 76, 76))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_MyIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_StartServer))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_ServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_ServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_ConnectServer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("LAN", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_winScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_winScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_winScoreActionPerformed

    private void btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartActionPerformed
        Constants.WIN_SCORE = Integer.parseInt(txt_winScore.getText());
        Constants.PLAYER_A_NAME = txt_platerAName.getText();
        Constants.PLAYER_B_NAME = txt_platerBName.getText();
        digitennis.DIGITennis.InitGame(false);
        this.setVisible(false);

    }//GEN-LAST:event_btn_StartActionPerformed

    private void txt_platerANameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_platerANameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_platerANameActionPerformed

    private void txt_MyIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MyIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MyIPActionPerformed

    private void txt_PortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PortActionPerformed

    private void btn_StartServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartServerActionPerformed
        appendOut("Server Started on :" + txt_MyIP.getText() + " : " + Constants.LAN_PORT);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
        Server.startServer();
//            }
//        }).start();
        Constants.WIN_SCORE = Integer.parseInt(txt_winScore.getText());
        Constants.PLAYER_A_NAME = txt_platerAName.getText();
        Constants.PLAYER_B_NAME = txt_platerBName.getText();
        digitennis.DIGITennis.InitGame(false);
    }//GEN-LAST:event_btn_StartServerActionPerformed

    private void txt_ServerIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ServerIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ServerIPActionPerformed

    private void txt_ServerPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ServerPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ServerPortActionPerformed

    private void btn_ConnectServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConnectServerActionPerformed
        appendOut("Connecting to :" + txt_MyIP.getText() + " : " + Constants.LAN_PORT);
        Constants.WIN_SCORE = Integer.parseInt(txt_winScore.getText());
        Constants.PLAYER_A_NAME = txt_platerAName.getText();
        Constants.PLAYER_B_NAME = txt_platerBName.getText();
        Constants.SERVER_IP = txt_ServerIP.getText();
        digitennis.DIGITennis.InitGame(true);
    }//GEN-LAST:event_btn_ConnectServerActionPerformed

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
            java.util.logging.Logger.getLogger(MPStartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MPStartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MPStartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MPStartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MPStartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ConnectServer;
    private javax.swing.JButton btn_Start;
    private javax.swing.JButton btn_StartServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt_MyIP;
    private javax.swing.JTextField txt_Port;
    private javax.swing.JTextField txt_ServerIP;
    private javax.swing.JTextField txt_ServerPort;
    private javax.swing.JTextField txt_platerAName;
    private javax.swing.JTextField txt_platerBName;
    private javax.swing.JTextField txt_winScore;
    private javax.swing.JTextPane txtp_out;
    // End of variables declaration//GEN-END:variables

    private void init() {
        try {
            this.txt_MyIP.setText(LANUtils.getLANIP());
            this.txt_Port.setText(LANUtils.getLANPort());
            this.txt_ServerPort.setText(LANUtils.getLANPort());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void appendOut(String txt) {
        txtp_out.setText(txtp_out.getText() + "\n" + txt);
    }
}
