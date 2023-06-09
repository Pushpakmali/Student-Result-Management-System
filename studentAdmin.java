/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Pushpak
 */
public class studentAdmin extends javax.swing.JFrame {

    /**
     * Creates new form studentAdmin
     */
    public studentAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Enter Your Roll No :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, 40));

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 200, 40));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/icons8-search-30.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 140, 40));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/icons8-close-30.png"))); // NOI18N
        jButton3.setText(" Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 140, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel2.setText("Result Portal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 210, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Course :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 80, 40));

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "M.Tech", "B.B.A", "M.B.A" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/student_homePage.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String rollno = jTextField2.getText();
        String course = (String)jComboBox1.getSelectedItem();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","rooT@838083&");
            
            Statement st = con.createStatement();
            
            switch(course){
                case"B.Tech" ->  {
                    ResultSet rs = st.executeQuery("Select * from student inner join btech_result where student.rollNo ='"+rollno+"' and btech_result.Roll_No='"+rollno+"'");
                    if(rs.next()){
                        setVisible(false);
                        new studentHome(rollno,course).setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect Roll No OR Incorrect Course !");
                    }
                }
                
                case"M.Tech" ->  {
                    ResultSet rs = st.executeQuery("Select * from student inner join mtech_result where student.rollNo ='"+rollno+"' and mtech_result.Roll_No='"+rollno+"'");
                    if(rs.next()){
                        setVisible(false);
                        new studentHome(rollno,course).setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect Roll No OR Incorrect Course !");
                    }
                }
                
                case"B.B.A" ->  {
                    ResultSet rs = st.executeQuery("Select * from student inner join bba_result where student.rollNo ='"+rollno+"' and bba_result.Roll_No='"+rollno+"'");
                    if(rs.next()){
                        setVisible(false);
                        new studentHome(rollno,course).setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect Roll No OR Incorrect Course !");
                    }
                }
                
                case"M.B.A" ->  {
                    ResultSet rs = st.executeQuery("Select * from student inner join mba_result where student.rollNo ='"+rollno+"' and mba_result.Roll_No='"+rollno+"'");
                    if(rs.next()){
                        setVisible(false);
                        new studentHome(rollno,course).setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect Roll No OR Incorrect Course !");
                    }
                }
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(studentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
