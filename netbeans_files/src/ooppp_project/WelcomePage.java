package ooppp_project;

import javax.swing.JOptionPane;

public class WelcomePage extends javax.swing.JFrame {
    
    /**
     * Creates new form login
     */
    public WelcomePage() {
        initComponents();
        this.setResizable(false);
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
        left = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 153)));
        left.setForeground(new java.awt.Color(204, 51, 255));
        left.setPreferredSize(new java.awt.Dimension(400, 500));

        jButton1.setBackground(new java.awt.Color(102, 0, 204));
        jButton1.setFont(new java.awt.Font("Siyam Rupali", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("I'm an ADMIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 204));
        jButton2.setFont(new java.awt.Font("Siyam Rupali", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("I'm an USER");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 540, 70));

        jLabel6.setBackground(new java.awt.Color(102, 102, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AT Service");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 280, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mapPath.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 240, 180));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 480, 410));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bus logo1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 605));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        adminLogin adminFrame = new adminLogin();
        adminFrame.setLocationRelativeTo(null);
        adminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         login loginFrame=new login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left;
    // End of variables declaration//GEN-END:variables
}
