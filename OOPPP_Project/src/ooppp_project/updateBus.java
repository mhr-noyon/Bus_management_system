package ooppp_project;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class updateBus extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public updateBus() {
        initComponents();
        this.setResizable(false);
        
        jCBBusName.addItem("");
        addItmToJComboBusName();
        
        //addItmToJComboStoppage();
    }
    void addItmToJComboBusName(){
        AutoCompleteDecorator.decorate(jCBBusName);
        //jCBBusName.removeAllItems();
        //jCBBusName.setSelectedIndex(-1);
        Connection con ;
        Statement st;
        ResultSet rs;
        try {
            con = JDBC.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("Select * from Buslist");
            while(rs.next()){
                jCBBusName.addItem(rs.getString("BusName"));
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }
    void addItmToJComboStoppage(){
        
        String stoppageName = (String)jCBBusName.getSelectedItem();
        AutoCompleteDecorator.decorate(jCBStoppage);
       // jCBStoppage.removeAllItems();
       // jCBStoppage.setSelectedIndex(-1);
        Connection con ;
        Statement st;
        ResultSet rs;
        try {
            con = JDBC.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("Select * from "+stoppageName);
            while(rs.next()){
                jCBStoppage.addItem(rs.getString("StationName"));
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
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
        btnRefresh = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        txtNewStoppage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNewDistance = new javax.swing.JTextField();
        jCBBusName = new javax.swing.JComboBox<>();
        jCBStoppage = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setBackground(new java.awt.Color(255, 255, 255));
        left.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        left.setForeground(new java.awt.Color(204, 51, 255));
        left.setPreferredSize(new java.awt.Dimension(400, 500));
        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRefresh.setFont(new java.awt.Font("Siyam Rupali", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnRefresh.setBorder(null);
        btnRefresh.setBorderPainted(false);
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.setDefaultCapable(false);
        btnRefresh.setFocusPainted(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        left.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 40, -1));

        btnUpdate.setBackground(new java.awt.Color(51, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Siyam Rupali", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE STOPPAGE");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 204), new java.awt.Color(255, 0, 204)));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setFocusPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        left.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 200, 40));

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel1.setText("Path:");
        left.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel2.setText("Bus Name: ");
        left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, 30));

        txtPath.setEditable(false);
        txtPath.setBackground(new java.awt.Color(204, 255, 255));
        txtPath.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPath.setFocusable(false);
        txtPath.setRequestFocusEnabled(false);
        txtPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathActionPerformed(evt);
            }
        });
        left.add(txtPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 450, 90));

        txtNewStoppage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNewStoppage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewStoppageActionPerformed(evt);
            }
        });
        left.add(txtNewStoppage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 280, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel5.setText("New Distance: ");
        left.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 160, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel7.setText("---------------------------------------------------------------");
        left.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 460, 30));

        btnDelete.setBackground(new java.awt.Color(102, 102, 255));
        btnDelete.setFont(new java.awt.Font("Siyam Rupali", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204)));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        left.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, 40));

        jLabel8.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel8.setText("Stoppage:");
        left.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 100, 30));

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel10.setText("New Stoppage: ");
        left.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 160, 30));

        txtNewDistance.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNewDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewDistanceActionPerformed(evt);
            }
        });
        left.add(txtNewDistance, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 280, 40));

        jCBBusName.setFont(new java.awt.Font("Open Sans Medium", 0, 18)); // NOI18N
        jCBBusName.setToolTipText("");
        jCBBusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBBusNameActionPerformed(evt);
            }
        });
        jCBBusName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCBBusNameKeyTyped(evt);
            }
        });
        left.add(jCBBusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 280, 40));

        jCBStoppage.setFont(new java.awt.Font("Open Sans Medium", 0, 18)); // NOI18N
        jCBStoppage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCBStoppageFocusGained(evt);
            }
        });
        jCBStoppage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBStoppageMouseClicked(evt);
            }
        });
        jCBStoppage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBStoppageActionPerformed(evt);
            }
        });
        jCBStoppage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCBStoppageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCBStoppageKeyReleased(evt);
            }
        });
        left.add(jCBStoppage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 280, 40));

        jPanel1.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 560, 460));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("UPDATE STOPPAGE");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 260, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bus logo1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 110));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LOG OUT");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 110, 30));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void getPath(Connection con, String busName){
        String path ="";
        Statement st;
        ResultSet rs;
        String queryToRead = "select * from "+busName;
        try {
            System.out.println(""+busName);
            st = con.createStatement();
            rs = st.executeQuery(queryToRead);
            while(rs.next()){
                path += "-->"+rs.getString("StationName");
            }
            txtPath.setText(path);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }
    
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         if(!((String)jCBBusName.getSelectedItem()).equals("") && !((String)jCBStoppage.getSelectedItem()).equals("") 
                 && !txtNewStoppage.getText().equals("") && !txtNewDistance.getText().equals("")){
             int res = JOptionPane.showConfirmDialog(this, "Are you sure to update the bus path?", "CONFIRM", JOptionPane.YES_NO_OPTION);
            if(res==0){
                Connection conn;
                Statement st;
                System.out.println(""+jCBBusName.getSelectedItem());
                //String queryToRead ="select * from BusList where busname = '"+txtBusName.getText()+"'";
                String queryToUpdateStoppage = "update "+((String)jCBBusName.getSelectedItem())+" set StationName = '"+txtNewStoppage.getText()+"' where StationName = '"+((String)jCBStoppage.getSelectedItem())+"'";
                String queryToUpdateDistance = "update "+((String)jCBBusName.getSelectedItem())+" set Distance = "+txtNewDistance.getText()+" where StationName = '"+txtNewStoppage.getText()+"'";
                try {
                    conn= JDBC.getConnection();
                    st = conn.createStatement();
                    getPath(conn,((String)jCBBusName.getSelectedItem()));
                    st.execute(queryToUpdateStoppage);                    
                    st.execute(queryToUpdateDistance);
                   // if(rs.next()){
                        JOptionPane.showMessageDialog(this,"Bus record has been updated.");
                        adminHome adminHomeFrame = new adminHome();
                        adminHomeFrame.setVisible(true);
                        adminHomeFrame.pack();
                        adminHomeFrame.setLocationRelativeTo(null);
                        dispose();
                   // }
                } catch (Exception e) {
                    System.out.println(""+e.getMessage());
                }
            }
            else if(res==1){
            }
        }
        else{
             JOptionPane.showMessageDialog(this,"Please fill all of the textfield!");
       }
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(this, "Are you sure?", "CONFIRM", JOptionPane.YES_NO_OPTION);
            if(res==0){
                adminLogin adminloginFrame=new adminLogin();
                adminloginFrame.setVisible(true);
                adminloginFrame.pack();
                adminloginFrame.setLocationRelativeTo(null);
                this.dispose();
            }
         
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void txtPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathActionPerformed

    private void txtNewStoppageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewStoppageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewStoppageActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        if(!((String)jCBBusName.getSelectedItem()).equals("") && !((String)jCBBusName.getSelectedItem()).equals("")){
            int res = JOptionPane.showConfirmDialog(this, "The stoppage will be removed, Are you sure?", "CONFIRM", JOptionPane.YES_NO_OPTION);
            if(res==0){
                Connection conn;
                Statement st;
                
                //String queryToRead ="select * from BusList where busname = '"+txtBusName.getText()+"'";
                String queryToDeleteStoppage = "Delete from "+((String)jCBBusName.getSelectedItem())+" where StationName = '"+((String)jCBStoppage.getSelectedItem())+"'";
                try {
                    conn= JDBC.getConnection();
                    st = conn.createStatement();
                    getPath(conn,((String)jCBBusName.getSelectedItem()));
                    st.execute(queryToDeleteStoppage);     
                   // if(rs.next()){
                        JOptionPane.showMessageDialog(this,"Deleted Successfully.");
                        getPath(conn,((String)jCBBusName.getSelectedItem()));
                        adminHome adminHomeFrame = new adminHome();
                        adminHomeFrame.setVisible(true);
                        adminHomeFrame.pack();
                        adminHomeFrame.setLocationRelativeTo(null);
                        dispose();
                   // }
                } catch (Exception e) {
                    System.out.println(""+e.getMessage());
                }
            }
            else if(res==1){
            }
        }
        else{
             JOptionPane.showMessageDialog(this,"Please fill all of the textfield!");
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNewDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewDistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewDistanceActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
        if(!((String)jCBBusName.getSelectedItem()).equals("")){
            
                System.out.println(""+jCBBusName.getSelectedItem());
            addItmToJComboStoppage();
            Connection conn;
            try {
                conn= JDBC.getConnection();
                getPath(conn,(String)jCBBusName.getSelectedItem());
            } catch (Exception e) {
                System.out.println(""+e.getMessage());
            }
        }
        else{
             JOptionPane.showMessageDialog(this,"Please enter bus name!");
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        adminHome back=new adminHome();
        back.setVisible(true);
        back.pack();
        back.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jCBBusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBBusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBBusNameActionPerformed

    private void jCBStoppageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBStoppageActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jCBStoppageActionPerformed

    private void jCBBusNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBBusNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBBusNameKeyTyped

    private void jCBStoppageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBStoppageFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCBStoppageFocusGained

    private void jCBStoppageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBStoppageKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCBStoppageKeyReleased

    private void jCBStoppageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBStoppageMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jCBStoppageMouseClicked

    private void jCBStoppageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBStoppageKeyPressed
        // TODO add your handling code here:
        
                
    }//GEN-LAST:event_jCBStoppageKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new updateBus().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCBBusName;
    private javax.swing.JComboBox<String> jCBStoppage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left;
    public javax.swing.JTextField txtNewDistance;
    public javax.swing.JTextField txtNewStoppage;
    public javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}
