/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system;

import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Pushpak
 */
public class studentHome extends javax.swing.JFrame {

    /**
     * Creates new form studentHome
     */
    
    String course;
    String rollno;
    
    public studentHome() {
        initComponents();
    }
    public studentHome(String rollno, String course) {
        initComponents();
        this.course = course;
        this.rollno = rollno;
        jTextField1.setText(course);
        jTextField2.setText(rollno);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Course Name :");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Roll No :");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Branch :");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Name :");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Father's Name :");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Gender :");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField1.setText(" ");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField2.setText(" ");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField3.setText(" ");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField4.setText(" ");

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField5.setText(" ");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField6.setText(" ");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setText("Your Result :");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel9.setText("Total Marks :");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel10.setText("Result : ");

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField9.setText(" ");

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField10.setText(" ");

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField11.setText(" ");

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField12.setText(" ");

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField13.setText(" ");

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField14.setText(" ");

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField15.setText(" ");

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField16.setText(" ");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField8)
                                            .addComponent(jTextField7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(176, 176, 176))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                            .addComponent(jTextField4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","rooT@838083&");
            
            Statement st = con.createStatement();
            
            switch(course){
                case "B.Tech" -> {
                    ResultSet rs = st.executeQuery("Select * from student inner join btech_result where student.rollNo ='"+rollno+"' and btech_result.Roll_No='"+rollno+"'");             
                    ResultSetMetaData rsmd = rs.getMetaData();
                    
                    String c1 = rsmd.getColumnName(8);
                    jTextField9.setText(c1);
                    
                    String c2 = rsmd.getColumnName(9);
                    jTextField10.setText(c2);
                    
                    String c3 = rsmd.getColumnName(10);
                    jTextField11.setText(c3);
                    
                    String c4 = rsmd.getColumnName(11);
                    jTextField12.setText(c4);
                    
                    if(rs.next()){
                        jTextField3.setText(rs.getString(3));
                        jTextField4.setText(rs.getString(4));
                        jTextField5.setText(rs.getString(5));
                        jTextField6.setText(rs.getString(6));
                        
                        jTextField13.setText(rs.getString(8));
                        jTextField14.setText(rs.getString(9));
                        jTextField15.setText(rs.getString(10));
                        jTextField16.setText(rs.getString(11));
                        
                        int s1 = Integer.parseInt(jTextField13.getText());
                        int s2 = Integer.parseInt(jTextField14.getText());
                        int s3 = Integer.parseInt(jTextField15.getText());
                        int s4 = Integer.parseInt(jTextField16.getText());
                        int total = s1+s2+s3+s4;
                        
                        jTextField7.setText(String.valueOf(total));
                        
                        if(s1 < 35 || s2 < 35 || s3 < 35 || s4 < 35)jTextField8.setText("FAIL");
                        else jTextField8.setText("Pass");
                    }
                }
                
                case "M.Tech" -> {
                    ResultSet rs = st.executeQuery("Select * from student inner join mtech_result where student.rollNo ='"+rollno+"' and mtech_result.Roll_No='"+rollno+"'");             
                    ResultSetMetaData rsmd = rs.getMetaData();
                    
                    String c1 = rsmd.getColumnName(8);
                    jTextField9.setText(c1);
                    
                    String c2 = rsmd.getColumnName(9);
                    jTextField10.setText(c2);
                    
                    String c3 = rsmd.getColumnName(10);
                    jTextField11.setText(c3);
                    
                    String c4 = rsmd.getColumnName(11);
                    jTextField12.setText(c4);
                    
                    if(rs.next()){
                        jTextField3.setText(rs.getString(3));
                        jTextField4.setText(rs.getString(4));
                        jTextField5.setText(rs.getString(5));
                        jTextField6.setText(rs.getString(6));
                        
                        jTextField13.setText(rs.getString(8));
                        jTextField14.setText(rs.getString(9));
                        jTextField15.setText(rs.getString(10));
                        jTextField16.setText(rs.getString(11));
                        
                        int s1 = Integer.parseInt(jTextField13.getText());
                        int s2 = Integer.parseInt(jTextField14.getText());
                        int s3 = Integer.parseInt(jTextField15.getText());
                        int s4 = Integer.parseInt(jTextField16.getText());
                        int total = s1+s2+s3+s4;
                        
                        jTextField7.setText(String.valueOf(total));
                        
                        if(s1 < 35 || s2 < 35 || s3 < 35 || s4 < 35)jTextField8.setText("FAIL");
                        else jTextField8.setText("Pass");
                    }
                }
                
                case "B.B.A" -> {
                    ResultSet rs = st.executeQuery("Select * from student inner join bba_result where student.rollNo ='"+rollno+"' and bba_result.Roll_No='"+rollno+"'");             
                    ResultSetMetaData rsmd = rs.getMetaData();
                    
                    String c1 = rsmd.getColumnName(8);
                    jTextField9.setText(c1);
                    
                    String c2 = rsmd.getColumnName(9);
                    jTextField10.setText(c2);
                    
                    String c3 = rsmd.getColumnName(10);
                    jTextField11.setText(c3);
                    
                    String c4 = rsmd.getColumnName(11);
                    jTextField12.setText(c4);
                    
                    if(rs.next()){
                        jTextField3.setText(rs.getString(3));
                        jTextField4.setText(rs.getString(4));
                        jTextField5.setText(rs.getString(5));
                        jTextField6.setText(rs.getString(6));
                        
                        jTextField13.setText(rs.getString(8));
                        jTextField14.setText(rs.getString(9));
                        jTextField15.setText(rs.getString(10));
                        jTextField16.setText(rs.getString(11));
                        
                        int s1 = Integer.parseInt(jTextField13.getText());
                        int s2 = Integer.parseInt(jTextField14.getText());
                        int s3 = Integer.parseInt(jTextField15.getText());
                        int s4 = Integer.parseInt(jTextField16.getText());
                        int total = s1+s2+s3+s4;
                        
                        jTextField7.setText(String.valueOf(total));
                        
                        if(s1 < 35 || s2 < 35 || s3 < 35 || s4 < 35)jTextField8.setText("FAIL");
                        else jTextField8.setText("Pass");
                    }
                }
                
                case "M.B.A" -> {
                    ResultSet rs = st.executeQuery("Select * from student inner join mba_result where student.rollNo ='"+rollno+"' and mba_result.Roll_No='"+rollno+"'");             
                    ResultSetMetaData rsmd = rs.getMetaData();
                    
                    String c1 = rsmd.getColumnName(8);
                    jTextField9.setText(c1);
                    
                    String c2 = rsmd.getColumnName(9);
                    jTextField10.setText(c2);
                    
                    String c3 = rsmd.getColumnName(10);
                    jTextField11.setText(c3);
                    
                    String c4 = rsmd.getColumnName(11);
                    jTextField12.setText(c4);
                    
                    if(rs.next()){
                        jTextField3.setText(rs.getString(3));
                        jTextField4.setText(rs.getString(4));
                        jTextField5.setText(rs.getString(5));
                        jTextField6.setText(rs.getString(6));
                        
                        jTextField13.setText(rs.getString(8));
                        jTextField14.setText(rs.getString(9));
                        jTextField15.setText(rs.getString(10));
                        jTextField16.setText(rs.getString(11));
                        
                        int s1 = Integer.parseInt(jTextField13.getText());
                        int s2 = Integer.parseInt(jTextField14.getText());
                        int s3 = Integer.parseInt(jTextField15.getText());
                        int s4 = Integer.parseInt(jTextField16.getText());
                        int total = s1+s2+s3+s4;
                        
                        jTextField7.setText(String.valueOf(total));
                        
                        if(s1 < 35 || s2 < 35 || s3 < 35 || s4 < 35)jTextField8.setText("FAIL");
                        else jTextField8.setText("Pass");
                    }
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentAdmin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(studentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
